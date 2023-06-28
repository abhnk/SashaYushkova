package hw17_Part1;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {
    public static final String URL = "https://the-internet.herokuapp.com/download";

    public void downloadFile(String fileName) {
        $(byLinkText(fileName)).click();
    }
}
