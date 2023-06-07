package hw12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindAndClickTable {
    @Test
    public void clickTheButton() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        WebElement button1 = driver.findElement(By.cssSelector("[class='button']"));
        button1.click();
        WebElement button2 = driver.findElement(By.cssSelector("[class='button alert']"));
        button2.click();
        WebElement button3 = driver.findElement(By.cssSelector("[class='button success']"));
        button3.click();

        List<WebElement> columnElements = driver.findElements(By.cssSelector("table tr td:nth-child(4)"));

        for(WebElement element : columnElements) {
            System.out.println(element.getText());
        }

        driver.quit();

    }

}
