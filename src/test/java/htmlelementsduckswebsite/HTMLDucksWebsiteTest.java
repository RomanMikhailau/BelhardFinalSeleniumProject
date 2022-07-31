package htmlelementsduckswebsite;

import helpers.WebDriverContainer;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HTMLDucksWebsiteTest extends TestBase {

    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void rubberDucksLinkTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.headerMenu.rubberDucksButtonClick();
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.hasOpened(),"Page has not opened");
    }
    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void SubCategoryLinkTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.headerMenu.subCategoryMenuItemClick();
        SubCategoryPage subCategoryPage = new SubCategoryPage(driver);
        Assert.assertTrue(subCategoryPage.hasOpened(), "Page has not opened");
    }
    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void deliveryInformationLinkTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.headerMenu.deliveryInformationButtonClick();
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);
        Assert.assertTrue(deliveryInformationPage.hasOpened(), "Page has not opened");
    }
    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void termsAndConditionsLinkTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.headerMenu.termsAndConditionsButtonClick();
        TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);
        Assert.assertTrue(termsAndConditionsPage.hasOpened(), "Page has not opened");
    }
    @Epic("Ducks website")
    @Feature("Checking sorted ducks")
    @Test
    public void isOpenedPageSortByNameTrue() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.headerMenu.subCategoryMenuItemClick();
        SortedMenu name = new SortedMenu();
        name.getDuckLabel(driver, "Yellow Duck");
        Assert.assertEquals(name.getDuckLabel(driver, "Yellow Duck"), "SALE", "Something went wrong");
    }
    @Epic("Ducks website")
    @Feature("Checking sorted ducks")
    @Test
    public void isOpenedPageSortByPriceTrue() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.headerMenu.subCategoryMenuItemClick();
        SortedMenu price = new SortedMenu();
        price.getDuckPrice(driver, "Yellow Duck");
        Assert.assertEquals(price.getDuckPrice(driver, "Yellow Duck"), "13.14 €");
    }
}
