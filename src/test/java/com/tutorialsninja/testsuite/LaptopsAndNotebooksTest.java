package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {
    LaptopAndNotebooksPage laptopAndNotebooksPage = new LaptopAndNotebooksPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverOnLaptopsAndNotebookTab();
        //1.2 Click on “Show All Laptops & Notebooks”
        homePage.mouseHoverAndClickOnLaptopsAndNotebookTab();
        //1.3 Select Sort By "Price (High > Low)"
        laptopAndNotebooksPage.selectTextHighToLow();
        //1.4 Verify the Product price will arrange in High to Low order.
        laptopAndNotebooksPage.verifyProductPriceWillArrangeInHighToLow();

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        laptopAndNotebooksPage.clickOnCurrencyChange();
        laptopAndNotebooksPage.selectCurrencyPound();
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.mouseHoverOnLaptopsAndNotebookTab();
        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.mouseHoverAndClickOnLaptopsAndNotebookTab();
        //2.3 Select Sort By "Price (High > Low)"
        laptopAndNotebooksPage.selectTextHighToLow();
        //2.4 Select Product “MacBook”
        laptopAndNotebooksPage.clickProductMacbook();
        //2.5 Verify the text “MacBook”
        String expectedMessage = "MacBook";
        String actualMessage = laptopAndNotebooksPage.verifyMacBookText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text not displayed");
        //2.6 Click on ‘Add To Cart’ button
        laptopAndNotebooksPage.clickAddToCart();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedMessage1 = "You have added MacBook to your shopping cart!";
        String actualMessage1 = laptopAndNotebooksPage.verifyTextMessageSuccessYouHaveAddedMacbook();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Text not displayed");
        //2.8 Click on link “shopping cart” display into success message
        laptopAndNotebooksPage.clickOnShoppingCart();
        //2.9 Verify the text "Shopping Cart"
        //   String expectedMessage2 = "Shopping Cart";
        //   String actualMessage2 = laptopAndNotebooksPage.VerifyTheTextShoppingCart();
        //   Assert.assertEquals(actualMessage2, expectedMessage2, "Text not displayed");
        //2.10 Verify the Product name "MacBook
        String expectedMessage3 = "MacBook";
        String actualMessage3 = laptopAndNotebooksPage.VerifyTheProductNameMacBook();
        Assert.assertEquals(actualMessage3, expectedMessage3, "Text not displayed");
        //2.11 Change Quantity "2"
        laptopAndNotebooksPage.changeQuantity();
        //2.12 Click on “Update” Tab
        laptopAndNotebooksPage.clickOnUpdateTab();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedMessage4 = "Success: You have modified your shopping cart!";
        String actualMessage4 = laptopAndNotebooksPage.verifyYouHaveModifiedYourShoppingCart();
        Assert.assertEquals(actualMessage4, expectedMessage4, "Text not displayed");
        //2.14 Verify the Total £737.45
        laptopAndNotebooksPage.verifyTheTotalPrice();
        //2.15 Click on “Checkout” button
        laptopAndNotebooksPage.clickOnContButtonForMac();
        //2.16 Verify the text “Checkout”
        // laptopAndNotebooksPage.verifyTheTextCheckOut();
        //2.17 Verify the Text “New Customer”
        //2.18 Click on “Guest Checkout” radio button
        laptopAndNotebooksPage.clickOnRadioButton();
        //2.19 Click on “Continue” tab
        laptopAndNotebooksPage.clickOnContinueTab();
        //2.20 Fill the mandatory fields
        laptopAndNotebooksPage.fillInMandatoryField();
        //2.21 Click on “Continue” Button
        laptopAndNotebooksPage.clickOnContinueBottom();
        //2.22 Add Comments About your order into text area
        laptopAndNotebooksPage.addCommentThanks();
        //2.23 Check the Terms & Conditions check box
        laptopAndNotebooksPage.termAndConditionCheckBox();
        //2.24 Click on “Continue” button
        laptopAndNotebooksPage.continueButtonPressForOnce();
        //2.25 Verify the message “Warning: Payment method required!”
        laptopAndNotebooksPage.warningMessagePayments();
    }


}
