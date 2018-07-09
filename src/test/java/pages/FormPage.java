package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormPage {
    WebDriver driver;
    @FindBy(id = "first-name")
    WebElement firstName;
    @FindBy(id = "last-name")
    WebElement lastName;
    @FindBy(xpath = "//input[@name ='gender']")
    WebElement gender;
    @FindBy(id = "dob")
    WebElement calendar;
    @FindBy(id = "address")
    WebElement address;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(css = "input[type = 'password']")
    WebElement password;
    @FindBy(name = "company")
    WebElement company;
    @FindBy(name = "role")
    WebElement role;
    @FindBy(name = "expectation")
    WebElement jobExpectation;
    @FindBy(xpath = "//html//div[2]/label[1]/input[1]")
    WebElement way1;
    @FindBy(xpath = "//html//div[6]/label[1]/input[1]")
    WebElement way2;
    @FindBy(id = "comment")
    WebElement comment;
    @FindBy(id = "submit")
    WebElement button;
    @FindBy(id = "submit-msg")
    public WebElement submitMessage;


    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void setFirstName(String strFirstName) {
        firstName.sendKeys(strFirstName);
    }

    public void setLastName(String strLastName) {
        lastName.sendKeys(strLastName);
    }

    public void setGender() {
        gender.click();
    }

    public void setCalendar() {
        calendar.click();
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='table-condensed']//td"));
        for (WebElement el : allDates) {
            String date = el.getText();
            if (date.equalsIgnoreCase("25")) {
                el.click();
                break;
            }
        }
    }

    public void setAddress(String strAddress) {
        address.sendKeys(strAddress);
    }

    public void setEmail(String strEmail) {
        email.sendKeys(strEmail);
    }

    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    public void setCompany(String strCompany) {
        company.sendKeys(strCompany);
    }

    public void setRole() {

        Select list = new Select(role);
        list.selectByVisibleText("QA");
    }

    public void setJob() {

        Select job = new Select(jobExpectation);
        job.selectByVisibleText("High salary");
        job.selectByVisibleText("Good teamwork");
        job.selectByVisibleText("Challenging");
    }

    public void chooseWay1() {
        if (!way1.isSelected())
            way1.click();
    }

    public void chooseWay2() {
        if (!way2.isSelected())
            way2.click();
    }

    public void setComment(String strComment) {
        comment.sendKeys(strComment);
    }

    public void clickButton() {
        button.submit();
    }

    public void getSubmitMessage() { submitMessage.getText();
    }
}