package co.ho.spex.border.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ho.spex.border.service.BorderService;
import co.ho.spex.border.vo.BorderVo;

@Controller
public class BorderController {
	
	@Autowired
	private BorderService borderService;
	
	@RequestMapping("/border/list")
	public String list(Model model) {
//		BorderService bs = new BorderServiceImpl();
		
		ArrayList<BorderVo> list;
		list = borderService.selectList();
		
		model.addAttribute("borderlist", list);
		return "border/list";
	}
	
	@RequestMapping("/border/input") // 입력폼을 호출한다.
	public String input(Model model) {
		
		return "border/input";
	}
	
	@RequestMapping("/border/borderinput") // DB에 저장하는 메소드
	public String borderinput(BorderVo vo, Model model) {
		int n = 0;
		String viewPage = ""; 
		
		n = borderService.insert(vo);
		
		if(n != 0) {
			viewPage = "border/successinput";
		}else {
			viewPage = "border/failinput";
		}
		
		return viewPage; //입력후 목록으로 돌려준다
	}
}
