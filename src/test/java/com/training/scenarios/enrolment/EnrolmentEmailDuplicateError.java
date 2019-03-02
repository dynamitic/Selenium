package com.training.scenarios.enrolment;

import com.training.pages.enrolment.EnrolmentPage;
import com.training.scenarios.BaseScenario;
import com.training.util.PropertyManager;
import com.training.util.RandomGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrolmentEmailDuplicateError extends BaseScenario {

    @Test
    public void enrolmentDuplicateEmail() {

        EnrolmentPage enrolmentPage = new EnrolmentPage(driver);

        enrolmentPage.enrolmentAction.clickSignUpButton();

        Assert.assertTrue(enrolmentPage.enrolmentCheck.checkEnrolmentHeader(PropertyManager.enrolmentHeader));

        enrolmentPage.enrolmentAction.setFirstName(RandomGenerator.randomString(5));

        enrolmentPage.enrolmentAction.setLastName(RandomGenerator.randomString(10));

        enrolmentPage.enrolmentAction.setEmail(PropertyManager.userName);

        Assert.assertTrue(enrolmentPage.enrolmentCheck.checkDuplicateError(PropertyManager.duplicateErrorMessage));

    }


}
