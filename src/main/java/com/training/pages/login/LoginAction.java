package com.training.pages.login;

import com.training.interf.pages.Action;
import org.openqa.selenium.WebDriver;

public class LoginAction implements Action {

    public WebDriver driver;
    public LoginSelector loginSelector;

    LoginAction(WebDriver driver) {
        this.driver = driver;
        loginSelector = new LoginSelector(driver);
    }

    public void clickSignIn() {
        loginSelector.singIn.click();
    }

    public void setUsername(String username) {
        loginSelector.userName.sendKeys(username);
    }

    public void setPassword(String password) {
        loginSelector.password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginSelector.loginButton.click();
    }


}
