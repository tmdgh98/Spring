package co.ho.spex.member.web;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ho.spex.member.service.MemberService;
import co.ho.spex.member.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService; //MemberServiceImpl 객체를 자동주입
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) throws SQLException{
		ArrayList<MemberVo> members = memberService.memberList();
		
		model.addAttribute("members", members);
		
		return "member/memberList";
	}
	
	@RequestMapping("/memberInsertForm.do")
	public String memberInsertFrom(Model model) {
		return "member/memberInsertForm";
	}
	
	@PostMapping("/memberInsert.do")
	public String memberinsert(MemberVo vo,Model model) throws SQLException {
		String viewPath = null;
		
		int n = memberService.memberInsert(vo);
		
		if(n != 0) viewPath = "redirect:memberList.do"; // 매핑메소드를 호출할때
		else viewPath ="member/memberInsertFail"; // jsp페이지를 호출할때
		
		return viewPath;
	}
	
	@RequestMapping("/memberDelete.do")
	public String memberDelete(MemberVo vo, Model model) throws SQLException {
		int n = memberService.memberDelete(vo);
		return "redirect:memberList.do";
	}
	
	@RequestMapping("/memberUpdateForm.do")
	public String memberUpdateForm(MemberVo vo, Model model) throws SQLException {
		vo = memberService.memberSelect(vo);
		model.addAttribute("member", vo);
		return "member/memberUpdateForm";
	}
	
	@RequestMapping("/memberUpdate.do")
	public String memberUpdate(MemberVo vo, Model model ) throws SQLException {
		int n = memberService.memberUpdate(vo);
		return "redirect:memberList.do";
	}
	
	@RequestMapping("memberLoginForm.do")
	public String memberLoginForm(Model model) {
		
		return "member/memberLoginForm";
	}
	
	@PostMapping("memberLogin.do")
	public String memberLogin(HttpServletRequest request ,MemberVo vo, Model model) throws SQLException {
		HttpSession session = request.getSession(); // 세션
		if(memberService.memberLoginCheck(vo)) {
			return "redirect:memberList.do";
		}else {
			model.addAttribute("result", "fail");
			return "member/memberLoginForm";
		}
	}
}
