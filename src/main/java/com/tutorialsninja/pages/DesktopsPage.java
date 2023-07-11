package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DesktopsPage extends Utility {
    HomePage homePage = new HomePage();


    By desktopsText = (By.xpath("//h2[contains(text(),'Desktops')]"));

    By descending = (By.xpath("//select[@id='input-sort']"));
    By desOder = (By.xpath("//option[contains(text(),'Name (Z - A)')]"));
    By product = (By.xpath("//a[contains(text(),'HP LP3065')]"));
    By hPText = (By.xpath("//h1[normalize-space()='HP LP3065']"));
    By deliveryDateInput = (By.id("input-option225"));
    By currency = (By.xpath("//span[contains(text(),'Currency')]"));
    By currencyChange = (By.xpath("//button[normalize-space()='£Pound Sterling']"));
    By quantity = (By.xpath("//input[@id='input-quantity']"));
    By addToCart = (By.xpath("//button[@id='button-cart']"));
    By successMessage = (By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"));
    By shoppingCart = (By.xpath("//a[contains(text(),'shopping cart')]"));
    By textShoppingCart = (By.xpath("//a[contains(text(),'Shopping Cart')]"));
    By productName = (By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a"));
    By deliveryDate = (By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]"));
    By model = (By.xpath("//td[contains(text(),'Product 21')]"));
    By total = (By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]"));

    public void verifyTheDesktopsText() {
        assertVerifyText(desktopsText, "Desktops", "text not found");
    }


    public void descendingOrder() {
        clickOnElement(descending);

    }

    public String desOderVerify() {
        return getTextFromElement(desOder);
    }

    public void clickOnProduct() {
        clickOnElement(product);
    }

    public void verifyTheTextHp() {
        assertVerifyText(hPText, "HP LP3065", "Text not found");
    }

    public void pickDeliveryDate() {
        WebElement deliveryDate = driver.findElement(deliveryDateInput);
        deliveryDate.clear();
        deliveryDate.sendKeys("2022-11-30");
    }

    public void clickOnCurrencyChange() {
        clickOnElement(currency);
    }

    public void selectCurrencyPound() {
        mouseHoverToElementAndClick(currencyChange);
    }

    public void giveQty() {
        WebElement quantity1 = driver.findElement(quantity);
        quantity1.clear();
        quantity1.sendKeys("1");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyTheMessageSuccessYouHaveAddedHp() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartDisplayIntoSuccessMessage() {
        clickOnElement(shoppingCart);
    }

    public String verifyTheTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String verifyTheProductName() {
        return getTextFromElement(productName);
    }

    public String verifyTheDeliveryDate() {
        return getTextFromElement(deliveryDate);
    }

    public String verifyTheModel() {
        return getTextFromElement(model);
    }

    public String verifyTheTotal() {
        return getTextFromElement(total);
    }


}
