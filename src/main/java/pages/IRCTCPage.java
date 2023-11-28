package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.HashMap;
import java.util.Map;

import static base.BaseTest.driver;
public class IRCTCPage extends SeleniumUtility{

    CommonPage commonPage = new CommonPage();
   // Map<String, String> values = new HashMap<>();

    public String bookTicketLabel = "//*[contains(text(),'BOOK TICKET')]";

    public String getFromTextBoxLocatorsCss = "p-autocomplete[id='origin'] input[aria-autocomplete='list']";

    public String getFromTextBoxLocatorsXpath = "//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']";

    public String getFromBhopalLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1)>div[class*='form-group']:nth-of-type(1) div[class*='white-back']:nth-of-type(3)>div[class*='col-xs-']:nth-of-type(1)";


    public void clickOnFromTextBox() {
//        waitForElementVisibility(getFromTextBoxLocatorsXpath, 10);
        driver.findElement(By.xpath(getFromTextBoxLocatorsXpath)).click();
    }

    public void clickOnBhopalText() {
//        waitForElementVisibility(getFromBhopalLocatorCss, 10);
        driver.findElement(By.cssSelector(getFromBhopalLocatorCss)).click();
    }

    public void getFromTextBoxLocators () {
        commonPage.getUniqueLocator();
    }

    public void assertionForgetBookTicketUniqueLocators (String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
}
