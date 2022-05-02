package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(id= "gender-male")
    public WebElement maleRadioBtn;

    @FindBy(id="gender-female")
    public WebElement femaleRadioBtn;

    @FindBy(id="FirstName")
    public WebElement firstName;
    @FindBy(id="LastName")
    public WebElement lastName;
    @FindBy(id="Email")
    public WebElement email;
    @FindBy(id="Password")
    public WebElement password;
    @FindBy(id="ConfirmPassword")
    public WebElement cPassword;
    @FindBy(id="register-button")
    public WebElement regButton;
    @FindBy(className = "ico-logout")
    public WebElement logOutLink;
    @FindBy(className = "result")
    public WebElement confirmText;

    public RegPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void clickRadioBtn()
    {
        maleRadioBtn.click();
        femaleRadioBtn.click();
    }
    public void enterFirstName(String fName)
    {
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName)
    {
        lastName.sendKeys(lName);
    }
    public void enterEmailReg(String mail)
    {
        email.sendKeys(mail);
    }
    public void enterPassword(String pwd)
    {
        password.sendKeys(pwd);
    }
    public void enterConfirmPassword(String cPwd)
    {
        cPassword.sendKeys(cPwd);
    }
    public void clickRegButton()
    {
        regButton.click();
    }
    public void confirmLogOutLinkPresent()
    {
        
    }
    public String getConfirmText()
    {
        wait= new WebDriverWait(driver, 40);
      wait.until(ExpectedConditions.visibilityOf(confirmText));
        return confirmText.getText();
    }






    }

