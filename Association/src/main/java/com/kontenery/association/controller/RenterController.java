package com.kontenery.association.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kontenery.association.model.User;

@Controller
public class RenterController {

	@RequestMapping(value = "/adminRenters", method = RequestMethod.GET)
	public ModelAndView adminHome() {
		
			ModelAndView modelAndView = new ModelAndView();
			List<User> listUser = new ArrayList<User>();
			User a = new User();
			a.setFirstName("Jan");
			a.setEmail("kakak@www.com");
			a.setLastName("Kowalski");
			a.setTelephone("+48123456879");
			for(int i=0;i<100;i++)listUser.add(a);
			
			modelAndView.addObject("users", listUser);
			modelAndView.setViewName("adminRenters");
			return modelAndView;
	}
	
	@RequestMapping(value = "/adminRenters/user")
	public ModelAndView getUser(@RequestParam("id") String productId) {
		
			User a = new User();
			a.setFirstName("Jan");
			a.setEmail("kakak@www.com");
			a.setLastName("Kowalski");
			a.setTelephone(productId);
			
			return new ModelAndView("user", "command", a);
	}
}
