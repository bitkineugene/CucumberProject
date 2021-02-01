package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AgileProjectPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AgileProjectStepDef {

    HomePage homePage = new HomePage();
    AgileProjectPage agileProjectPage = new AgileProjectPage();
    String invalidCredMessage = "User or Password is not valid";

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.navigate();
    }

    @When("user navigates to agile page")
    public void userNavigatesToAgilePage() {
        homePage.clickOnAgilePageButton();
    }

    @And("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String login, String password) {
        agileProjectPage.loginInput(login);
        agileProjectPage.passwordInput(password);
    }

    @And("click login button")
    public void clickLoginButton() {
        agileProjectPage.clickLoginButton();
    }

    @Then("welcome message is correct")
    public void welcomeMessageIsCorrect() {
        assertTrue(agileProjectPage.welcomeMessage().isDisplayed());
    }

    @Then("invalid credentials message is shown")
    public void invalidCredentialsMessageIsShown() {
        assertEquals(agileProjectPage.invalidCredentialMessage(),invalidCredMessage);
    }
}
