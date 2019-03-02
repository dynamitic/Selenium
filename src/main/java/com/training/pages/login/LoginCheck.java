package com.training.pages.login;


import org.openqa.selenium.WebDriver;
import com.training.interf.pages.Check;

public class LoginCheck implements Check {

    public WebDriver driver;

    public LoginSelector loginSelector;

    LoginCheck(WebDriver driver) {
        this.driver = driver;
        loginSelector = new LoginSelector(driver);
    }

    public boolean checkText(String checkText) {
        String pageHeader = loginSelector.loginPageHeader.getText();

        if (pageHeader.equals((checkText)))
            return true;
        return false;

    }

    public boolean checkUserName(String checkText) {
        String userName = loginSelector.loginUserName.getText();

        if (userName.equals(checkText))
            return true;
        else
            return false;

    }

    public boolean checkErrorMessage(String errorMessage) {
        String loginErrorMessage = loginSelector.loginErrorMessage.getText();

        if (loginErrorMessage.equals(errorMessage))
            return true;
        return false;

    }
}
