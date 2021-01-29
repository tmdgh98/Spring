package co.ho.spex.emp.web;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import co.ho.spex.emp.service.DeptService;
import co.ho.spex.emp.service.impl.EmpMapper;
import co.ho.spex.emp.vo.DeptVo;
import co.ho.spex.emp.vo.EmpVo;
import co.ho.spex.emp.vo.JobVo;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Controller
public class EmpController {

	@Autowired
	EmpMapper dao;

	@Autowired
	DeptService deptService;

	@ModelAttribute("deptList")
	public List<DeptVo> deptList() {
		return dao.getDept();
	}

	@ModelAttribute("jobList")
	public List<JobVo> jobList() {
		return dao.getJob();
	}

	// 등록페이지
	@RequestMapping("insEmpForm")
	public String insEmpForm(EmpVo vo, Model model) {
		// 부서목록 -> option
		// job목록
		return "emp/empForm";
	}

	// 수정페이지
	@RequestMapping("updEmpForm")
	public String updEmpForm(EmpVo vo, Model model) {
		model.addAttribute("empVo", dao.getEmp(vo));
		return "emp/empForm";
	}

	// 수정,등록 처리
	@RequestMapping("insUpdEmp")
	public String insUpdEmp(EmpVo vo, HttpServletRequest request,
			@RequestParam(required = false) MultipartFile[] uploadfiles) throws IllegalStateException, IOException {
		// 첨부파일 처리
		String path = request.getSession().getServletContext().getRealPath("/resources/images");
		for (MultipartFile uploadfile : uploadfiles) {
			if (uploadfile != null && uploadfile.getSize() > 0) {
				File file = new File(path, uploadfile.getOriginalFilename());
				// rename

				uploadfile.transferTo(file);
				vo.setProfile(uploadfile.getOriginalFilename());
				// file.insert
			}
		}
		System.out.println(vo);
		// 파일명을 보에 담고 insert
		return "emp/empForm";
	}

	// 파일 다운로드
	@RequestMapping("download/{fileName:.+}")
	public void downloadPDFResource(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName) {

		String dataDirectory = request.getSession().getServletContext().getRealPath("/resources/images/");
		// String dataDirectory = "/resources/images";
		Path file = Paths.get(dataDirectory, fileName);
		if (Files.exists(file)) {
			response.setContentType("application/pdf;charset=UTF-8");
			response.addHeader("Content-Disposition", "attachment; filename=" + fileName);
			try {
				Files.copy(file, response.getOutputStream());
				response.getOutputStream().flush();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	// 엑셀출력
	@RequestMapping("deptExcelView.do")
	public ModelAndView excelView(DeptVo vo, HttpServletResponse response) throws IOException {
		List<Map<String, Object>> list = deptService.selectAll(vo);
		HashMap<String, Object> map = new HashMap<String, Object>();
		String[] header = { "departmentId", "부서명", "managerId", "지역" };
		map.put("headers", header);
		map.put("filename", "excel_dept");
		map.put("datas", list);
		return new ModelAndView("commonExcelView", map);
	}

	
	// pdf출력
	@Autowired
	DataSource datasource;
	
	@RequestMapping("report.do" )
	public void report(HttpServletRequest request, HttpServletResponse response
			, @RequestParam(required=false, defaultValue="10") int dept) throws Exception {
		Connection conn = datasource.getConnection();
		// 소스 컴파일 jrxml -> jasper
		InputStream stream = getClass().getResourceAsStream("/reports/empparam.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(stream); // 파라미터 맵
		HashMap<String, Object> map = new HashMap<>();
		map.put("P_DEPARTMENT_ID", dept);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, conn);
		JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
	}

}
