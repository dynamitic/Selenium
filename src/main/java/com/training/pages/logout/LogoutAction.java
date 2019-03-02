package com.training.pages.logout;

import com.training.interf.pages.Action;
import com.training.pages.login.LoginSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LogoutAction implements Action {

    public WebDriver driver;

    public LogoutSelector logoutSelector;
    public LoginSelector loginSelector;
    public Actions action;

    LogoutAction(WebDriver driver) {
        this.driver = driver;
        logoutSelector = new LogoutSelector(driver);
        loginSelector = new LoginSelector(driver);
        action = new Actions(driver);
    }

    public void clickLogoutButton() {
        action.moveToElement(loginSelector.myAccount).moveToElement(logoutSelector.logoutButton).
                click().build().perform();
    }
}

