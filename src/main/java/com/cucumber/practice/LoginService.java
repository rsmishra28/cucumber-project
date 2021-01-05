package com.cucumber.practice;

import com.bean.LoginInfo;

public class LoginService {
    String username="rsm" ;
    String password="shm" ;

    public String verifyCredential(LoginInfo loginInfo){
        if(username.equals(loginInfo.getUserName()) && password.equals(loginInfo.getPassword())){
            return "welcome" ;
        }
        return "home";
    }
}
