package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DragAndDropPage;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class DragAndDropStepDef {

    HomePage homePage = new HomePage();
    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Given("user is on dragAndDrop page")
    public void userIsOnDragAndDropPage() {
        homePage.navigate();
        homePage.clickOnDragAndDropButton();
    }

    @And("success message is not shown")
    public void successMessageIsNotShown() {
        dragAndDropPage.getSuccessMessage().shouldNot(Condition.visible);
    }

    @When("user drop debit account {string}")
    public void userDropDebitAccount(String title) {
        dragAndDropPage.moveToDebitAccount(title);
    }

    @And("user drop debit amount {string}")
    public void userDropDebitAmount(String amount) {
        dragAndDropPage.moveAmountToDebit(amount);
    }

    @And("user drop credit account {string}")
    public void userDropCreditAccount(String title) {
        dragAndDropPage.moveToCreditAccount(title);
    }

    @And("user drop credit amount {string}")
    public void userDropCreditAmount(String amount) {
        dragAndDropPage.moveAmountToCredit(amount);
    }

    @Then("success messagee is shown")
    public void successMessageIsShown() {
        assertTrue(dragAndDropPage.getSuccessMessage().isDisplayed());
    }
}
