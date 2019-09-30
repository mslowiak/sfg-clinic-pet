package org.pet.clinic.web.Controllers;

import lombok.RequiredArgsConstructor;
import org.pet.clinic.data.Services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
@RequiredArgsConstructor
public class OwnerController {
	
	private final OwnerService ownerService;
	
	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners",ownerService.findAll());
		System.out.println(ownerService.findAll().toString());
		return "owners/index";
	}
	
	@RequestMapping("/find")
	public String findOwners() {
		return "notimplemented";
	}
}
