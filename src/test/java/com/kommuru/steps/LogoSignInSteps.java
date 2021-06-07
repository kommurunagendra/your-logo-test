package com.kommuru.steps;

import com.kommuru.page.BasePage;
import com.kommuru.page.HomePage;
import com.kommuru.page.MyAccountPage;
import com.kommuru.page.SignInPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * The class is used to define step definitions.
 *
 * @author Reddy
 */
public class LogoSignInSteps extends BasePage {
    protected static HomePage homePage;
    protected static MyAccountPage myAccountPage;
    protected static SignInPage signInPage;

    @Before
    public void setup() {
        BasePage.initializeBrowser();
    }

    @After
    public void tearDown() {
        BasePage.close();
    }

    @Given("user is on automation practice home page")
    public void userIsOnAutomationPracticeHomePage() {
        homePage = new HomePage();
        homePage.navigateHomePage();
    }

    @When("i click on sign in link")
    public void iClickOnSignInLink() {
        signInPage = homePage.clickOnSignInLink();
    }

    @Then("i should be in authentication page")
    public void iShouldBeInAuthenticationPage() {
        assertEquals("AUTHENTICATION", signInPage.getAuthenticationText());
    }

    @Then("i should be in my account page")
    public void iShouldBeInMyAccountPage() {
        assertEquals("MY ACCOUNT", myAccountPage.myAccountText());
    }

    @When("i enter emailId (.*) and password (.*) and click on sign in button")
    public void iEnterEmailIdAndPasswordAndClickOnSignInButton(String emailId, String password) {
        myAccountPage = signInPage.enterLoginDetails(emailId, password);
    }

    @When("i click on sign out link")
    public void iClickOnSignOutLink() {
        signInPage = myAccountPage.clickOnSignout();
    }
}
