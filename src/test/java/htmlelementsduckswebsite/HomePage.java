package htmlelementsduckswebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class HomePage extends PageBase{

   public HeaderMenu headerMenu;

    protected By successMessage = By.cssSelector(".notice.success");

    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public static void testLogin(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("Danik11092013@gmail.com", "Test123!");
    }
    public boolean successMessageIsVisible() {
        LOG.info("Checking success message");
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean hasOpened(){
        LOG.info("Getting Home Page loaded status");
        return super.hasOpened(driver, "Online Store | My Store1");
    }

}
