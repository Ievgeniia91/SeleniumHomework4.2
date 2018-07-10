package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    WebDriver driver;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;
    @FindBy(xpath = "//button[@id='SubmitLogin']//span")
    WebElement submit;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String strEmail) {
        email.sendKeys(strEmail);
    }

    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    public void clickSignIn() {
        submit.click();
    }
}
