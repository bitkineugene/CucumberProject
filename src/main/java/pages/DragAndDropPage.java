package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DragAndDropPage extends BasePage{

    private SelenideElement successMessage = $x("//a[contains(text(),'Perfect')]");
    private SelenideElement toAccountDebit = $x("//*[@id='bank']/li");
    private SelenideElement toAccountCredit = $x("//*[@id='loan']/li");
    private SelenideElement toAmountCredit = $x("//*[@id='amt7']/li");
    private SelenideElement toAmountDebit = $x("//*[@id='amt8']/li");

    public SelenideElement getSuccessMessage() {
        return successMessage;
    }

    public void moveToDebitAccount(String title) {
        $x("//a[@class='button button-orange'][contains(text(),'"+title+"')]").dragAndDropTo(toAccountDebit);
    }

    public void moveAmountToDebit(String amount) {
        $$x("//a[@class='button button-orange'][contains(text(),'"+amount+"')]").get(1).dragAndDropTo(toAmountDebit);
    }

    public void moveToCreditAccount(String title) {
        $x("//a[@class='button button-orange'][contains(text(),'"+title+"')]").dragAndDropTo(toAccountCredit);
    }

    public void moveAmountToCredit(String amount) {
        $$x("//a[@class='button button-orange'][contains(text(),'"+amount+"')]").get(1).dragAndDropTo(toAmountCredit);
    }
}
