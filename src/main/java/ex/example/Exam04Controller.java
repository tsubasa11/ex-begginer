package ex.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**ユーザー登録画面*/
@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUp() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index(Model model) {
		
		return "exam04";
	}

	/**
	 * ユーザーオブジェクトに入力情報入れる
	 * オブジェクトをflashスコープに移し、結果をリダイレクトで表示
	 * */
	@RequestMapping("/result")
	public String result(@Validated UserForm userForm,
			BindingResult result,RedirectAttributes redirectAttributes,Model model) {
		if(result.hasErrors()) {
			return index(model);
		}
		User user=new User();
		user.setName(userForm.getName());
		user.setAge(Integer.parseInt(userForm.getAge()));
		user.setComment(userForm.getComment());
		redirectAttributes.addFlashAttribute("user", user);

		return "redirect:/exam04/result2";
	}
	
	/**入力画面表示*/
	@RequestMapping("/result2")
	public String result2() {
		return "exam04-result";
	}
	
}
