package com.training.pages.logout;

import com.training.interf.pages.Selector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutSelector implements Selector {
    public LogoutSelector(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.logoutBtn")
    public WebElement logoutButton;

}
