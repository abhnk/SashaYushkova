package hw13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class GetUserNameTest {
    @Test
    public void getUserName () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get("https://the-internet.herokuapp.com/hovers");

        List<WebElement> figures = driver.findElements(By.cssSelector(".figure"));

        List<String> userNames = figures.stream().map(figure -> {
            action.moveToElement(figure).perform();

            WebElement figcaption = figure.findElement(By.cssSelector(".figcaption"));
            return figcaption.findElement(By.tagName("h5")).getText();
        }).collect(Collectors.toList());

        userNames.forEach(System.out::println);

        driver.quit();
    }
}

