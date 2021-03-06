package com.kontenery.association.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutController {

	@RequestMapping(value = "/adminAbout", method = RequestMethod.GET)
	public ModelAndView adminHome(Locale locale) {
		return new ModelAndView("adminAbout");
	}
}
