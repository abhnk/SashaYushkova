package hw12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTestPage {
    private WebDriver driver;

    public LoginTestPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void login(String username, String password) {
        WebElement inputUsername = driver.findElement(By.cssSelector("[name='username']"));
        inputUsername.sendKeys(username);
        WebElement inputPassword = driver.findElement(By.cssSelector("[name='password']"));
        inputPassword.sendKeys(password + Keys.ENTER);
    }

    public boolean isSuccessMessageDisplayed() {
        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
        return successMessage.isDisplayed();
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorMessage = driver.findElement(By.cssSelector(".flash.error"));
        return errorMessage.isDisplayed();
    }
}
