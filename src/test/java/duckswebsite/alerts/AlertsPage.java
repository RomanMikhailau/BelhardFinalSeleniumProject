package duckswebsite.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class AlertsPage {

    By alertButton = By.cssSelector("[onclick='jsAlert()']");
    By confirmButton = By.cssSelector("[onclick='jsConfirm()']");
    By promptButton = By.cssSelector("[onclick='jsPrompt()']");

    private WebDriver driver;
    Logger LOG = Logger.getLogger(AlertsPage.class);

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String alertButtonGetText() {
        LOG.info("Getting alert button text");
        return driver.findElement(alertButton).getText();
    }

    public void alertButtonClick() {
        LOG.info("Clicking alert button");
        driver.findElement(alertButton).click();
    }

    public void alertButtonAccept() {
        LOG.info("Getting alert button accept");
        Alert alertButtonS = driver.switchTo().alert();
        alertButtonS.accept();
    }

    public String confirmButtonGetText() {
        LOG.info("Getting confirm button text");
        return driver.findElement(confirmButton).getText();
    }
    public void confirmButtonClick() {
        LOG.info("Clicking confirm button");
        driver.findElement(confirmButton).click();
    }
    public void confirmButtonAccept() {
        LOG.info("Getting confirm button accept");
        Alert confirmButtonS = driver.switchTo().alert();
        confirmButtonS.accept();
    }

    public String promptButtonGetText() {
        LOG.info("Getting prompt button text");
        return driver.findElement(promptButton).getText();
    }
    public void promptButtonClick() {
        LOG.info("Clicking prompt button");
        driver.findElement(promptButton).click();
    }
    public void promptButtonAccept() {
        LOG.info("Getting prompt button accept");
        Alert promptButtonS = driver.switchTo().alert();
        promptButtonS.accept();
    }

}
