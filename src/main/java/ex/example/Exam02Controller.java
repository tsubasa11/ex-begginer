package ex.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * exam02.htmlのcontroller
 * @author namikitsubasa
 *
 */
@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@RequestMapping("")
	public String index() {
		
		return "exam02";
	}
	
	@RequestMapping("/result")	
	public String result(Integer num1,Integer num2,Model model) {
		
		return "exam02-result2";
	}
}
