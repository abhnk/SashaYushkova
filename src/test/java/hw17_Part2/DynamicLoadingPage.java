package hw17_Part2;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class DynamicLoadingPage {
    private final SelenideElement startButton = $(By.xpath("//button[text()='Start']"));
    final SelenideElement loadingIndicator = $("#loading");
    private final SelenideElement finishText = $("#finish");

    public void clickStartButton() {
        startButton.shouldBe(Condition.enabled).click();
    }

    public void waitForFinishText() {
        finishText.shouldBe(Condition.text("Hello World!"));
    }

    public String getFinishText() {
        return finishText.text();
    }
}