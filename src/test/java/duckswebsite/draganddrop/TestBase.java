package duckswebsite.draganddrop;

import helpers.WebDriverContainer;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
    WebDriver driver;
    Logger LOG = Logger.getLogger(seleniumfirsttest.TestBase.class);

    @BeforeMethod
    public void setUp() {
        driver = WebDriverContainer.getDriver();

        LOG.debug("Opening to the-internet website");
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");
    }

    @AfterMethod
    public void tearDown() {
        LOG.debug("Closing browser");
        WebDriverContainer.closeDriver();
    }
}
