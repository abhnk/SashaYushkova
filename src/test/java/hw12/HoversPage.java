package hw12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    public void hoverOverFigure(int index) {
        WebElement figure = driver.findElements(By.cssSelector(".figure")).get(index);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
    }

    public String getUserName(int index) {
        WebElement figure = driver.findElements(By.cssSelector(".figure")).get(index);
        WebElement figcaption = figure.findElement(By.cssSelector(".figcaption"));
        return figcaption.findElement(By.tagName("h5")).getText();
    }
}

