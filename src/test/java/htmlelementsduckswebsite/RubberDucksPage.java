package htmlelementsduckswebsite;

import org.openqa.selenium.WebDriver;

public class RubberDucksPage extends HomePage{

    public RubberDucksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasOpened() {
        LOG.info("Getting Rubber Ducks page loaded status");
        return super.hasOpened(driver, "Rubber Ducks | My Store1");
    }
}
