package com.springapp.mvc.services;

import com.springapp.mvc.flow.LoginBean;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public LoginBean create(String userName) {
        LoginBean loginBean = new LoginBean();
        loginBean.setUserName(userName);
        return loginBean;
    }

    public String validateUser(LoginBean loginBean) {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        if (userName.equals("Chandan") && password.equals("TestPassword")) {
            return "true";
        } else {
            return "false";
        }
    }

}
