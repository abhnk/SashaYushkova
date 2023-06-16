package hw12;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetUserNameTest {
    private WebDriver driver;
    private HoversPage hoversPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        hoversPage = new HoversPage(driver);
    }

    @Test
    public void getUserName() {
        hoversPage.open();

        List<String> userNames = IntStream.range(0, 3)
                .mapToObj(index -> {
                    hoversPage.hoverOverFigure(index);
                    return hoversPage.getUserName(index);
                })
                .collect(Collectors.toList());

        userNames.forEach(System.out::println);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


