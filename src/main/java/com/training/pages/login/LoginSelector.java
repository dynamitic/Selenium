package com.training.pages.login;

import com.training.interf.pages.Selector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class LoginSelector implements Selector {

    public LoginSelector(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "a.btnSignIn")
    public WebElement singIn;

    @FindBy(id = "email")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(css = "div.blockWrap > h2")
    public WebElement loginPageHeader;

    @FindBy(css = "a.menuLink.user")
    public WebElement loginUserName;

    @FindBy(css = "div.myAccount")
    public WebElement myAccount;

    @FindBy(css = "div.inputField.error > div.errorMessage > div.errorText")
    public WebElement loginErrorMessage;
}
