package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{

    WebElement singIn ;

    /**
Constructors
     */
    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     Getters
     */
    public WebElement getSingIn() {
        singIn= driver.findElement(By.xpath("//div[@href='body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a']"));
        return singIn;
    }

    /**
     Methods
     */
    public IndexPage SingInButtonClick(){
        getSingIn().click();
        return this;
    }
    public  IndexPage open(){
        getDriver().get("https://magento.softwaretestingboard.com/");
        return this;
    }
}
