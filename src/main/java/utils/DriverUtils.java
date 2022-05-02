package utils;

public class DriverUtils {
public void navigateToUrl(String url)
{
    DriverFactory.driver.navigate().to(url);
}
public String getTitle()
{
    return DriverFactory.driver.getTitle();
}
}
