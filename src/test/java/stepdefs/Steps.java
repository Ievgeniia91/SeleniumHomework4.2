package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import pages.*;

public class Steps {

    WebDriver driver;
    LoginPage loginPage;
    MyAccount myAccount;
    Women womenPage;
    ProductPage productPage;
    Order order;
    Payment payment;
    OrderConfirmation orderConfirmation;
    OrderHistory orderHistory;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/volodymyrbratik/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=history");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        myAccount = new MyAccount(driver);
        womenPage = new Women(driver);
        productPage = new ProductPage(driver);
        order = new Order(driver);
        payment = new Payment(driver);
        orderConfirmation = new OrderConfirmation(driver);
        orderHistory = new OrderHistory(driver);
    }

    @Given("^user navigate to the app url$")
    public void userNavigateToTheAppUrl() {
        System.out.println("User navigate to login page");
    }

    @When("^user fills email \"([^\"]*)\"$")
    public void userFillsEmail(String email) {
       loginPage.setEmail(email);
    }

    @And("^user fills password \"([^\"]*)\"$")
    public void userFillsPassword(String password) {
        loginPage.setPassword(password);
    }

    @And("^user clicks sign in$")
    public void userClicksSignIn() {
        loginPage.clickSignIn();
    }

    @And("^user clicks women$")
    public void userClicksWomen() {
        myAccount.clickWomen();
    }

    @And("^user chooses product$")
    public void userChoosesProduct() {
        womenPage.clickOnDress();
    }

    @And("^user clicks on 'Add to cart' button$")
    public void userClicksOnAddToCartButton() {
        productPage.clickAddToCart();
    }

    @And("^user proceeds to checkout$")
    public void userProceedsToCheckout() {
        productPage.proceedToCheckout();
    }

    @And("^user proceeds to next checkout$")
    public void userProceedsToNextCheckout(){
       order.proceedToCheckout1();
    }

    @And("^user proceeds to next step of checkout$")
    public void userProceedsToNextStepOfCheckout() {
        order.proceedToCheckout2();
    }

    @And("^user agrees with terms$")
    public void userAgreesWithTerms() {
       order.setAgree();
    }

    @And("^user proceeds to final checkout$")
    public void userProceedsToFinalCheckout() {
        order.finalCheckout();
    }

    @And("^user chooses pay by check$")
    public void userChoosesPayByCheck() {
        order.payByCheck();
    }

    @And("^user confirms order$")
    public void userConfirmsOrder() {
        payment.confirmOrder();
    }

    @And("^user gets order confirmation$")
    public void userGetsOrderConfirmation() {
        orderConfirmation.orderSubmitted();
        Assert.assertEquals(orderConfirmation.order.getText(),"Your order on My Store is complete." );
    }

    @And("^user goes back to orders$")
    public void userGoesBackToOrders() {
        orderConfirmation.backToOrders();
    }

    @And("^user checks total price$")
    public void userChecksTotalPrice() {
        orderHistory.totalPrice();
        Assert.assertEquals(orderHistory.priceForDress.getText(),
                "$28.00");
    }

    @And("^user logs out from the app$")
    public void userLogsOutFromTheApp() {
       orderHistory.setLogout();
    }

    @Then("^user is logged out$")
    public void userIsLogedOut() {
        System.out.println("User is logged out");
    }
    @AfterTest
    public void reload(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=history");
    }
    @After
    public void close() {
        driver.close();
        driver.quit();
    }
}
