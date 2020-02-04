package ex.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author namikitsubasa
 *
 */
@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	/**ホーム画面を表示*/
	@RequestMapping("")
	public String index() {

		return "exam01";
	}

	/**計算結果画面を表示*/
	@RequestMapping("/result")
	public String result(String name, Model model) {
		model.addAttribute("name", name);
		return "exam01-result";
	}
}
