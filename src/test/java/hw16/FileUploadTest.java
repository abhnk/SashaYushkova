package hw16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileUploadTest {
    private WebDriver driver;
    private String editedFilePath = "target/test-classes/not_empty.txt";

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", new File("target/test-classes").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void fileUploadTest() throws IOException {
        DownloadPage downloadPage = new DownloadPage(driver);
        downloadPage.navigateToDownloadPage();

        downloadPage.downloadFile("not_empty.txt");

        editFileContent(editedFilePath);

        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.navigateToUploadPage();

        uploadPage.uploadFile(editedFilePath);

        Assert.assertTrue(uploadPage.isUploadSuccessMessageDisplayed(), "The uploaded file message is not displayed correctly.");
    }

    private void editFileContent(String filePath) throws IOException {
        File file = new File(filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("Новий рядок 1");
            writer.newLine();
            writer.write("Новий рядок 2");
            writer.newLine();
        }
    }
}