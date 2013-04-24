package controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dtos.Client;

@Controller
public class HomeController {
	@RequestMapping("/test")
	public String handle(Map<String, Object> model) {
		return "index";
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String handle1(Model model) {
		model.addAttribute(new Client());
		return "signUpForm";
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String handleSignUpSubmit(@Valid Client client, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "signUpForm";
		}
		model.addAttribute(client);
		return "redirect:helloNewUser?userName=" + client.getName();		
	}
	
	@RequestMapping(value = "/helloNewUser", method = RequestMethod.GET)
	public String handleSignUpSubmit(@RequestParam("userName") String userName, Model model) {
		model.addAttribute("userName", userName);
		return "helloNewUser";		
	}
	
}
