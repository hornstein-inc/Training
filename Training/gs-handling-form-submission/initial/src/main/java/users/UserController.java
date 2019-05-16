package users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
	 @GetMapping("/greeting")
	    public String loginForm(Model model) {
	        model.addAttribute("user", new User());
	        System.out.println(model);
	        return "greeting";
	    }

	    @PostMapping("/login")
	    public String loginSubmit(@ModelAttribute User user) {
	    	System.out.println(user);
	    	int random = (int)(Math.random() * 1000 + 1);
	    	user.setId(random);
	        return "index";
	    }
	    
}
