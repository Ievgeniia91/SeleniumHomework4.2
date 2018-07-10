package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='add_to_cart']/button/span" )
    WebElement addToCart;
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=order']")
    WebElement checkout;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickAddToCart(){
        addToCart.click();
    }
    public void proceedToCheckout(){
        checkout.click();
    }
}
