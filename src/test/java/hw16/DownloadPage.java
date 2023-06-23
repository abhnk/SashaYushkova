package hw16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadPage {
        private WebDriver driver;

        public DownloadPage(WebDriver driver) {
            this.driver = driver;
        }

        public void navigateToDownloadPage() {
            driver.get("https://the-internet.herokuapp.com/download");
        }

        public void downloadFile(String fileName) {
            WebElement downloadLink = driver.findElement(By.linkText(fileName));
            downloadLink.click();
        }
    }
