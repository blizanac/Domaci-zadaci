package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{

    private WebElement singUpbutton;


    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSingUpbutton(){
        singUpbutton = getDriver().findElement(By.cssSelector("#app > div > div > header > div > div.v-toolbar__items > a:nth-child(4) > span"));
        return singUpbutton;
    }


    public IndexPage clickOnSignUpButton(){
        getSingUpbutton().click();
        return this;
    }

    public IndexPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
        return this;
    }


}
