package com.kontenery.association.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kontenery.association.model.User;

@Controller
public class ProfileController {

	@RequestMapping(value = "/adminProfile", method = RequestMethod.POST)
	   public String login(@ModelAttribute("profile")User renter, BindingResult result) {
	        
	       System.out.println("Firstname: "  + renter.getFirstName());
	       System.out.println("Lastname: " + renter.getLastName());
	       
	       return "redirect:adminProfile.html";
	   }

	
	@RequestMapping(value = "/adminProfile", method = RequestMethod.GET)
	public ModelAndView adminHome(Locale locale) {
		User admin = new User();
		admin.setFirstName("Jan");
		admin.setLastName("Kowalski");
		admin.setEmail("jan.kowalski@spoldzielania.pl");
		admin.setTelephone("+481234567");
		return new ModelAndView("adminProfile", "command", admin);
	}
}
