package org.struts.test.action;

import org.struts.test.service.LoginService;

public class LoginAction {

    private String name;
    private String password;

    public String execute() {
        LoginService loginService = new LoginService();
        if (loginService.isLoginValid(getName(), getPassword())) {
            return "success";
        } else {
            return "failure";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
