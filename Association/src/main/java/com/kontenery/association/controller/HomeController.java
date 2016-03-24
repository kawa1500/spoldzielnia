package com.kontenery.association.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main(Locale locale) {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/userHome", method = RequestMethod.GET)
	public ModelAndView userHome(Locale locale) {
		return new ModelAndView("userHome");
	}
	
	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public ModelAndView adminHome(Locale locale) {
		return new ModelAndView("adminHome");
	}
}
