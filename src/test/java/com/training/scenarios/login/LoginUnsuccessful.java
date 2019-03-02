package com.training.scenarios.login;

import com.training.pages.login.LoginPage;
import com.training.scenarios.BaseScenario;
import com.training.util.PropertyManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUnsuccessful extends BaseScenario {

    @Test(description = "Invalid Login Scenario with wrong username and password")
    public void loginWithInvalidCredentials() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAction.clickSignIn();
        Assert.assertTrue(loginPage.loginCheck.checkText(PropertyManager.loginPageHeader));
        loginPage.loginAction.setUsername(PropertyManager.invalidUserName);
        loginPage.loginAction.setPassword(PropertyManager.invalidPassword);
        loginPage.loginAction.clickLoginButton();
        Assert.assertTrue(loginPage.loginCheck.checkErrorMessage(PropertyManager.loginErrorMessage));
    }

}
