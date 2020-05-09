package com.example.myproject.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	private static final String PAGE_USER = "login/loginUser";
	private static final String PAGE_ADMIN = "login/loginAdmin";

	@RequestMapping(params = "user", method = RequestMethod.POST)
	public String loginAuthUser(Model model) {
		// message に文字を代入
		model.addAttribute("message", "user");
		return PAGE_USER;
	}

	@RequestMapping(params = "admin", method = RequestMethod.POST)
	public String loginAuthAdmin(Model model) {
		// message に文字を代入
		model.addAttribute("message", "admin");
		return PAGE_ADMIN;
	}

}
