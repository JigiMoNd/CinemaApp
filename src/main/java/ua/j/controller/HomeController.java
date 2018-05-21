package ua.j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.j.entity.Hall;
import ua.j.service.HallService;

@Controller
public class HomeController {

	@Autowired
	private HallService hallService;
	
//	@GetMapping("/")
//	public String showHome( ) {
//		return "home";
//	}

	@GetMapping("/")
	public ModelAndView showHome( ) {
		return new ModelAndView("home");
	}
	

	@GetMapping("/login")
	public ModelAndView showLogin() {
		return new ModelAndView("login");
	}
	
	@GetMapping("/hall/add-hall")
	public String ShowAddHall(Model model) {
		model.addAttribute("hallModel", new Hall());
		
		return "hall/add-hall";
	}
	
	@PostMapping("/hall/add-hall")
	public String saveHall(@ModelAttribute("hallModel") Hall hall) {
		hallService.saveHall(hall);
		
		return "redirect:/hall/add-hall";
	}
}
