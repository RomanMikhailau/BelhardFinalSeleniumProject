package htmlelementsduckswebsite;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortedMenu {

    Logger LOG = Logger.getLogger(SortedMenu.class);
    public String getDuckLabel(WebDriver driver, String duck) {
        LOG.info("Getting ducks label text");
        return driver.findElement(By.cssSelector(String.format("[title='%s'] .sticker", duck))).getText();
    }

    public String getDuckPrice(WebDriver driver, String duck) {
        LOG.info("Getting ducks price");
        return driver.findElement(By.cssSelector(String.format("[title='%s'] .campaign-price", duck))).getText();

    }
}
