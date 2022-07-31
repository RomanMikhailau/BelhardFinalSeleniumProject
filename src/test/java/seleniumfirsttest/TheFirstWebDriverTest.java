package seleniumfirsttest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class TheFirstWebDriverTest extends TestBase {

    @Epic("The-internet.herokuapp.com website")
    @Feature("Getting all links")
    @Test
    public void getAllLinks() {
        LOG.info("Getting all links on the page");
        List<WebElement> allLinksOnThePage = driver.findElements(By.tagName("a"));
        System.out.println("Get all links on the page: ");
        for (WebElement link : allLinksOnThePage) {
            System.out.println(link.getText());
        }
    }
    @Epic("The-internet.herokuapp.com website")
    @Feature("Getting amount links")
    @Test
    public void getLinksSize() {
        LOG.info("Getting amount links on the page");
        List<WebElement> allLinksOnThePage = driver.findElements(By.tagName("a"));
        System.out.println("Amount links on the page: ");
        System.out.println(allLinksOnThePage.size());
    }
    @Epic("The-internet.herokuapp.com website")
    @Feature("Opening link")
    @Test
    public void getLinkNumber10() {
        LOG.info("Opening 10 links on the page");
        System.out.println("Open 10 links on the page");
        WebElement link10 = driver.findElement(By.linkText("Drag and Drop"));
        link10.click();
    }

}