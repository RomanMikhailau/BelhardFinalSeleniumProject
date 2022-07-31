package headermenuduckswebsitewithpropertyfiles;

import duckswebsite.object.HomePage;
import org.openqa.selenium.WebDriver;

public class TermsAndConditionsPage extends HomePage {

    public TermsAndConditionsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasOpened() {
        LOG.info("Getting Terms&Conditions page loaded status");
        return super.hasOpened(driver, "Terms & Conditions | My Store1");
    }
}
