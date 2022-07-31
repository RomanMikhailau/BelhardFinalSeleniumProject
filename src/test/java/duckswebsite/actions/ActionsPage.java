package duckswebsite.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

public class ActionsPage {
    private By ieIcon = By.name("icon1");
    private By wordIcon = By.name("icon2");
    private By ppIcon = By.name("icon3");

    private WebDriver driver;
    Logger LOG = Logger.getLogger(ActionsPage.class);

    public ActionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getIeIcon() {
        LOG.info("Instantiating ieIcon");
        return ieIcon;
    }

    public By getWordIcon() {
        LOG.info("Instantiating wordIcon");
        return wordIcon;
    }

    public By getPpIcon() {
        LOG.info("Instantiating wordIcon");
        return ppIcon;
    }
    public  void actionsPageDoubleClick() {
        LOG.info("Double clicking icons on the page");
        Actions builder = new Actions(driver);
        builder.doubleClick(driver.findElement(ieIcon)).doubleClick(driver.findElement(wordIcon))
                .doubleClick(driver.findElement(ppIcon)).perform();
    }
}
