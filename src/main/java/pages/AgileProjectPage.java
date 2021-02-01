package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AgileProjectPage {

    private SelenideElement loginField = $(By.name("uid"));
    private SelenideElement passwordField = $x("//input[@name='password']");
    private SelenideElement loginButton = $(By.name("btnLogin"));
    private SelenideElement welcomeMessage = $x("//marquee[contains(text(),'Welcome To Customer')]");

    public void loginInput(String login) {
        loginField.val(login).pressTab();
    }

    public void passwordInput(String password) {
        passwordField.val(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

    public SelenideElement welcomeMessage() {
        return welcomeMessage;
    }

    public String invalidCredentialMessage() {
        return switchTo().alert().getText();
    }
}
