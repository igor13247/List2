import logger.EventHandler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseTest {
    EventFiringWebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\наталья\\Desktop\\Это для кота\\chromedriver.exe");

        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventHandler());
        driver.get("http://newtours.demoaut.com");

    }

    @After
    public void tearDown() {
        driver.quit();

    }
}
