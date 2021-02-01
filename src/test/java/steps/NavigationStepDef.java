package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.NewToursPage;
import pages.TablePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NavigationStepDef {

    HomePage homePage = new HomePage();
    NewToursPage newToursPage = new NewToursPage();
    TablePage tablePage = new TablePage();

    @When("user navigate to homePage")
    public void userNavigateToHomePage() {
        System.out.println("step1");
        homePage.navigate();
    }

    @Then("title of homePage is {string}")
    public void titleOfHomePage(String expectedTitle) {
        System.out.println("step2");
        assertEquals(expectedTitle, homePage.getTitle());
    }

    @And("login form is present")
    public void loginFormIsPresent() {
        System.out.println("step3");
        assertTrue(homePage.isLoginFormPresent());
    }

    @Given("user is on homePage")
    public void userIsOnHomePage() {
        System.out.println("step1");
        homePage.navigate();
    }

    @When("user click on newToursButton")
    public void userClickOnNewToursButton() {
        System.out.println("step2");
        homePage.clickOnNewToursButton();
    }

    @Then("title of newToursPage is {string}")
    public void titleOfNewToursPageIs(String expTitle) {
        System.out.println("step3");
        assertEquals(expTitle, newToursPage.getTitle());
    }

    @And("main fragment is present")
    public void mainFragmentIsPresent() {
        System.out.println("step4");
        assertTrue(newToursPage.isMainFragmentPresent());
    }

    @When("user click on tableDemoLink")
    public void userClickOnTableDemoLink() {
        System.out.println("step1");
        homePage.clickOnTablePageButton();
    }

    @Then("title of tablePage is correct")
    public void titleOfTablePageIsCorrect() {
        System.out.println("step2");
        assertTrue(tablePage.isMainFragmentPresent());
    }

    @And("table is present")
    public void tableIsPresent() {
        System.out.println("step3");
        assertTrue(tablePage.isTablePresent().isDisplayed());
    }
}
