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

    public By getFromTextBoxLocatorsXpath=By.xpath("//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']");

    public By getFromTextBoxLocatorCss=By.cssSelector("p-autocomplete[id='destination'] input[aria-autocomplete='list']");

    public void clickOnFromTextBox() {
        SeleniumUtility.waitForElementVisibilityWithMaxTimeOut(driver, getFromTextBoxLocatorsXpath, 10);
        driver.findElement(getFromTextBoxLocatorsXpath).click();
    }

    public void clickToFromTextBox() {
        SeleniumUtility.waitForElementVisibilityWithMaxTimeOut(driver, getFromTextBoxLocatorCss, 10);
        driver.findElement(getFromTextBoxLocatorCss).click();
    }


    public void getFromTextBoxLocators () {
        commonPage.getUniqueLocator();
    }

    public void assertionForgetBookTicketUniqueLocators (String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
}
