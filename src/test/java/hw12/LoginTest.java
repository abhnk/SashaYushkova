package hw12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest {
    private WebDriver driver;
    private LoginTestPage loginPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginTestPage(driver);
    }

    @Test
    public void loginTestPositive() {
        loginPage.open();
        loginPage.login("tomsmith", "SuperSecretPassword!");
        assertTrue(loginPage.isSuccessMessageDisplayed());
    }

    @Test
    public void loginTestNegative() {
        loginPage.open();
        loginPage.login("abhnk@i.ua", "SuperSecretPassword!");
        assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

