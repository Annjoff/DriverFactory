package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(linkText = "Log in")
    public WebElement loginLink;

    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement loginPassword;
    @FindBy(className = "login-button")
public WebElement loginButton;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickLoginLink()
    {
        loginLink.click();
    }
    public void enterEmailTextBox(String email)
    {
        emailTextBox.sendKeys(email);
    }
    public void enterLoginPassword(String password)
    {
        loginPassword.sendKeys(password);
    }
    public void clickLoginButton()
    {
        loginButton.click();
    }
}
