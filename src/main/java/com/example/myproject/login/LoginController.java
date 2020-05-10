package com.example.myproject.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myproject.constants.Constants;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.POST)
    public void init(Model model) {
        // message に文字を代入
        model.addAttribute("message", "init");
//		return Constants.PAGE_USER;
    }

    @RequestMapping(params = "user", method = RequestMethod.POST)
    public String loginAuthUser(Model model) {
        // message に文字を代入
        model.addAttribute("message", "user");
        return Constants.PAGE_USER;
    }

    @RequestMapping(params = "admin", method = RequestMethod.POST)
    public String loginAuthAdmin(Model model) {
        // message に文字を代入
        model.addAttribute("message", "admina");
        return Constants.PAGE_ADMIN;
    }

}
