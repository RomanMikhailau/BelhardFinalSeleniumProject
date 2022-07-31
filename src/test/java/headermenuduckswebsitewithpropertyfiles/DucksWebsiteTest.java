package headermenuduckswebsitewithpropertyfiles;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DucksWebsiteTest extends TestBase {

    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void rubberDucksLinkTest() throws Exception {
        LOG.info("Opening Rubber Ducks page");
        HeaderMenu rubberDucksLink = new HeaderMenu(driver);
        rubberDucksLink.rubberDucksLinkClick();
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        Assert.assertTrue(rubberDucksPage.hasOpened(), "Page has not opened");

    }
    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void SubCategoryLinkTest() throws Exception {
        LOG.info("Opening Subcategory Rubber Ducks page");
        HeaderMenu subCategoryLink = new HeaderMenu(driver);
        subCategoryLink.subCategoryLinkClick();
        SubCategoryPage subCategoryPage = new SubCategoryPage(driver);
        Assert.assertTrue(subCategoryPage.hasOpened(), "Page has not opened");
    }
    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void deliveryInformationLinkTest() throws Exception {
        LOG.info("Opening Delivery Information  page");
        HeaderMenu deliveryInformationLink = new HeaderMenu(driver);
        deliveryInformationLink.deliveryInformationLinkClick();
        DeliveryInformationPage deliveryInformationPage = new DeliveryInformationPage(driver);
        Assert.assertTrue(deliveryInformationPage.hasOpened(), "Page has not opened");
    }
    @Epic("Ducks website")
    @Feature("Opening page")
    @Test
    public void termsAndConditionsLinkTest() throws Exception {
        LOG.info("Opening Terms&Conditions page");
        HeaderMenu termsAndConditionsLink = new HeaderMenu(driver);
        termsAndConditionsLink.termsAndConditionsLinkClick();
        TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);
        Assert.assertTrue(termsAndConditionsPage.hasOpened(), "Page has not opened");

    }
    @Epic("Ducks website")
    @Feature("Checking sorted ducks")
    @Test
    public void isOpenedPageSortByNameTrue() throws Exception {
        LOG.info("Checking sorted ducks by label");
        SortedMenu name = new SortedMenu();
        HeaderMenu subCategoryLink = new HeaderMenu(driver);
        subCategoryLink.subCategoryLinkClick();
        name.getDuckLabel(driver, "Yellow Duck");
        Assert.assertEquals(name.getDuckLabel(driver, "Yellow Duck"), "SALE", "Something went wrong");
    }
    @Epic("Ducks website")
    @Feature("Checking sorted ducks")
    @Test
    public void isOpenedPageSortByPriceTrue() throws Exception {
        LOG.info("Checking sorted ducks by price");
        SortedMenu price = new SortedMenu();
        HeaderMenu subCategoryLink = new HeaderMenu(driver);
        subCategoryLink.subCategoryLinkClick();
        price.getDuckPrice(driver, "Yellow Duck");
        Assert.assertEquals(price.getDuckPrice(driver, "Yellow Duck"), "13.14 €");
    }
}
