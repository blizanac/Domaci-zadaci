package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {


    @FindBy(id = "name")
    WebElement nameField;
    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement signUpButton;
    @FindBy(xpath = "//div[contains(text(),'Valid email is required')]")
    WebElement emailErrorMessage;
    @FindBy(xpath = "//div[contains(text(),'This field must have no less than 5 characters')]")
    WebElement shortPasswordErrorMessage;
    @FindBy(xpath = "//div[contains(text(),'Passwords must match')]")
    WebElement notMatchPasswordErrorMessage;
    @FindBy(xpath = "//div[contains(text(),'This field is required')]")
    WebElement thisFieldIsRequiredMessage;


    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(),this);
    }


    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public WebElement getEmailErrorMessage() {
        return emailErrorMessage;
    }

    public WebElement getShortPasswordErrorMessage() {
        return shortPasswordErrorMessage;
    }

    public WebElement getNotMatchPasswordErrorMessage() {
        return notMatchPasswordErrorMessage;
    }

    public WebElement getThisFieldIsRequiredMessage() {
        return thisFieldIsRequiredMessage;
    }

    public void open() {
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }

    public void clickEmailField() {
        emailField.click();
    }

    public void clickPasswordField() {
       passwordField.click();
    }

    public void enterName(String name) {
        getNameField().sendKeys(name);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);

    }

    public void enterConfirmPassword(String confirmPassword1) {
        confirmPassword.sendKeys(confirmPassword1);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }


}
