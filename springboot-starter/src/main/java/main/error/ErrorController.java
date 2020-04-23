package main.error;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ErrorController {
	@RequestMapping("/error")
	public String welcome() {
		return "Ooops - Something went wrong";
	}
}
