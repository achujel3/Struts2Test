package org.struts.test.service;

public class LoginService {

    public boolean isLoginValid(String name, String password) {
        return name.equals("name") && password.equals("password") ? true : false;
    }

}
