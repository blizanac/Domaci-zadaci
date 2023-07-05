package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest extends BaseTests {


    @Test
    public void verifyCurrentUrl() {
        getIndexPage().open()
                .clickOnSignUpButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }

    @Test
    public void verifyTypeOfEmailField() {
        getSignUpPage().open()
                .clickEmailField();
        Assert.assertEquals(getSignUpPage().getEmailField().getAttribute("type"), "email");

    }

    @Test
    public void verifyTypeOfPasswordField() {
        getSignUpPage().open()
                .clickPasswordField();
        Assert.assertEquals(getSignUpPage().getPasswordField().getAttribute("type"), "password");
    }


    @Test
    public void verifySignUpWithInvalidEmail() throws InterruptedException {
        getSignUpPage().open()
                .enterName("Dusan")
                .enterEmail("Administrator.com")
                .enterPassword("asd123")
                .enterConfirmPassword("asd123")
                .clickSignUpButton();
      Assert.assertTrue(getSignUpPage().getEmailErrorMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWithoutEmail (){
        getSignUpPage().open()
                .enterName("Dusan")
                .enterEmail("")
                .enterPassword("asd123")
                .enterConfirmPassword("asd123")
                .clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getThisFieldIsRequiredMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWithInvalidPassword(){
        getSignUpPage().open()
                .enterName("Dusan")
                .enterEmail("administrator@gmail.com")
                .enterPassword("asd1")
                .enterConfirmPassword("asd1")
                .clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getShortPasswordErrorMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWihotuPassword(){
        getSignUpPage().open()
                .enterName("Dusan")
                .enterEmail("administrator@gmail.com")
                .enterPassword("")
                .enterConfirmPassword("asd1")
                .clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getThisFieldIsRequiredMessage().isDisplayed());
    }

    @Test
    public void verifySignUpWithSohrttInvalidConfirmPassword(){
        getSignUpPage().open()
                .enterName("Dusan")
                .enterEmail("administrator@gmail.com")
                .enterPassword("asd123")
                .enterConfirmPassword("asd1")
                .clickSignUpButton();
        Assert.assertTrue(getSignUpPage().getShortPasswordErrorMessage().isDisplayed());
    }
}
