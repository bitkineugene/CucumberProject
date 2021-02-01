package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FileUploadPage;
import pages.HomePage;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FileUploadStepDef {

    HomePage homePage = new HomePage();
    FileUploadPage fileUploadPage = new FileUploadPage();

    @Given("user is on uploadFilePage")
    public void userIsOnUploadFilePage() {
        homePage.navigate();
        homePage.clickOnFileUploadButton();
    }

    @And("title of page is {string}")
    public void titleOfPageIs(String expTitle) {
        assertEquals(expTitle, fileUploadPage.getTitle());
    }

    @When("user click {string} button")
    public void userClickButton(String chooseFileButton) {
        fileUploadPage.clickOnTheChooseFileButton();
    }

    @And("add file path")
    public void addFilePath() throws AWTException {
        fileUploadPage.addFile("D:\\test.txt");
    }

    @And("click {string} button")
    public void clickButton(String submitButton) {
        fileUploadPage.clickSendButton();
    }

    @Then("success message is shown")
    public void successMessageIsShown() {
        assertTrue(fileUploadPage.getSuccessMessage().getText().contains("successfully uploaded"));
    }
}
