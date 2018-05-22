package ua.j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.j.entity.Hall;
import ua.j.entity.Movie;
import ua.j.entity.Session;
import ua.j.service.HallService;
import ua.j.service.MovieService;
import ua.j.service.SessionService;

@Controller
public class HomeController {

	@Autowired
	private HallService hallService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private SessionService sessionService;
	
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
	
	@GetMapping("/movie/add-movie")
	public String ShowAddMovie(Model model) {
		model.addAttribute("movieModel", new Movie());
		
		return "movie/add-movie";
	}
	
	@PostMapping("/movie/add-movie")
	public String saveMovie(@ModelAttribute("movieModel") Movie movie) {
		movieService.saveMovie(movie);
		
		return "redirect:/movie/add-movie";
	}
	@GetMapping("/session/add-session")
	public String ShowAddSession(Model model) {
		model.addAttribute("sessionModel", new Session());
		model.addAttribute("halls", hallService.findAllHalls());
		model.addAttribute("movies", movieService.findAllMovies());
		
		return "session/add-session";
	}
	
	@PostMapping("/session/add-session")
	public String saveSession(@ModelAttribute("sessionModel") Session session) {
		sessionService.saveSession(session);
		
		return "redirect:/session/add-session";
	}
	
		
	
	
	
	
	
	
	
	
}
