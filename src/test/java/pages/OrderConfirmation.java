package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {
    WebDriver driver;
    @FindBy(xpath = "//p[@class='alert alert-success']")
    public
    WebElement order;
    @FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
    WebElement back;

    public OrderConfirmation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void orderSubmitted() {
        order.getText();
    }

    public void backToOrders() {
        back.click();
    }
}
