package com.training.pages.enrolment;

import com.training.interf.pages.Selector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrolmentSelector implements Selector {

    public EnrolmentSelector(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "h1.hTitle")
    public WebElement enrolmentHeader;

    @FindBy(css = "a.btnSignUp")
    public WebElement signUpButton;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "registrationEmail")
    public WebElement email;

    @FindBy(id = "registrationPassword")
    public WebElement password;

    @FindBy(id = "passwordAgain")
    public WebElement passwordAgain;

    @FindBy(css = "div.genderContainer > div:nth-of-type(1) > label")
    public WebElement gender;

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "birthMonth")
    public WebElement birthMonth;

    @FindBy(id = "birthYear")
    public WebElement birthYear;

    @FindBy(id = "acceptContract")
    public WebElement acceptContract;

    @FindBy(id = "submitButton")
    public WebElement enrollButton;
}
