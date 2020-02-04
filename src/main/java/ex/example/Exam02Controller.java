package ex.example;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * exam02.htmlのcontroller
 * 
 * @author namikitsubasa
 *
 */
@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {

		return "exam02";
	}

	/**exam02.htmlで入力した数字を計算*/
	@RequestMapping("/result")
	public String result(Integer num1, Integer num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("result", num1 + num2);
		return "exam02-result";
	}
	
	/**exam02-result.htmlからの画面遷移*/
	@RequestMapping("/result2")
	public String result2() {

		return "exam02-result2";
	}
}
