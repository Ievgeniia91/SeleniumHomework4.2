package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
    WebDriver driver;
    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")
    WebElement women;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickWomen() {
        women.click();
    }
}
