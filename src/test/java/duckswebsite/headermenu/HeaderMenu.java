package duckswebsite.headermenu;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HeaderMenu {
    private By homeLink = By.cssSelector(".fa.fa-home");
    private By rubberDucksLink = By.xpath("//*[@id='site-menu']//*[@class='category-1']");
    private By subCategoryLink = By.cssSelector("href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/'");
    private By deliveryInformationLink = By.cssSelector(" .page-2>a");
    private By termsAndConditionsLink = By.cssSelector(" .page-4>a");

    private WebDriver driver;
    Logger LOG = Logger.getLogger(HeaderMenu.class);

    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void rubberDucksLinkClick() {
        LOG.info("Clicking rubber ducks link");
        driver.findElement(rubberDucksLink).click();
    }

    public void subCategoryLinkClick() {
        LOG.info("Clicking subcategory rubber ducks link");
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(rubberDucksLink)).moveByOffset(0, 55).click().perform();

    }

    public void deliveryInformationLinkClick() {
        LOG.info("Clicking delivery information link");
        driver.findElement(deliveryInformationLink).click();
    }

    public void termsAndConditionsLinkClick() {
        LOG.info("Clicking terms&conditions link");
        driver.findElement(termsAndConditionsLink).click();
    }

}
