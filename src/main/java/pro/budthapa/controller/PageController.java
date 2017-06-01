package pro.budthapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	private final String INDEX= "index";
	private final String ABOUT= "about";
	
	@GetMapping("/")
	public String index(){
		return INDEX;
	}
	
	@GetMapping("/about")
	public String about(){
		return ABOUT;
	}
	
}
