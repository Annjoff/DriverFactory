package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(id= "small-searchterms")
    public WebElement searchTextBox;

    @FindBy(className="search-box-button")
    public WebElement searchBoxButton;

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(linkText = "Log out")
    public WebElement logOutLink;

    public HomePage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
public void enterSearchItem(String item)
{searchTextBox.sendKeys(item);

}
public void clickSearchButton()
{
    searchBoxButton.click();
}

public void clickRegLink()
{
    registerLink.click();
}
public void clickLogOutLink()
{
    logOutLink.click();
}
public void navigateToUrl(String url)
{
    driver.navigate().to(url);
}
public boolean verifyLogoutLink()
{
    return logOutLink.isDisplayed();
}
}
