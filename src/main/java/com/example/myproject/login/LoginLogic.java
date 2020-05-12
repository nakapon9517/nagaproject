package com.example.myproject.login;

import org.springframework.ui.Model;

import com.example.myproject.constants.Constants;

public class LoginLogic {
	/**
     * ログイン認証を行い、次ページ情報を返却する
     *
     * @param uid
     * @param pwd
     * @param model
     * @return 次ページ名
     */
	public String  loginString(LoginForm form,Model model){
		
		// ログインID
        String uid = form.getUid();
        // パスワード
        String pwd = form.getPwd();

        if ("aaa".equals(uid) && "aa".equals(pwd)) {
            // ユーザaaa
            model.addAttribute("message", "user");
            return Constants.PAGE_USER;
        } else if ("bbb".equals(uid) && "bb".equals(pwd)) {
            // ユーザbbb
            model.addAttribute("message", "admin");
            return Constants.PAGE_ADMIN;
        } else {
            // どちらでもない
            model.addAttribute("message", "error!!!!!!!!");
            return Constants.PAGE_INDEX;
        }
	}
}
