package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest extends tests.BaseTests {


    @Test
    public void verifyCurrentUrl() {
        getIndexPage().open();
        getIndexPage().clickOnSignUpButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }

    @Test
    public void verifyTypeOfEmailField() {
        getSignUpPage().open();
        getSignUpPage().clickEmailField();
        Assert.assertEquals(getSignUpPage().getEmailField().getAttribute("type"), "email");

    }

    @Test
    public void verifyTypeOfPasswordField() {
        getSignUpPage().open();
        getSignUpPage().clickPasswordField();
        Assert.assertEquals(getSignUpPage().getPasswordField().getAttribute("type"), "password");
    }


    @Test
    public void verifySignUpWithInvalidEmail() throws InterruptedException {
        getSignUpPage().open();
        getSignUpPage().enterName("Dusan");
        getSignUpPage().enterEmail("Administrator.com");
        getSignUpPage().enterPassword("asd123");
        getSignUpPage().enterConfirmPassword("asd123");
        getSignUpPage().clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getEmailErrorMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWithoutEmail (){
        getSignUpPage().open();
        getSignUpPage().enterName("Dusan");
        getSignUpPage().enterEmail("");
        getSignUpPage().enterPassword("asd123");
        getSignUpPage().enterConfirmPassword("asd123");
        getSignUpPage().clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getThisFieldIsRequiredMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWithInvalidPasswordFormat(){
        getSignUpPage().open();
        getSignUpPage().enterName("Dusan");
        getSignUpPage().enterEmail("Administrator.com");
        getSignUpPage().enterPassword("asd1");
        getSignUpPage().enterConfirmPassword("asd1");
        getSignUpPage().clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getShortPasswordErrorMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWihotuPassword(){
        getSignUpPage().open();
        getSignUpPage().enterName("Dusan");
        getSignUpPage().enterEmail("Administrator.com");
        getSignUpPage().enterPassword("");
        getSignUpPage().enterConfirmPassword("asd123");
        getSignUpPage().clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getThisFieldIsRequiredMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWithSohrttInvalidConfirmPassword(){
        getSignUpPage().open();
        getSignUpPage().enterName("Dusan");
        getSignUpPage().enterEmail("Administrator.com");
        getSignUpPage().enterPassword("asd123");
        getSignUpPage().enterConfirmPassword("asd1");
        getSignUpPage().clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getShortPasswordErrorMessage().isDisplayed());
    }
}
