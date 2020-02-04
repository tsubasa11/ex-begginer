package ex.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user1")
public class User1Controller {
	
	@Autowired
	private User1Form repository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<User1> nameList=repository.findByName("ロー");
		
		model.addAttribute("nameList", nameList);

		return "exam5-result";
	}
	

}
