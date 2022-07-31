package headermenuduckswebsitewithpropertyfiles;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static helpers.Locators.getLocator;

public class HeaderMenu {
    private WebDriver driver;
    Logger LOG = Logger.getLogger(HeaderMenu.class);

    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void rubberDucksLinkClick() throws Exception {
        LOG.info("Clicking rubber ducks link");
        driver.findElement(getLocator("HeaderMenu.rubberDucksLink")).click();
    }

    public void subCategoryLinkClick() throws Exception {
        LOG.info("Clicking subcategory rubber ducks link");
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(getLocator("HeaderMenu.rubberDucksLink")));
        builder.moveByOffset(0,55).click().perform();

    }

    public void deliveryInformationLinkClick() throws Exception {
        LOG.info("Clicking delivery information link");
        driver.findElement(getLocator("HeaderMenu.deliveryInformationLink")).click();
    }

    public void termsAndConditionsLinkClick() throws Exception {
        LOG.info("Clicking terms&conditions link");
        driver.findElement(getLocator("HeaderMenu.termsAndConditionsLink")).click();
    }

}
