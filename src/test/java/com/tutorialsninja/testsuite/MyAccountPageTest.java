package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        registerPage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        homePage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
       registerPage.verifyTheTextRegisterAccount();


    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        registerPage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”

        homePage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”
        //    registerPage.verifyTheRetuningCustomer();


    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Click on My Account Link.
        registerPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        homePage.selectMyAccountOptions("Register");
        //3.3 Enter First Name
        registerPage.enterFirstName();
        //3.4 Enter Last Name
        registerPage.enterLastName();
        //3.5 Enter Email
        registerPage.enterEmail();
        //3.6 Enter Telephone
        registerPage.enterTelephone();
        //3.7 Enter Password
        registerPage.enterPassword();
        //3.8 Enter Password Confirm
        registerPage.confirmPassword();
        //3.9 Select Subscribe Yes radio button
        registerPage.clickOnRadioButton();
        //3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicy();
        //3.11 Click on Continue button
        registerPage.clickOnContinueButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        //   registerPage.verifyMessageYourAccountHasBeenCreated();
        //3.13 Click on Continue button
        registerPage.clickOnContinueButtonSecond();
        //3.14 Click on My Account Link.
        registerPage.clickOnMyAccountLinkLast();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        homePage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        registerPage.verifyTheLogoutMessage();
        //3.17 Click on Continue button
        registerPage.clickOnLastContinueButton();
    }

}
