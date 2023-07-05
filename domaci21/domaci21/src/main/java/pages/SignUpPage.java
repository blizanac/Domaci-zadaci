package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {

//@FindBy(id="name")

    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPassword;
    private WebElement signUpButton;
    private WebElement emailErrorMessage;
    private WebElement shortPasswordErrorMessage;
    private WebElement notMatchPasswordErrorMessage;
    private WebElement thisFieldIsRequiredMessage;


    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

  public WebElement getNameField(){
        nameField=getDriver().findElement(By.id("name"));
        return nameField;
  }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement getConfirmPassword() {
        confirmPassword = getDriver().findElement(By.id("confirmPassword"));
        return confirmPassword;
    }

    public WebElement getSignUpButton(){
        signUpButton = getDriver().findElement(By.xpath("//button[@type='submit']"));
        return signUpButton;
    }

    public WebElement getEmailErrorMessage(){
        emailErrorMessage = getDriver().findElement(By.xpath("//div[contains(text(),'Valid email is required')]"));
        return emailErrorMessage;
    }
    public WebElement getShortPasswordErrorMessage() {
        shortPasswordErrorMessage=getDriver().findElement(By.xpath("//div[contains(text(),'This field must have no less than 5 characters')]"));
        return shortPasswordErrorMessage;
    }

    public WebElement getNotMatchPasswordErrorMessage(){
        notMatchPasswordErrorMessage = getDriver().findElement(By.xpath("//div[contains(text(),'Passwords must match')]"));
        return notMatchPasswordErrorMessage;
    }

    public WebElement getThisFieldIsRequiredMessage(){
        thisFieldIsRequiredMessage=getDriver().findElement(By.xpath("//div[contains(text(),'This field is required')]"));
        return thisFieldIsRequiredMessage;
    }

    public SignUpPage open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }

    public SignUpPage clickEmailField() {
        getEmailField().click();
        return this;
    }

    public SignUpPage clickPasswordField() {
        getPasswordField().click();
        return this;
    }

    public SignUpPage enterName(String name) {
       getNameField().sendKeys(name);
        return this;
    }

    public  SignUpPage enterEmail(String email) {
        getEmailField().sendKeys(email);
        return this;
    }

    public SignUpPage enterPassword(String password){
        getPasswordField().sendKeys(password);
        return this;
    }

    public SignUpPage enterConfirmPassword (String confirmPassword){
        getConfirmPassword().sendKeys(confirmPassword);
        return this;
    }

    public SignUpPage clickSignUpButton (){
        getSignUpButton().click();
        return this;
    }




}
