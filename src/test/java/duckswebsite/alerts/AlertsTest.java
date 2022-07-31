package duckswebsite.alerts;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase{

    @Epic("The-internet.herokuapp.com website")
    @Feature("Clicking button and getting accept")
    @Test
    public void alertButtonTest() {

        LOG.info("Clicking alert button and getting alert button accept");
        AlertsPage alertButton = new AlertsPage(driver);
        Assert.assertEquals(alertButton.alertButtonGetText(), "Click for JS Alert");

        alertButton.alertButtonClick();

        alertButton.alertButtonAccept();
    }
    @Epic("The-internet.herokuapp.com website")
    @Feature("Clicking button and getting accept")
    @Test
    public void confirmButtonTest() {
        LOG.info("Clicking confirm button and getting confirm button accept");
        AlertsPage confirmButton = new AlertsPage(driver);
        Assert.assertEquals(confirmButton.confirmButtonGetText(), "Click for JS Confirm");

        confirmButton.confirmButtonClick();

        confirmButton.confirmButtonAccept();
    }
    @Epic("The-internet.herokuapp.com website")
    @Feature("Clicking button and getting accept")
    @Test
    public void promptButtonTest() {
        LOG.info("Clicking prompt button and getting prompt button accept");
        AlertsPage promptButton = new AlertsPage(driver);
        Assert.assertEquals(promptButton.promptButtonGetText(), "Click for JS Prompt");

        promptButton.promptButtonClick();

        promptButton.promptButtonAccept();
    }
}
