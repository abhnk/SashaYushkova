package hw12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {
    private WebDriver driver;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    public boolean isCheckboxSelected(int index) {
        WebElement checkbox = driver.findElements(By.cssSelector("input[type='checkbox']")).get(index);
        return checkbox.isSelected();
    }

    public void toggleCheckbox(int index) {
        WebElement checkbox = driver.findElements(By.cssSelector("input[type='checkbox']")).get(index);
        checkbox.click();
    }
}