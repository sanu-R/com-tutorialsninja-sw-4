package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    DesktopsPage desktopsPage = new DesktopsPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnDesktopTab();
        //1.2 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.descendingOrder();
        //1.4 Verify the Product will arrange in Descending order.
      desktopsPage.desOderVerify();


    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {

        //2.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnDesktopTab();
        //2.2 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();
        desktopsPage.clickOnCurrencyChange();
        desktopsPage.selectCurrencyPound();
        //2.4 Select product “HP LP3065”
        desktopsPage.clickOnProduct();
        //2.5 Verify the Text "HP LP3065"
      //  desktopsPage.verifyTheTextHp();
        //2.6 Select Delivery Date "2022-11-30"
        desktopsPage.pickDeliveryDate();
        //2.7.Enter Qty "1” using Select class.
        desktopsPage.giveQty();
        //2.8 Click on “Add to Cart” button
        desktopsPage.clickOnAddToCart();
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage1 = "You have added HP LP3065 to your shopping cart!";
       String actualMessage1 = desktopsPage.verifyTheMessageSuccessYouHaveAddedHp();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Text not displayed");
        //2.10 Click on link “shopping cart” display into success message
        desktopsPage.clickOnShoppingCartDisplayIntoSuccessMessage();
        //2.11 Verify the text "Shopping Cart"
        String expectedMessage2 = "Shopping Cart";
        String actualMessage2 = desktopsPage.verifyTheTextShoppingCart();
        Assert.assertEquals(actualMessage2, expectedMessage2, "Text not displayed");
        //2.12 Verify the Product name "HP LP3065"
        String expectedMessage3 = "HP LP3065";
        String actualMessage3 = desktopsPage.verifyTheProductName();
        Assert.assertEquals(actualMessage3, expectedMessage3, "Text not displayed");
        desktopsPage.verifyTheProductName();
        //2.13 Verify the Delivery Date "2022-11-30"
        String expectedMessage4 = "2022-11-30";
        String actualMessage4 = desktopsPage.verifyTheDeliveryDate();
        Assert.assertEquals(actualMessage4, expectedMessage4, "Text not displayed");
        //2.14 Verify the Model "Product21"
        String expectedMessage5 = "Product21";
        String actualMessage5 = desktopsPage.verifyTheModel();
        Assert.assertEquals(actualMessage5, expectedMessage5, "Text not displayed");
        //2.15 Verify the Total "£74.73"
        String expectedMessage6 = "£74.73";
        String actualMessage6 = desktopsPage.verifyTheTotal();
        Assert.assertEquals(actualMessage6, expectedMessage6, "Text not displayed");


    }

}
