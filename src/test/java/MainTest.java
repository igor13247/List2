import org.junit.Test;
import pages.NewPage;

public class MainTest extends BaseTest {

    @Test
    public void stepsOfTest() {
        loginFromMainPage();
        FlightFinderFromMainPage();
    }

    public void loginFromMainPage(){
        NewPage login = new NewPage(driver);
        login.login("test1", "test1");
    }

    public void FlightFinderFromMainPage(){
        NewPage flight = new NewPage(driver);
        flight.FlightFinder();
    }
}

