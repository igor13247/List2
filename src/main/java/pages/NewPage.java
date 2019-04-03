package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPage extends BasePage{
    @FindBy(xpath = ".//input[@name='userName']")
    WebElement loginField;
    @FindBy(xpath = ".//input[@name='password']")
    WebElement passwordField;
    @FindBy(xpath = ".//input[@name='login']")
    WebElement signInField;
    @FindBy(xpath = ".//input[@name='tripType']")
    WebElement TypeField;
    @FindBy(xpath = ".//option[@value='2']")
    WebElement Passengers;
    @FindBy(xpath = ".//option[@value='Paris']")
    WebElement DepartingFrom ;
    @FindBy(xpath = ".//select[@name='fromMonth']/option[@value='11']")
    WebElement On1;
    @FindBy(xpath = "select[@name='fromDay']/option[@value='20']")
    WebElement On2;
    @FindBy(xpath = "select[@name='toPort']/option[@value='Seattle']")
    WebElement ArrivingIn;
    @FindBy(xpath = "select[@name='toMonth']/option[@value='12']")
    WebElement Returning1;
    @FindBy(xpath = "select[@name='toDay']/option[@value='19']")
    WebElement Returning2;
    @FindBy(xpath = ".//input[@name='servClass']")
    WebElement ServiceClass;
    @FindBy(xpath = ".//select[@option='Pangea Airlines']")
    WebElement Airline;
    @FindBy(xpath = ".//input[@name='findFlights']")
    WebElement Continue;



    public NewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Первая страница, ввод пользователя
    public void login(String login, String pass) {
        waitClickable(signInField);
        loginField.sendKeys(login);
        passwordField.sendKeys(pass);
        signInField.click();
    }

    //Вторая страница FLIGHT FINDER
    public void FlightFinder(){
        TypeField.click();
        Passengers.click();
        DepartingFrom.click();
        On1.click();
        On2.click();
        ArrivingIn.click();
        Returning1.click();
        Returning2.click();
        ServiceClass.click();
        Airline.click();
        Continue.click();
    }
}