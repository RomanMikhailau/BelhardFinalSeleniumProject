package duckswebsite.draganddrop;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase {

    @Epic("drag-and-drop page")
    @Feature("Getting the boal")
    @Test
    public void getBall() {
        LOG.info("Getting the ball on the drag and drop page");
        DragAndDropPage ball = new DragAndDropPage(driver);
        ball.getBall();
    }
    @Epic("drag-and-drop page")
    @Feature("Getting the goal")
    @Test
    public void getGoal() {
        LOG.info("Getting the goal on the drag and drop page");
        DragAndDropPage goal = new DragAndDropPage(driver);
        goal.getGoal();
    }
    @Epic("drag-and-drop page")
    @Feature("Moving the boal")
    @Test
    public void moveToBall() {
        LOG.info("Moving the ball on the drag and drop page");
        DragAndDropPage moveToBall = new DragAndDropPage(driver);
        moveToBall.moveToBall();
    }
}
