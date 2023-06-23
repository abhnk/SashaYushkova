package hw16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;

public class UploadPage {
    private WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://the-internet.herokuapp.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        File file = new File(filePath);
        fileInput.sendKeys(file.getAbsolutePath());

        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        WebElement uploadedMessage = driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
        return uploadedMessage.isDisplayed() && uploadedMessage.getText().equals("File Uploaded!");
    }
}

