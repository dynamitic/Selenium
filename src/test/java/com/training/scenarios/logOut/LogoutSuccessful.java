package com.training.scenarios.logOut;

import com.training.pages.logout.LogoutPage;
import com.training.scenarios.BaseScenario;
import org.testng.annotations.Test;

public class LogoutSuccessful extends BaseScenario {

    @Test
    public void logOut() {

        LogoutPage logOutPage = new LogoutPage(driver);

        logOutPage.logoutAction.clickLogoutButton();
    }
}
