package duckswebsite.headermenu;

import duckswebsite.object.HomePage;
import org.openqa.selenium.WebDriver;

public class DeliveryInformationPage extends HomePage {
    public DeliveryInformationPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean hasOpened() {
        LOG.info("Getting Delivery Information page loaded status");
        return super.hasOpened(driver, "Delivery Information | My Store1");
    }
}

