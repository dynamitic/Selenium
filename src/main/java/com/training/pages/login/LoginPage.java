package com.training.pages.login;

import com.training.interf.pages.Page;
import org.openqa.selenium.WebDriver;

public class LoginPage implements Page {

    public WebDriver driver;
    public LoginCheck loginCheck;
    public LoginAction loginAction;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginCheck = new LoginCheck(driver);
        loginAction = new LoginAction(driver);
    }


}
