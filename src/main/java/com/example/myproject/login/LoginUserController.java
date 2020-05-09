package com.example.myproject.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.myproject.constants.Constants;

@Controller
@RequestMapping(value = "/loginUser")
public class LoginUserController {

	@RequestMapping(method = RequestMethod.GET)
	public String init(Model model, @RequestParam("message") String message) {
		System.out.println(message);
		// message に文字を代入
		model.addAttribute("message", "back");
		return "";
	}

	@RequestMapping(params = "back", method = RequestMethod.POST)
	public String back(Model model) {
		// message に文字を代入
		model.addAttribute("message", "back");
		return Constants.PAGE_INDEX;
	}
}
