package hw12;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;

import static org.testng.Assert.assertTrue;

public class LoginTest {
    @Test
    public void loginTestPositive() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement inputUsername = driver.findElement(By.cssSelector("[name='username']"));
        inputUsername.sendKeys("tomsmith");
        WebElement inputPassword = driver.findElement(By.cssSelector("[name='password']"));
        inputPassword.sendKeys("SuperSecretPassword!" + Keys.ENTER);
        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
        successMessage.isDisplayed();

        driver.quit();
    }
        @Test
        public void loginTestNegative() {
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");

            WebElement inputUsername = driver.findElement(By.cssSelector("[name='username']"));
            inputUsername.sendKeys("abhnk@i.ua");
            WebElement inputPassword = driver.findElement(By.cssSelector("[name='password']"));
            inputPassword.sendKeys("SuperSecretPassword!" + Keys.ENTER);
            WebElement errorMessage = driver.findElement(By.cssSelector(".flash.error"));
            errorMessage.isDisplayed();

            driver.quit();

    }
}
