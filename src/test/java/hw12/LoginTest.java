package hw12;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void loginTestPositive() {
        WebElement inputUsername = driver.findElement(By.cssSelector("[name='username']"));
        inputUsername.sendKeys("tomsmith");
        WebElement inputPassword = driver.findElement(By.cssSelector("[name='password']"));
        inputPassword.sendKeys("SuperSecretPassword!" + Keys.ENTER);
        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
        assert successMessage.isDisplayed();
    }

    @Test
    public void loginTestNegative() {
        WebElement inputUsername = driver.findElement(By.cssSelector("[name='username']"));
        inputUsername.sendKeys("abhnk@i.ua");
        WebElement inputPassword = driver.findElement(By.cssSelector("[name='password']"));
        inputPassword.sendKeys("SuperSecretPassword!" + Keys.ENTER);
        WebElement errorMessage = driver.findElement(By.cssSelector(".flash.error"));
        assert errorMessage.isDisplayed();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
