package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By desktopsTab = (By.xpath("//ul[@class='nav navbar-nav']//a[text()='Desktops']"));
    By selectShowAllDesktops = (By.xpath("//a[contains(text(),'Show AllDesktops')]"));

    By laptopsAndNotebooksTab = (By.xpath("//a[text()='Laptops & Notebooks']"));
    By selectShowAllLaptopsAndNotebooks = (By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
    By componentsTab = (By.xpath("//a[text()='Components']"));
    By showAllComponents = (By.xpath("//a[text()='Show AllComponents']"));
    By componentText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    public void mouseHoverOnDesktopTab() {
        mouseHoverToElement(desktopsTab);
    }

    public void mouseHoverAndClickOnShowAllDesktops() {
        mouseHoverToElementAndClick(selectShowAllDesktops);
    }

    public void mouseHoverOnLaptopsAndNotebookTab() {
        mouseHoverToElement(laptopsAndNotebooksTab);
    }

    public void mouseHoverAndClickOnLaptopsAndNotebookTab() {
        mouseHoverToElementAndClick(selectShowAllLaptopsAndNotebooks);
    }

    public void mouseHoverOnComponents() {
        mouseHoverToElement(componentsTab);
    }

    public void mouseHoverAndClickOnShowAllComponents() {
        mouseHoverToElementAndClick(showAllComponents);
    }

    public void verifyComponentsText() {
        assertVerifyText(componentText, "Components", "Text not found");

    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

}