package hw17_Part1;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UploadPage {
    public static final String URL = "https://the-internet.herokuapp.com/upload";

    public void uploadFile(String filePath) {
        SelenideElement fileInput = $("#file-upload");
        File file = new File(filePath);
        fileInput.uploadFile(file);

        $("#file-submit").click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        $("body").shouldHave(text("File Uploaded!"));
        return true;
    }




}
