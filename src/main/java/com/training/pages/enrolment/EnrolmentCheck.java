package com.training.pages.enrolment;

import com.training.interf.pages.Check;
import org.openqa.selenium.WebDriver;

public class EnrolmentCheck implements Check {

    public WebDriver driver;

    public EnrolmentSelector enrolmentSelector;

    EnrolmentCheck(WebDriver driver) {
        this.driver = driver;
        enrolmentSelector = new EnrolmentSelector(driver);
    }

    public boolean checkEnrolmentHeader(String header) {
        if (enrolmentSelector.enrolmentHeader.getText().equals(header))
            return true;
        return false;
    }

    public boolean checkDuplicateError(String duplicateErrorMessage) {

        if (enrolmentSelector.email.getAttribute("data-remote-message").equals(duplicateErrorMessage))
            return true;
        return false;
    }

}

