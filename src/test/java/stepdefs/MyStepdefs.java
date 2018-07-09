package stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.FormPage;

import java.util.Collections;

public class MyStepdefs {

    WebDriver driver;
    FormPage formPage;

    @Before
       public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/volodymyrbratik/Downloads/chromedriver");
        driver = new ChromeDriver();
        formPage = new FormPage(driver);
        driver.manage().window().maximize();
    }
    @Given("^user navigate to the app url$")
    public void userNavigateToTheAppUrl() {
      driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @When("^user fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String name1) {
        formPage.setFirstName(name1);
    }

    @And("^user fills last name text with value \"([^\"]*)\"$")
    public void userFillsLastNameTextWithValue(String name2) {
        formPage.setLastName(name2);
    }

    @When("^user chooses gender$")
    public void userChoosesGender() {
        formPage.setGender();
    }

    @When("^user fills date of birth$")
    public void userFillsDateOfBirth() {
        formPage.setCalendar();
    }

    @When("^user fills address \"([^\"]*)\"$")
    public void userFillsAddress(String address) {
        formPage.setAddress(address);
    }

    @When("^user fills email \"([^\"]*)\"$")
    public void userFillsEmail(String email) {
        formPage.setEmail(email);
    }

    @When("^user fills password \"([^\"]*)\"$")
    public void userFillsPassword(String password) {
        formPage.setPassword(password);
    }

    @And("^user fills company name \"([^\"]*)\"$")
    public void userFillsCompanyName(String compName) {
        formPage.setCompany(compName);
    }

    @When("^user chooses role$")
    public void userChoosesRole() {
        formPage.setRole();
    }

    @When("^user chooses job expectations$")
    public void userChoosesJobExpectations() {
        formPage.setJob();
    }

    @When("^user chooses ways of development$")
    public void userChoosesWaysOfDevelopment() {
        formPage.chooseWay1();
        formPage.chooseWay2();
    }

    @When("^user fills comment \"([^\"]*)\"$")
    public void userFillsComment(String comment) {
        formPage.setComment(comment);
    }

    @When("^user clicks submit button$")
    public void userClicksSubmitButton() {
        formPage.clickButton();
    }

    @Then("^form is submitted$")
    public void formIsSubmitted() {

            Assert.assertEquals(formPage.submitMessage.getText(), "Successfully submitted!");
        }
}
