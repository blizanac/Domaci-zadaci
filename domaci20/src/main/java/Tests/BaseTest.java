package Tests;

import Pages.IndexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private IndexPage indexPage;

    public IndexPage getIndexPage(){
        return indexPage;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public WebDriverWait getWait(){
        return wait;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chromedriver.driver", "C://Users//HOMEBOX//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


}
