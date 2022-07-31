package duckswebsite.actions;

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
        driver.get("http://www.pbclibrary.org/mousing/click3.htm");
    }

    @AfterMethod
    public void tearDown() {
        LOG.debug("Closing browser");
        WebDriverContainer.closeDriver();
    }
}
