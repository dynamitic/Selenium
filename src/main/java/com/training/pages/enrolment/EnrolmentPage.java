package com.training.pages.enrolment;

import com.training.interf.pages.Page;
import org.openqa.selenium.WebDriver;

public class EnrolmentPage implements Page {


    public WebDriver driver;
    public EnrolmentCheck enrolmentCheck;
    public EnrolmentAction enrolmentAction;

    public EnrolmentPage(WebDriver driver) {
        this.driver = driver;
        enrolmentCheck = new EnrolmentCheck(driver);
        enrolmentAction = new EnrolmentAction(driver);
    }
}
