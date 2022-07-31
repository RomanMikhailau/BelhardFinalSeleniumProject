import helpers.WebDriverContainer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;

import static duckswebsite.object.HomePage.testLogin;


public class TestBase {
    WebDriver driver;
    Logger LOG = Logger.getLogger(TestBase.class);

    @BeforeMethod
    public void setUp() {
        driver = WebDriverContainer.getDriver();

        LOG.debug("Opening to the-internet website");
        driver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void tearDown() {
        LOG.debug("Closing browser");
        WebDriverContainer.closeDriver();
    }
}
