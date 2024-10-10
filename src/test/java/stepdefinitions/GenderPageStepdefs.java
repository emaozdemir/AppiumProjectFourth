package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GenderPage;
import utilities.DriverFactory;

public class GenderPageStepdefs {

    GenderPage genderPage=new GenderPage(DriverFactory.getDriver());


    @Given("user is on Gender Page")
    public void userIsOnGenderPage() {
        // Write code to navigate to Gender Page
        genderPage.checkGerderPage();
    }

    @Then("should see image on Gender Page")
    public void shouldSeeImageOnGenderPage() {
        // Write code to check image on Gender Page
        genderPage.shouldSeeImageOnGenderPage();
    }

    @Then("should see close button on Gender Page")
    public void shouldSeeCloseButtonOnGenderPage() {
        // Write code to check close button on Gender Page
        genderPage.shouldSeeCloseButtonOnGenderPage();
    }

    @Then("should see men button {string} on Gender Page")
    public void shouldSeeMenButtonOnGenderPage(String menText) {
        // Write code to check men button on Gender Page
        genderPage.checkMenButtonText(menText);
    }

    @Then("should see women button {string} on Gender Page")
    public void shouldSeeWomenButtonOnGenderPage(String womenText) {
        // Write code to check women button on Gender Page
        genderPage.checkWomenButtonText(womenText);
    }

    @Then("should see text button {string} on Gender Page")
    public void shouldSeeTextButtonOnGenderPage(String text) {
        // Write code to check text button on Gender Page
        genderPage.checkTextButtonTextOnGenderPage(text);
    }

    @When("click Men Button on Gender Page")
    public void clickMenButtonOnGenderPage() {
        // Write code to click Men Button on Gender Page
        genderPage.clickMenButton();
    }


    @When("click Women Button on Gender Page")
    public void clickWomenButtonOnGenderPage() {
        // Write code to click Women Button on Gender Page
        genderPage.clickWomenButton();
    }

    @When("click Close Button on Gender Page")
    public void clickCloseButtonOnGenderPage() {
        // Write code to click Close Button on Gender Page
        genderPage.clickCloseButtonOnGenderPage();
    }

}
