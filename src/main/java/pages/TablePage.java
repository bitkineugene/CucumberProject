package pages;

import com.codeborne.selenide.SelenideElement;
import fragments.BaseFragment;
import fragments.MainMenuFragment;

import static com.codeborne.selenide.Selenide.$;

public class TablePage extends BaseFragment {

    private MainMenuFragment mainMenuFragment = new MainMenuFragment();
    private SelenideElement mainFragment = $("body>table");

    public boolean isMainFragmentPresent() {
        return mainMenuFragment.getRootElement().isDisplayed();
    }
    public SelenideElement isTablePresent(){
        return mainFragment;
    }
}
