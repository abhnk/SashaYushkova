package hw12;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxTest {
    @Test
    public void checkboxTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox' and following-sibling::text()[1][contains(.,'checkbox 1')]]"));
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox' and following-sibling::text()[1][contains(.,'checkbox 2')]]"));

        System.out.println("Initial state of checkbox 1: " + (checkBox1.isSelected() ? "selected" : "not selected"));
        System.out.println("Initial state of checkbox 2: " + (checkBox2.isSelected() ? "selected" : "not selected"));

        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }

        if (!checkBox2.isSelected()) {
            checkBox2.click();
        }

        System.out.println("State of checkbox 1 after clicking: " + (checkBox1.isSelected() ? "selected" : "not selected"));
        System.out.println("State of checkbox 2 after clicking: " + (checkBox2.isSelected() ? "selected" : "not selected"));

        driver.quit();
    }




}
