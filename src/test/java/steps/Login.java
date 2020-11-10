package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.BaseDriver;

public class Login {
    private WebDriver driver;
    @Given("^I navigate to Shiptory$")
    public void iNavigateToShiptory() {
        driver= BaseDriver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://shiptory.com/");
    }

    @When("^I enter username and password$")
    public void iEnterUsernameAndPassword() {
    }

    @Then("^I am logged in successfully in Shiptory Application$")
    public void iAmLoggedInSuccessfullyInShiptoryApplication() {
    }
}
