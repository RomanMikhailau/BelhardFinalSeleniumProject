package duckswebsite.actions;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class ActionsTest extends TestBase{

    @Epic("The-internet.herokuapp.com website")
    @Feature("Getting icon")
    @Test
    public void actionsIeIconTest() {
        LOG.info("Getting ie icon");
        ActionsPage ieIcon = new ActionsPage(driver);
        ieIcon.getIeIcon();
    }
    @Epic("The-internet.herokuapp.com website")
    @Feature("Getting icon")
    @Test
    public void actionsWordIconTest() {
        LOG.info("Getting word icon");
        ActionsPage wordIcon = new ActionsPage(driver);
        wordIcon.getWordIcon();

    }
    @Epic("The-internet.herokuapp.com website")
    @Feature("Getting icon")
    @Test
    public void actionsPpIconTest() {
        LOG.info("Getting pp icon");
        ActionsPage ppIcon = new ActionsPage(driver);
        ppIcon.getPpIcon();
    }
    @Epic("The-internet.herokuapp.com website")
    @Feature("Double clicking icons")
    @Test
    public void pageDoubleClickTest() {
        LOG.info("Double clicking icons on the page");
        ActionsPage doubleClick = new ActionsPage(driver);
        doubleClick.actionsPageDoubleClick();

    }
}
