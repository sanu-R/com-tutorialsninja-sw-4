package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNotebooksPage extends Utility {
    HomePage homePage = new HomePage();
    By laptopsAndNotebooksText = (By.xpath("//h2[text()= 'Laptops & Notebooks']"));

    public void verifyLaptopsAndNotebooksText() {
        assertVerifyText(laptopsAndNotebooksText, "Laptops & Notebooks", "text not found");
    }

    By sortPrice = (By.xpath("//select[@id='input-sort']"));
    By verifyProductArrange = (By.xpath("//option[contains(text(),'Price (High > Low)')]"));
    By currency = (By.xpath("//span[contains(text(),'Currency')]"));
    By currencyChange = (By.xpath("//button[normalize-space()='£Pound Sterling']"));
    By macBook = (By.linkText("MacBook"));
    By macText = (By.xpath("//h1[contains(text(),'MacBook')]"));
    By add = (By.xpath("//button[@id='button-cart']"));
    By messageSuccess = (By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"));
    By shoppingCart = (By.xpath("//a[contains(text(),'shopping cart')]"));
    By shoppingCartText = (By.xpath("//div[@id='content']//h1"));
    By verifyProductName = (By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a"));
    By quan = (By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"));
    By updateTab = (By.xpath("//button[contains(@data-original-title, 'Update')]"));
    By verifyTheModifiedMessage = (By.xpath("//div[@id='checkout-cart']/div[1]"));
    By verifyTotal = (By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]"));
    By conBut = (By.xpath("//a[contains(text(),'Checkout')]"));
    By checkOutButt = (By.xpath("//h1[contains(text(),'Checkout')]"));
    By guestCheck = (By.xpath("//input[@value='guest']"));
    By continueTab = (By.xpath("//input[@id='button-account']"));
    By firstName = (By.xpath("//input[@id='input-payment-firstname']"));
    By lastName = (By.xpath("//input[@id='input-payment-lastname']"));
    By email = (By.xpath("//input[@id='input-payment-email']"));
    By telephone = (By.xpath("//input[@id='input-payment-telephone']"));
    By address = (By.xpath("//input[@id='input-payment-address-1']"));
    By city = (By.xpath("//input[@id='input-payment-city']"));
    By postCode = (By.xpath("//input[@id='input-payment-postcode']"));
    By country = (By.xpath("//select[@id='input-payment-country']"));
    By zone = (By.xpath("//select[@id='input-payment-zone']"));
    By clickOnCon = (By.xpath("//input[@id='button-guest']"));
    By addComment = (By.xpath("//strong[contains(text(),'Add Comments About Your Order')]"));
    By termAndCondition = (By.xpath("//input[@type='checkbox']"));
    By continueButtonPress = (By.xpath("//input[@id='button-payment-method']"));
    By warning = (By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

    public void selectTextHighToLow() {
        selectByVisibleTextFromDropDown(sortPrice, "Price (High > Low)");
    }

    public String verifyProductPriceWillArrangeInHighToLow() {
        return getTextFromElement(verifyProductArrange);
    }

    public void clickOnCurrencyChange() {
        clickOnElement(currency);
    }

    public void selectCurrencyPound() {
        mouseHoverToElementAndClick(currencyChange);
    }

    public void clickProductMacbook() {
        clickOnElement(macBook);
    }

    public String verifyMacBookText() {
        return getTextFromElement(macText);
    }

    public void clickAddToCart() {
        clickOnElement(add);
    }

    public String verifyTextMessageSuccessYouHaveAddedMacbook() {
        return getTextFromElement(messageSuccess);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public void changeQuantity() {
        driver.findElement(quan).clear();
        sendTextToElement(quan, "2");
    }

    public String VerifyTheTextShoppingCart() {
        return getTextFromElement(shoppingCartText);
    }

    public String VerifyTheProductNameMacBook() {
        return getTextFromElement(verifyProductName);
    }

    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
    }

    public String verifyYouHaveModifiedYourShoppingCart() {
        return getTextFromElement(verifyTheModifiedMessage);
    }

    public void verifyTheTotalPrice() {
        assertVerifyText(verifyTotal, "£737.45", "Text not found");
    }

    public void clickOnContButtonForMac() {
        clickOnElement(conBut);
    }

    public void verifyTheTextCheckOut() {
        assertVerifyText(checkOutButt, "Checkout", " Checkout text not found");
    }

    public void clickOnRadioButton() {
        clickOnElement(guestCheck);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    public void fillInMandatoryField() {
        sendTextToElement(firstName, "Rita");
        sendTextToElement(lastName, "Smith");
        sendTextToElement(email, "real1234@gmail.com");
        sendTextToElement(telephone, "09876543234");
        sendTextToElement(address, "10,Downing Street");
        sendTextToElement(city, "London");
        sendTextToElement(postCode, "SW1A 2AA");
        sendTextToElement(country, "United Kingdom");
        selectByVisibleTextFromDropDown(zone, "Berkshire");

    }

    public void clickOnContinueBottom() {
        clickOnElement(clickOnCon);
    }

    public void addCommentThanks() {
        sendTextToElement(addComment, "Thank you.");
    }

    public void termAndConditionCheckBox() {
        clickOnElement(termAndCondition);
    }

    public void continueButtonPressForOnce() {
        clickOnElement(continueButtonPress);

    }

    public void warningMessagePayments() {
        assertVerifyText(warning, "Warning: Payment method required!", "Text not found");
    }


}