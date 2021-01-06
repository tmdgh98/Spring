package co.ho.spex1.border;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BorderController {

	@RequestMapping("/border/list")
	public String list(Model model) {
		//필요한 모델을 기술하면 된다.
		
		return "border/list";
	}
	
	@RequestMapping("/border/write")
	public String write(Model model) {
		//필요한 모델을 기술하면 된다.
		
		return "border/write";
	}
}
