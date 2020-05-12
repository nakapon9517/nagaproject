package com.example.myproject.top;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myproject.constants.Constants;

@Controller
@RequestMapping(value = "/loginAdmin")
public class LoginAdminController {

	@RequestMapping(params = "back", method = RequestMethod.POST)
	public String back(Model model) {

		// modelから取得
		String message = (String)model.getAttribute("message");

		// modelに設定
		model.addAttribute("message", message);
		return Constants.PAGE_INDEX;
	}
}
