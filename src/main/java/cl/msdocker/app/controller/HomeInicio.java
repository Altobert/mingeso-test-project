package cl.msdocker.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeInicio {
	
	@GetMapping("/")
	public String inicio() {
		return "inicio";
	}

}
