
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Zadatak1 {

    WebDriver driver;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chromedriver.driver", "C://Users//HOMEBOX//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void verifySignUpPageInformation() throws InterruptedException {
        driver.get("https://vue-demo.daniel-avellaneda.com");
        driver.manage().window().maximize();

        //pokusao sam da pronadjem licni xpath za poruke koje iskacu ako se unese invalidna vrednost za email /password
        // na primer //div[@clas = 'v-messages-message'].
        // takodje sam pokusao da pronadjem xpath za email/ password polja na primer //input[@name='email']
        //medjutim ne finkcioise i iz tog razloga su ove kobasice dole.

        WebElement singUpButton = driver.findElement(By.cssSelector("#app > div > div > header > div > div.v-toolbar__items > a:nth-child(4) > span"));
        singUpButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
        WebElement emailField = driver.findElement(By.id("email"));
        Assert.assertEquals(emailField.getAttribute("type"), "email");
        WebElement passwordField = driver.findElement(By.id("password"));
        Assert.assertEquals(passwordField.getAttribute("type"), "password");
    }

    @BeforeMethod
    public void beforeSetUp() {
        driver.get("https://vue-demo.daniel-avellaneda.com/signup");
        driver.manage().window().maximize();
    }

    @Test
    public void verifySingUpWithoutMail() {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Petar Petrovic");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("petar7260");
        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("petar7260");
        WebElement singUpButton = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div.flex.text-xs-center.mt-5 > button"));
        singUpButton.click();
        WebElement emailMessage = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div:nth-child(2) > span > div > div > div.v-text-field__details > div > div > div"));
        Assert.assertTrue(emailMessage.isDisplayed());
    }


    @Test
    public void verifySingUpWithoutPassword() {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Petar Petrovic");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("petarpetrovic@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("");
        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("petar7260");
        WebElement singUpButton = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div.flex.text-xs-center.mt-5 > button"));
        singUpButton.click();
        WebElement passwordMessage = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div:nth-child(3) > span > div > div > div.v-text-field__details > div > div > div"));
        Assert.assertTrue(passwordMessage.isDisplayed());
    }

    @Test
    public void verifySingUpWithoutComfirmPassword() {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Petar Petrovic");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("petarpetrovic@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("petar7260");
        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("");
        WebElement singUpButton = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div.flex.text-xs-center.mt-5 > button"));
        singUpButton.click();
        WebElement confirmPasswordMessage = driver.findElement(By.cssSelector("#app > div.v-application--wrap > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div:nth-child(4) > span > div > div > div.v-text-field__details > div > div > div"));
        Assert.assertTrue(confirmPasswordMessage.isDisplayed());
    }

    @Test
    public void verifySingUpWithInvalidMail() {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Petar Petrovic");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("petarpetrovicgmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("petar7260");
        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("petar7260");
        WebElement singUpButton = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div.flex.text-xs-center.mt-5 > button"));
        singUpButton.click();
        WebElement mailMessage = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div:nth-child(2) > span > div > div > div.v-text-field__details > div > div > div"));
        Assert.assertTrue(mailMessage.isDisplayed());
    }

    @Test
    public void verifySingUpWithInvalidPassword() {
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Petar Petrovic");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("petarpetrovicgmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("peta");
        WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
        confirmPassword.sendKeys("peta");
        WebElement singUpButton = driver.findElement(By.cssSelector("#app > div > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div.flex.text-xs-center.mt-5 > button"));
        singUpButton.click();
        WebElement passwordMessage = driver.findElement(By.cssSelector("#app > div.v-application--wrap > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div:nth-child(3) > span > div > div > div.v-text-field__details > div > div > div"));
        Assert.assertTrue(passwordMessage.isDisplayed());
    }


    @AfterClass
    public void close() {
        driver.close();
    }

}
