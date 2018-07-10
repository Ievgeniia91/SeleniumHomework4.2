package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
    WebDriver driver;
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
    WebElement checkout1;
    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//button[@type='submit']//span")
    WebElement checkout2;
    @FindBy(xpath = "//input[@id='cgv']")
    WebElement agree;
    @FindBy(xpath = "//button[@name='processCarrier']")
    WebElement checkout3;
    @FindBy(xpath = "//a[@class='cheque']")
    WebElement cheque;


    public Order(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckout1() {
        checkout1.click();
    }

    public void proceedToCheckout2() {
        checkout2.click();
    }

    public void setAgree() {
        agree.click();
    }

    public void finalCheckout() {
        checkout3.click();
    }

    public void payByCheck() {
        cheque.click();
    }
}
