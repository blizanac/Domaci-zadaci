package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.IndexPage;
import pages.SignUpPage;

import java.time.Duration;

public class BaseTests {

    private WebDriver driver;
    private WebDriverWait wait;

    private IndexPage indexPage;
    private SignUpPage signUpPage;

    public WebDriver getDriver(){
        return driver;
    }
    public WebDriverWait getWait(){
        return wait;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public SignUpPage getSignUpPage(){
        return signUpPage;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chromedriver.driver", "C://Users//HOMEBOX//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        indexPage = new IndexPage(driver, wait);
        signUpPage = new SignUpPage(driver,wait);
    }

    @AfterClass
    public void close (){
        driver.close();
    }


}
