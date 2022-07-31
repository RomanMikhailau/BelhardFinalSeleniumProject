package duckswebsite.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

public class DragAndDropPage {
    private By ball = By.id("ball");
    private By goal = By.id("gate");

    private WebDriver driver;
    Logger LOG = Logger.getLogger(DragAndDropPage.class);

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getBall() {
        LOG.info("Instantiating ball");
        return ball;
    }

    public By getGoal() {
        LOG.info("Instantiating goal");
        return goal;
    }

    public void moveToBall() {
        LOG.info("Moving the ball on the page");
        Actions builder = new Actions(driver);
        builder.clickAndHold(driver.findElement(ball)).moveByOffset(-100, 100).release().perform();
    }
}
