package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOMEBOX\\IdeaProjects\\domaci19\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().fullscreen();

        WebElement elementButton = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)"));
        elementButton.click();
        WebElement textBoxButton = driver.findElement(By.cssSelector("#item-0"));
        textBoxButton.click();
        WebElement fullName = driver.findElement(By.id("userName"));
        String fullNameFaker = faker.name().fullName();
        fullName.sendKeys(fullNameFaker);
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        String userEmailFaker = faker.internet().emailAddress();
        userEmail.sendKeys(userEmailFaker);
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        String currentAddressFaker = faker.address().fullAddress();
        currentAddress.sendKeys(currentAddressFaker);
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        String permanentAddressFaker = faker.address().fullAddress();
        permanentAddress.sendKeys(permanentAddressFaker);
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement name = driver.findElement(By.id("name"));
        WebElement email=driver.findElement(By.id("email"));


        if (name.getText().equals("Name:"+fullNameFaker) && email.getText().equals("Email:"+userEmailFaker)) {
            System.out.println("Test pass. Name and Email is same.");
        } else {
            System.out.println("Test fault. Name or emal is not same");
        }



    }
}