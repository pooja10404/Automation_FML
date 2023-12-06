package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class FreeJobAlertPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();
    public String getSearchBoxTextCss = "input[id*='gsc-i-id']";
    public String getLatestNotificationTextCss = "div[class*='gb-grid-column']:nth-of-type(1) ul>li:nth-of-type(1)>a";


    public void clickOnSearchBoxText()  {
        driver.findElement(By.cssSelector(getSearchBoxTextCss)).click();
    }

    public void clickOnLatestNotificationText(){
        commonPage.rightClickOnFindMyLocator(getLatestNotificationTextCss);
    }

}
