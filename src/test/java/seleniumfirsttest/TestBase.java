package seleniumfirsttest;

import helpers.WebDriverContainer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

public class TestBase {

    WebDriver driver;
    Logger LOG = Logger.getLogger(TestBase.class);

    @BeforeMethod
    public void setUp() {
        driver = WebDriverContainer.getDriver();

        LOG.debug("Opening to the-internet website");
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterMethod
    public void tearDown() {
        LOG.debug("Closing browser");
        WebDriverContainer.closeDriver();
    }
}