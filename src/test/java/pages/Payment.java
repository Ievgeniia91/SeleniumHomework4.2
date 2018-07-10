package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
    WebDriver driver;
    @FindBy(xpath = "//p[@id='cart_navigation']//button[@type='submit']//span")
    WebElement confirm;


    public Payment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void confirmOrder() {
        confirm.click();
    }
}
