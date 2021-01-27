package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.title;

public class BasePage {

    public BasePage() {
        Configuration.baseUrl = "http://http://demo.guru99.com";
    }
    public String getTitle() {
        return title();
    }
}
