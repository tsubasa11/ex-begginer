package ex.example;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author namikitsubasa
 *
 */
@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	
	/**exam03.htmlを表示*/
	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	/**exam03.htmlで入力された合計金額を表示*/
	@RequestMapping("/result")
	public String result(Integer item1, Integer item2, Integer item3) {
		int total = item1+item2+item3;
		application.setAttribute("total",total);
		application.setAttribute("totalInTax", total*1.1);
		
		return "exam03-result";
	}
}
