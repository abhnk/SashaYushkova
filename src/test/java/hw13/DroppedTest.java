package hw13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DroppedTest {
    @Test
    public void dragAndDrop() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement draggableElement = driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
        WebElement droppableElement = driver.findElement(By.cssSelector(".ui-widget-header.ui-droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggableElement, droppableElement).perform();

        WebElement successMessage = driver.findElement(By.cssSelector(".ui-widget-header.ui-droppable.ui-state-highlight"));
        Assert.assertEquals(successMessage.getText(), "Dropped!");

        driver.quit();
    }
    }
