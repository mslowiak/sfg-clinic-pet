package org.pet.clinic.web.Controllers;

import org.pet.clinic.data.Services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {
	
	private final VetService vetService;
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}
	
	@RequestMapping({"","/","/index","/index.html"})
	public String listVets(Model model) {
		System.out.println(vetService.findAll());
		model.addAttribute("vets",vetService.findAll());
		return "vets/index";
	}
}
