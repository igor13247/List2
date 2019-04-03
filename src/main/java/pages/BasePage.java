package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitClickable(final WebElement element) {
        Wait<WebDriver> wait =
            new WebDriverWait(driver, 30, 100);
        Function<WebDriver, Boolean> waiting = driver -> element.isDisplayed();

        wait.until(waiting);

    }
}
