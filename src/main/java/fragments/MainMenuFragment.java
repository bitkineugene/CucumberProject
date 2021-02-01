package fragments;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MainMenuFragment extends BaseFragment{

    protected SelenideElement rootElement = $("div.row>nav");

    public WebElement getRootElement() {
        return rootElement;
    }
    public MainMenuFragment() {
        super.rootElement = rootElement;
    }
}
