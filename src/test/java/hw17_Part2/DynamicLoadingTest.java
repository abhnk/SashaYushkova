package hw17_Part2;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingTest {
    @BeforeClass
    public void setUp() {
        Configuration.reportsFolder = "target/selenide-reports";
        Configuration.savePageSource = false;
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
    @Test
    public void dynamicLoadingTestPage1() {
        Configuration.timeout = 10000;
        open("https://the-internet.herokuapp.com/dynamic_loading/1");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.loadingIndicator.shouldBe(Condition.exist)
                .shouldBe(Condition.visible)
                .shouldNotBe(Condition.visible);
        dynamicLoadingPage.waitForFinishText();

        String finishText = dynamicLoadingPage.getFinishText();
        Assert.assertEquals(finishText, "Hello World!");


    }

    @Test
    public void dynamicLoadingTestPage2() {
        Configuration.timeout = 10000;
        open("https://the-internet.herokuapp.com/dynamic_loading/2");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.loadingIndicator.shouldBe(Condition.exist)
                .shouldBe(Condition.visible)
                .shouldNotBe(Condition.visible);
        dynamicLoadingPage.waitForFinishText();

        String finishText = dynamicLoadingPage.getFinishText();
        Assert.assertEquals(finishText, "Hello World!");

    }
}







