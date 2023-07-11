package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By myAccount =(By.xpath("//span[contains(text(),'My Account')]"));
    By register = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']"));
    By registerText = (By.xpath("//h1[contains(text(),'Register Account')]"));
By returnCustomer = (By.xpath("//h2[contains(text(),'Returning Customer')]"));
By name = (By.id("input-firstname"));
By surName =(By.id("input-lastname"));
By eMail = (By.id("input-email"));
By telephone =(By.id("input-telephone"));
By passWord = (By.id("input-password"));
By passWordConfirm =(By.id("input-confirm"));
By radioButton = (By.xpath("//label[@class='radio-inline']//input[@value='1']"));
By privacyPolicy = (By.xpath("//input[@type='checkbox']"));
By continueButton =(By.xpath("//div[@class = 'buttons']//input[@value='Continue']"));
By verifyMessageYourAccount =(By.xpath("//h1[text()='Your Account Has Been Created!']"));
By conButton =(By.xpath("//a[contains(text(),'Continue')]"));
By myAccountLink =(By.xpath("//span[contains(text(),'My Account')]"));
By logOut =(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));
By verifyLogoutText =(By.xpath("//h1[contains(text(),'Account Logout')]"));
By lastContinueButt =(By.xpath("//a[contains(text(),'Continue')]"));
public void clickOnMyAccountLink(){
    clickOnElement(myAccount);
}
public void clickOnRegister(){
    clickOnElement(register);
}
public void verifyTheTextRegisterAccount(){
 assertVerifyText(registerText,"Register Account","Text not found");

}

    public void verifyTheRetuningCustomer() {
        assertVerifyText(returnCustomer, "Returning Customer", "Text not found");
    }
public void enterFirstName(){
  sendTextToElement(name,"Rita");
}

    public void enterLastName(){
        sendTextToElement(surName,"Smith");
    }

    public void enterEmail(){
        sendTextToElement(eMail,"real123@gmail.com");
    }

    public void enterTelephone(){
        sendTextToElement(telephone,"09876543234");
    }

    public void enterPassword(){
        sendTextToElement(passWord,"real1234");
    }

    public void confirmPassword(){
        sendTextToElement(passWordConfirm,"real1234");
    }

    public void clickOnRadioButton(){
        clickOnElement(radioButton);
    }

    public void clickOnPrivacyPolicy(){
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void verifyMessageYourAccountHasBeenCreated() {
        assertVerifyText(verifyMessageYourAccount, "Your Account Has Been Created! text not found", "Text not found");
    }

    public void clickOnContinueButtonSecond(){
        clickOnElement(conButton);
    }
    public void clickOnMyAccountLinkLast(){
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut(){
        clickOnElement(logOut);
    }

    public void verifyTheLogoutMessage() {
        assertVerifyText(verifyLogoutText, "Account Logout", "Text not found");
    }
    public void clickOnLastContinueButton(){
        clickOnElement(lastContinueButt);
    }














    }
