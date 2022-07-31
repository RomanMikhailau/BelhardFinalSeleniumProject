package headermenuduckswebsitewithpropertyfiles;

import duckswebsite.object.HomePage;
import org.openqa.selenium.WebDriver;

public class SubCategoryPage extends HomePage {

    public SubCategoryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasOpened() {
        LOG.info("Getting Subcategory Rubber Ducks page loaded status");
        return super.hasOpened(driver, "Subcategory | My Store1");
    }
}
