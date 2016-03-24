package com.kontenery.association.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kontenery.association.model.Login;

@Controller
public class LoginController {
	
	//obsluga akceptacji danych logowania
	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	   public String login(@ModelAttribute("user")Login login, BindingResult result) {
	        
	       System.out.println("Login: "  + login.getLogin());
	       System.out.println("Password: " + login.getPassword());
	       
	       if(login.getLogin().contains("user")) return "redirect:userHome.html";
	       else if(login.getLogin().contains("admin")) return "redirect:adminHome.html";
	       else return "redirect:login.html";
	   }

	 //wyswietlanie panelu logowania
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public ModelAndView showContacts() {
	       return new ModelAndView("login", "command", new Login());
	   }
	
}
