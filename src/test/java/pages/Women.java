package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
    WebDriver driver;
    @FindBy(linkText = "Printed Dress")
    WebElement printedDress;

    public Women(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnDress() {
        printedDress.click();
    }
}
