package hw12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest {
    private WebDriver driver;
    private CheckboxesPage checkboxesPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        checkboxesPage = new CheckboxesPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void checkboxTest() {
        checkboxesPage.open();

        boolean initialStateCheckbox1 = checkboxesPage.isCheckboxSelected(0);
        boolean initialStateCheckbox2 = checkboxesPage.isCheckboxSelected(1);

        System.out.println("Initial state of checkbox 1: " + (initialStateCheckbox1 ? "selected" : "not selected"));
        System.out.println("Initial state of checkbox 2: " + (initialStateCheckbox2 ? "selected" : "not selected"));

        if (!initialStateCheckbox1) {
            checkboxesPage.toggleCheckbox(0);
        }

        if (!initialStateCheckbox2) {
            checkboxesPage.toggleCheckbox(1);
        }

        boolean newStateCheckbox1 = checkboxesPage.isCheckboxSelected(0);
        boolean newStateCheckbox2 = checkboxesPage.isCheckboxSelected(1);

        System.out.println("State of checkbox 1 after clicking: " + (newStateCheckbox1 ? "selected" : "not selected"));
        System.out.println("State of checkbox 2 after clicking: " + (newStateCheckbox2 ? "selected" : "not selected"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
