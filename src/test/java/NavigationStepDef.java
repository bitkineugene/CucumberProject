import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.NewToursPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NavigationStepDef {

    HomePage homePage = new HomePage();
    NewToursPage newToursPage = new NewToursPage();

    @When("user navigate to homePage")
    public void userNavigateToHomePage() {
        homePage.navigate();
    }
    @Then("title of homePage is {string}")
    public void titleOfHomePage(String title) {
        assertEquals(title, homePage.getTitle());
    }

    @And("login form is present")
    public void loginFormIsPresent() {
        assertTrue(homePage.isLoginFormPresent());
    }

    @Given("user is on homePage")
    public void userIsOnHomePage() {
        homePage.navigate();
    }

    @When("user click on newToursButton")
    public void userClickOnNewToursButton() {
        homePage.clickOnNewToursButton();
    }

    @Then("title of newToursPage is {string}")
    public void titleOfNewToursPageIs(String expTitle) {
        assertEquals(expTitle, newToursPage.getTitle());
    }

    @And("main fragment is present")
    public void mainFragmentIsPresent() {
        assertTrue(newToursPage.isMainFragmentPresent());
    }

    @When("user click on tableDemoLink")
    public void userClickOnTableDemoLink() {
    }

    @Then("title of tablePage is correct")
    public void titleOfTablePageIsCorrect() {
    }

    @And("table is present")
    public void tableIsPresent() {
    }
}
