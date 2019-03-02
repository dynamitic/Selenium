package com.training.scenarios.login;

import com.training.pages.login.LoginPage;
import com.training.scenarios.BaseScenario;
import com.training.util.Decryption;
import com.training.util.PropertyManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSuccessful extends BaseScenario {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAction.clickSignIn();
        Assert.assertTrue(loginPage.loginCheck.checkText(PropertyManager.loginPageHeader));
        loginPage.loginAction.setUsername(PropertyManager.userName);
        loginPage.loginAction.setPassword(Decryption.decrypt(PropertyManager.password));
        loginPage.loginAction.clickLoginButton();
        Assert.assertTrue(loginPage.loginCheck.checkUserName(PropertyManager.userNameCheck));
    }


}
