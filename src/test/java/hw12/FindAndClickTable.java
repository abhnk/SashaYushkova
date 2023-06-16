package hw12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class FindAndClickTable {
    private WebDriver driver;
    private FindAndClickTablePage findAndClickTablePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        findAndClickTablePage = new FindAndClickTablePage(driver);
    }

    @Test
    public void clickTheButton() {
        findAndClickTablePage.open();

        findAndClickTablePage.clickButtonByClass("button");
        findAndClickTablePage.clickButtonByClass("button alert");
        findAndClickTablePage.clickButtonByClass("button success");

        List<String> columnTextValues = findAndClickTablePage.getColumnTextValues(4);

        for (String textValue : columnTextValues) {
            System.out.println(textValue);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
