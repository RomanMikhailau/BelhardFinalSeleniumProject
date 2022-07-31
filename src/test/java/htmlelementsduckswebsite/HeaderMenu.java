package htmlelementsduckswebsite;

import helpers.WebDriverContainer;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import static helpers.Locators.getLocator;

@Name("Header menu")
@FindBy(id="site-menu")
public class HeaderMenu extends HtmlElement {

    Logger LOG = Logger.getLogger(HeaderMenu.class);

    @Name("Home button")
    @FindBy(css=".fa.fa-home")
    WebElement homeButton;

    @Name("Rubber ducks button")
    @FindBy(css="[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']")
    WebElement rubberDucksButton;

    @Name("Delivery information button")
    @FindBy(css="[href='https://litecart.stqa.ru/en/delivery-information-i-2']")
    WebElement deliveryInformationButton;

    @Name("Terms and conditions button")
    @FindBy(css="[href='https://litecart.stqa.ru/en/terms-conditions-i-4']")
    WebElement termsAndConditionsButton;

    @Name("Subcategory menu item")
    @FindBy(css="[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']")
    WebElement subCategoryMenuItem;


    public void homeButtonClick() {
        LOG.info("Clicking home button link");
        homeButton.click();
    }

    public void rubberDucksButtonClick() {
        LOG.info("Clicking rubber ducks link");
        rubberDucksButton.click();

    }
    public void subCategoryMenuItemClick() {
        LOG.info("Clicking subcategory rubber ducks link");
        Actions builder = new Actions(WebDriverContainer.getDriver());
        builder.moveToElement(rubberDucksButton).click(subCategoryMenuItem);
    }

    public void deliveryInformationButtonClick() {
        LOG.info("Clicking delivery information link");
        deliveryInformationButton.click();
    }

    public void termsAndConditionsButtonClick() {
        LOG.info("Clicking terms&conditions link");
        termsAndConditionsButton.click();
    }

}
