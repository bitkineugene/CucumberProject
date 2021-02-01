package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import fragments.AddFileFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class FileUploadPage extends BasePage {

    private SelenideElement successMessage = $("div>h3");
    private SelenideElement chooseFileButton = $("#uploadmode1");
    private SelenideElement submitButton = $(By.name("send"));

    public String getTitle() {
        return title();
    }

    public void clickOnTheChooseFileButton() {
        chooseFileButton.click();
    }

    public void addFile(String filePath) throws AWTException {

        AddFileFragment.copyPath(filePath);
        AddFileFragment.pastePath();
    }

    public void clickSendButton() {
        submitButton.click();
    }

    public WebElement getSuccessMessage() {
        successMessage.waitUntil(Condition.visible,1000);
        return successMessage;
    }
}
