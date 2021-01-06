package co.ho.spex1.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/member/list")
	public String list(Model model) {
		//필요한 것을 기술한다.
		return "member/list";
	}
}
