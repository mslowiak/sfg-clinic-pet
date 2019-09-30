package org.pet.clinic.web.Controllers;

import lombok.RequiredArgsConstructor;
import org.pet.clinic.data.Services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
@RequiredArgsConstructor
public class VetController {
	
	private final VetService vetService;
	
	@RequestMapping({"","/","/vets","/vets.html"})
	public String listVets(Model model) {
		System.out.println(vetService.findAll());
		model.addAttribute("vets",vetService.findAll());
		return "vets/vets";
	}
}
