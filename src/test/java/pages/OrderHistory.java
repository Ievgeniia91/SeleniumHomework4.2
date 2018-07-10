package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
    WebDriver driver;
    @FindBy(xpath = "//tr[contains(@class,'first_item')]//td[@class='history_price']//span[@class='price']")
    public
    WebElement priceForDress;
    @FindBy(xpath = "//a[@class='logout']")
    WebElement logout;

    public OrderHistory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void totalPrice() {
        priceForDress.getText();
    }

    public void setLogout() {
        logout.click();
    }
}
