package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopAndNotebooksPage laptopAndNotebooksPage = new LaptopAndNotebooksPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverOnDesktopTab();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();
        //  1.3 Verify the text ‘Desktops’
        desktopsPage.verifyTheDesktopsText();

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverOnLaptopsAndNotebookTab();

        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.mouseHoverAndClickOnLaptopsAndNotebookTab();

        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopAndNotebooksPage.verifyLaptopsAndNotebooksText();

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverOnComponents();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.mouseHoverAndClickOnShowAllComponents();
        //3.3 Verify the text ‘Components’
        homePage.verifyComponentsText();
    }
}
