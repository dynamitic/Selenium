package com.training.scenarios.enrolment;

import com.training.pages.enrolment.EnrolmentPage;
import com.training.pages.login.LoginPage;
import com.training.scenarios.BaseScenario;
import com.training.util.DataProviderFactory;
import com.training.util.PropertyManager;
import com.training.util.RandomGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrolmentSuccessful extends BaseScenario {

    @Test(dataProvider = "BirthDate", dataProviderClass = DataProviderFactory.class)
    public void enrolment(String day, String month, String year) {

        EnrolmentPage enrolmentPage = new EnrolmentPage(driver);

        enrolmentPage.enrolmentAction.clickSignUpButton();

        Assert.assertTrue(enrolmentPage.enrolmentCheck.checkEnrolmentHeader(PropertyManager.enrolmentHeader));

        String firstName = RandomGenerator.randomString(5);
        enrolmentPage.enrolmentAction.setFirstName(firstName);

        String lastName = RandomGenerator.randomString(10);
        enrolmentPage.enrolmentAction.setLastName(lastName);

        enrolmentPage.enrolmentAction.setEmail(RandomGenerator.randomEmail(15));

        String password = RandomGenerator.randomAlphaNumeric(10);
        enrolmentPage.enrolmentAction.setPassword(password);
        enrolmentPage.enrolmentAction.setPasswordAgain(password);

        enrolmentPage.enrolmentAction.clickGender();

        enrolmentPage.enrolmentAction.setBirthDate(day, month, year);

        enrolmentPage.enrolmentAction.acceptContract();

        enrolmentPage.enrolmentAction.clickEnrollButton();

        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.loginCheck.checkUserName(firstName + " " + lastName));
    }


}
