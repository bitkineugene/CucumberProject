package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import fragments.MainMenuFragment;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage{
    private MainMenuFragment mainMenuFragment = new MainMenuFragment();

    private SelenideElement loginForm = $("form[name='frmLogin']");
    private SelenideElement newToursButton = $x("//a[contains(text(), 'New Tours')]");
    private SelenideElement openSeleniumMenu = $x("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]");
    private SelenideElement tablePageButton = $x("//a[contains(text(),'Table')]");
    private SelenideElement dragAndDropPageButton = $x("//a[contains(text(),'Drag')]");
    private SelenideElement agileProjectButton = $x("//a[contains(text(),'Agile Project')]");
    private ElementsCollection fileUploadButton = $$x("//a[contains(text(),'File Upload')]");


    public HomePage (){

    }

    public MainMenuFragment getMainMenuFragment() {
        return mainMenuFragment;
    }
    public boolean isLoginFormPresent() {
        return loginForm.isDisplayed();
    }
    public void navigate() {
        open("/");
    }

    public void clickOnNewToursButton(){
        newToursButton.click();
    }
    public void clickOnTablePageButton(){
        openSeleniumMenu.click();
        tablePageButton.click();
    }
    public void clickOnDragAndDropButton(){
        openSeleniumMenu.click();
        dragAndDropPageButton.click();
    }

    public void clickOnAgilePageButton() {
        agileProjectButton.click();
    }

    public void clickOnFileUploadButton() {
        openSeleniumMenu.click();
        fileUploadButton.first().click();
    }
}
