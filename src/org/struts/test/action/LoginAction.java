package org.struts.test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.lang3.StringUtils;
import org.struts.test.model.User;
import org.struts.test.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven{

    private User user;

    public void validate() {
        if (StringUtils.isEmpty(user.getName())) {
            addFieldError("user.name", "Name cannot be empty!");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            addFieldError("user.password", "Password cannot be empty!");
        }
    }

    public String execute() {
        LoginService loginService = new LoginService();
        if (loginService.isLoginValid(getUser())) {
            return "success";
        } else {
            return "failure";
        }

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public Object getModel() {
        return user;
    }
}
