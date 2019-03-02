package com.training.pages.enrolment;

import com.training.interf.pages.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EnrolmentAction implements Action {

    public WebDriver driver;

    public EnrolmentSelector enrolmentSelector;

    EnrolmentAction(WebDriver driver) {
        this.driver = driver;
        enrolmentSelector = new EnrolmentSelector(driver);

    }

    public void clickSignUpButton() {
        enrolmentSelector.signUpButton.click();

    }

    public void setFirstName(String firstName) {
        enrolmentSelector.firstName.sendKeys(firstName);

    }

    public void setLastName(String lastName) {
        enrolmentSelector.lastName.sendKeys(lastName);

    }

    public void setEmail(String email) {
        enrolmentSelector.email.sendKeys(email);

    }

    public void setPassword(String password) {
        enrolmentSelector.password.sendKeys(password);

    }

    public void setPasswordAgain(String password) {
        enrolmentSelector.passwordAgain.sendKeys(password);

    }

    public void clickGender() {
        enrolmentSelector.gender.click();

    }

    public void setBirthDate(String day, String month, String year) {
        enrolmentSelector.birthDay.sendKeys(day);
        enrolmentSelector.birthMonth.sendKeys(month);
        enrolmentSelector.birthYear.sendKeys(year);

    }

    public void acceptContract() {
        Actions actions = new Actions(driver);
        actions.moveToElement(enrolmentSelector.acceptContract).click().perform();
    }

    public void clickEnrollButton() {
        enrolmentSelector.enrollButton.click();

    }
}