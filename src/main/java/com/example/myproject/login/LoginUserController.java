package com.example.myproject.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myproject.constants.Constants;

@Controller
@RequestMapping(value = "/loginUser")
public class LoginUserController {

	@RequestMapping(params = "back", method = RequestMethod.POST)
	public String back(Model model) {
		// message に文字を代入
		model.addAttribute("message", "before user");
		return Constants.PAGE_INDEX;
	}
}
