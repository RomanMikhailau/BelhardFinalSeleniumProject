package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

public class WebDriverContainer {
    private static WebDriver driver;
    protected static Logger LOG = Logger.getLogger(WebDriverContainer.class);

    public static WebDriver getDriver() {
            Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));

            switch (browser) {
                case chrome:
                    driver = new ChromeDriver();
                    LOG.info("Instantiating Chrome driver");
                    break;
            }
            driver.manage().window().maximize();
            return driver;
    }

    public static void closeDriver() {
        LOG.debug("Closing browser");
        driver.close();
        driver = null;
        }
    }



