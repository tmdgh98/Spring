package co.ho.spex.member.web;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.ho.spex.member.service.MemberService;
import co.ho.spex.member.service.impl.MemberMapper;
import co.ho.spex.member.vo.MemberVo;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService; //MemberServiceImpl 객체를 자동주입
	
	@Autowired
	private 
	MemberMapper dao;
	
	@RequestMapping("/ajax/memberList.do")
	@ResponseBody
	public List<MemberVo> ajaxMemberList(MemberVo vo) throws SQLException{
		return memberService.memberList(vo);
	}
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model,@ModelAttribute("vo") MemberVo vo) throws SQLException{
		//ModelAtrribute를 넣으면 변수명을 정할수있다.
		//적지않으면 첫글자가 소문자로 변한 변수명이 된다. memberVo
		List<MemberVo> members = memberService.memberList(vo);
		
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
		System.out.println("-------------------------"+n+"-------------------------------");
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
