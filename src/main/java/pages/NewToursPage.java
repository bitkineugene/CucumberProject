package pages;

import fragments.MainMenuFragment;

public class NewToursPage extends BasePage {
    private MainMenuFragment mainMenuFragment = new MainMenuFragment();

    public NewToursPage() {
    }

    public MainMenuFragment getMainMenuFragment() {
        return mainMenuFragment;
    }

    public boolean isMainFragmentPresent() {
        return mainMenuFragment.getRootElement().isDisplayed();
    }
}

