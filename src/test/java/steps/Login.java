package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BaseDriver;

import java.util.List;
import java.util.Set;

public class Login {
    private WebDriver driver;
    @Given("^I navigate to Shiptory$")
    public void iNavigateToShiptory() {
        driver= BaseDriver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://shptrywww.datalibraries.com/");
    }

    @When("^I enter username and password$")
    public void iEnterUsernameAndPassword() {
        driver.findElement(By.cssSelector("[data-page=\"login\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("skyca82@gmail.com");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("12345shiptory");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }

//    @Then("^I am logged in successfully in Shiptory Application$")
//    public void iAmLoggedInSuccessfullyInShiptoryApplication() {
       // String parentWindow= driver.getWindowHandle();
//        Set<String> allWindows = driver.getWindowHandles();
//        for(String curWindow : allWindows){
//            driver.switchTo().window(curWindow);
//            System.out.println(curWindow);
//        }
//        driver.findElement(By.cssSelector("a[data-trcode=\"app.dashboard\"]")).click();
//
//        String currentLink=driver.getCurrentUrl();
//        System.out.println(currentLink);
//
//        String text = driver.findElement(By.cssSelector("p[class=\"welcome\"]")).getText();
//        System.out.println(text);
       // Assert.assertEquals("https://app.shiptory.com/welcome",currentLink);
//    }
}
