package main.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AdminController {
	@RequestMapping("/admin")
	public String welcome() {
		return "Admin Page";
	}
}

