package hw12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;


public class FindAndClickTablePage {
    private WebDriver driver;

    public FindAndClickTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
    }

    public void clickButtonByClass(String buttonClass) {
        WebElement button = driver.findElement(By.cssSelector("[class='" + buttonClass + "']"));
        button.click();
    }

    public List<String> getColumnTextValues(int columnIndex) {
        List<WebElement> columnElements = driver.findElements(By.cssSelector("table tr td:nth-child(" + columnIndex + ")"));
        return columnElements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}

