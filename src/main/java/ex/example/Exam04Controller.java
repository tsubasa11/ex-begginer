package ex.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUp() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		
		return "exam04";
	}

	@RequestMapping("/result")
	public String result(UserForm userForm) {
		
		return "exam04-result";
	}
	
}
