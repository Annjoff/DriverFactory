package base;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegPage;
import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage {
  public static HomePage homePage;
  public static LoginPage loginPage;
  public static RegPage regPage;
  public static DriverUtils driverUtils;

public static void initPages()
{
  homePage=new HomePage(DriverFactory.driver);
  loginPage = new LoginPage(DriverFactory.driver);
  regPage= new RegPage(DriverFactory.driver);
  driverUtils =new DriverUtils();
}

}
