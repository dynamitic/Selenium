package com.training.pages.logout;

import com.training.interf.pages.Page;
import org.openqa.selenium.WebDriver;

public class LogoutPage implements Page {
    public WebDriver driver;
    public LogoutAction logoutAction;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        logoutAction = new LogoutAction(driver);
    }
}
