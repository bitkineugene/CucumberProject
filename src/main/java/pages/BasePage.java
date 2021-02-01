package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.title;

public class BasePage {

    private SelenideElement successMessage = $x("//a[contains(text(),'Perfect')]");

    public BasePage() {
        Configuration.baseUrl = "http://demo.guru99.com";
    }
    public String getTitle() {
        return title();
    }

}
