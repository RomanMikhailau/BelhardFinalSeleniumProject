package headermenuduckswebsitewithpropertyfiles;

import helpers.ScreenshotListener;
import helpers.WebDriverContainer;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static duckswebsite.object.HomePage.testLogin;


@Listeners(ScreenshotListener.class)
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
        WebDriverContainer.closeDriver();
    }
}
