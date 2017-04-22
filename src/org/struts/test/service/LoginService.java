package org.struts.test.service;

import org.struts.test.model.User;

public class LoginService {

    public boolean isLoginValid(User user) {
        return user.getName().equals("name") && user.getPassword().equals("password") ? true : false;
    }

}
