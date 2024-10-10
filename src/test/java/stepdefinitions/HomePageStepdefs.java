package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GenderPage;
import pages.HomePage;
import utilities.DriverFactory;

public class HomePageStepdefs {

    HomePage homePage = new HomePage(DriverFactory.getDriver());


    @Then("should see HomePage")
    public void shouldSeeHomePage() {
        // Write code to verify the HomePage is displayed here
        homePage.verifyHomePageIsDisplayed();
    }

    @Given("user is on Home Page")
    public void userIsOnHomePage() {
        homePage.verifyHomePageIsDisplayed();
    }


    @Then("should see homeSembolButton on Home Page")
    public void shouldSeeHomeSembolButtonOnHomePage() {
        // Write code to verify the homeSembolButton is displayed here
        homePage.shouldSeeHomeSembolButton();
    }

    @And("should see alarmButton on Home Page")
    public void shouldSeeAlarmButtonOnHomePage() {
        // Write code to verify the alarmButton is displayed here
        homePage.shouldSeeAlarmButtonOnHomePage();
    }

    @And("should see trendyolLogo on Home Page")
    public void shouldSeeTrendyolLogoOnHomePage() {
        // Write code to verify the trendyolLogo is displayed here
        homePage.verifyTrendyolLogoIsDisplayed();
    }


}
