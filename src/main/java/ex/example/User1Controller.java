package ex.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user1")
public class User1Controller {
	
	@Autowired
	private User1Form repository;
	
	@RequestMapping("")
	public String index() {
		
		List<User1> list=repository.findByName("ロー");
		for(User1 name:list) {
			System.out.println(name.getName());
		}
		return "finished";
	}
	

}
