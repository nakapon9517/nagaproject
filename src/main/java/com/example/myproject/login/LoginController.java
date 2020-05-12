package com.example.myproject.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myproject.constants.Constants;

@Controller

public class LoginController {

	@Autowired
	private LoginLogic loginLogic;

	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("form",new LoginForm());
		return Constants.PAGE_INDEX;
	}
	@RequestMapping(value = "/login", params = "auth", method = RequestMethod.POST)
    public String auth(@ModelAttribute LoginForm loginForm, Model model) {
        session.setAttribute("form", loginForm);
        return loginLogic.loginAuth(loginForm, model);
	}

}
