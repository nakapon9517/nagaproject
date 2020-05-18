package com.example.myproject.login;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm implements Serializable {//Serializable バイナリデータを作ってインスタンスの保存・復元もできちゃう　

	//同一クラスかを判定するもの?Serializableを使う時に必要
    private static final long serialVersionUID = 1L;

    /** ログインID */
    private String uid;
    /** パスワード */
    private String pwd;

}//uidとpwdを取得するための処理が記載されてる？
