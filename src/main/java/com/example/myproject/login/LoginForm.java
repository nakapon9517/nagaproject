package com.example.myproject.login;


import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ログインID */
    private String uid;
    /** パスワード */
    private String pwd;
}