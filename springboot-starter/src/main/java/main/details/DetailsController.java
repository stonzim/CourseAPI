package main.details;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DetailsController {
	@RequestMapping("/details")
	public String welcome() {
		return "User Details";
	}
}
