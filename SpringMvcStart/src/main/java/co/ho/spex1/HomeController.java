package co.ho.spex1;


import java.util.Locale;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		
		String str = "환영합니다. 스프링 프레임워크에 온것을!!!!";
		
		model.addAttribute("serverTime",  str);
		
		return "home";
	}
	
}
