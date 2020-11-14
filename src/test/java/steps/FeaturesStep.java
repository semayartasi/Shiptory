package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import poms.FeaturesPOM;
import utils.BaseDriver;

public class FeaturesStep {
    private WebDriver driver;

    @When("^I click Features$")
    public void iClickFeatures() {
        driver= BaseDriver.getDriver();
        FeaturesPOM features=new FeaturesPOM();
        features.waitAndClick(features.featureButtonLocator);
    }

    @Then("^I succesfully can see Features of Shiptory website$")
    public void iSuccesfullyCanSeeFeaturesOfShiptoryWebsite() {
       String currentLink=driver.getCurrentUrl();
        System.out.println(currentLink);
       Assert.assertEquals("http://shptrywww.datalibraries.com/#features",currentLink);
    }

    @Given("^I click Start Using Now Page$")
    public void iClickStartUsingNowPage() {
        FeaturesPOM startUsingNowButton=new FeaturesPOM();
        startUsingNowButton.waitAndClick(startUsingNowButton.startUsingNowLocator);
    }

    @Then("^I successfully can see Start Using Now Page$")
    public void iSuccessfullyCanSeeStartUsingNowPage() {
        String currentLink1=driver.getCurrentUrl();
        System.out.println(currentLink1);
        Assert.assertEquals("http://shptrywww.datalibraries.com/login.html#create-account",currentLink1);
        //Baska bir sayda acildigi icin verification yapamiyoruz
    }
}
