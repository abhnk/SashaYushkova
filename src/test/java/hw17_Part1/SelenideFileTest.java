package hw17_Part1;


import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;

public class SelenideFileTest {
        private String editedFilePath = "target/test-classes/not_empty.txt";

        @BeforeClass
        public void setUp() {
            Configuration.reportsFolder = "target/selenide-reports";
            Configuration.downloadsFolder = "target/test-classes";
            Configuration.timeout = 10000;
            Configuration.savePageSource = false;
        }

        @AfterClass
        public void tearDown() {
            closeWebDriver();
        }

        @Test
        public void fileUploadTest() throws IOException {
            DownloadPage downloadPage = open(DownloadPage.URL, DownloadPage.class);
            downloadPage.downloadFile("some-file.txt");

            editFileContent(editedFilePath);

            UploadPage uploadPage = open(UploadPage.URL, UploadPage.class);
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
