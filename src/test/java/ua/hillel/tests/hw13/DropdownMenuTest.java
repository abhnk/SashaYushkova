package ua.hillel.tests.hw13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.hillel.tests.listeners.CustomExtentReportListener;

import java.util.List;
@Listeners({CustomExtentReportListener.class})
public class DropdownMenuTest {
    @Test
    public void dropDownMenuTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html#");

        WebElement dropDownMenu = driver.findElement(By.cssSelector(".dropdown"));
        new Actions(driver).moveToElement(dropDownMenu).perform();
        dropDownMenu.click();

        WebElement secondaryMenu = driver.findElement(By.cssSelector(".secondary-dropdown"));
        new Actions(driver).moveToElement(secondaryMenu).perform();
        secondaryMenu.click();

        WebElement secondaryAction = driver.findElement(By.cssSelector(".dropdown-menu.secondariy"));
        new Actions(driver).moveToElement(secondaryAction).perform();
        secondaryAction.click();

        WebElement successMessage = driver.findElement(By.cssSelector(".jumbotron.secondary-clicked"));
        assert successMessage.isDisplayed();

        driver.quit();
    }


}
