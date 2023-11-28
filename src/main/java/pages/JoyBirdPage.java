package pages;
import org.openqa.selenium.By;
import org.testng.Assert;

import static base.BaseTest.driver;

public class JoyBirdPage extends SeleniumUtility{

    CommonPage commonPage = new CommonPage();
   // Map<String, String> values = new HashMap<>();

    public String bookTicketLabel = "//*[contains(text(),'BOOK TICKET')]";

    public String getFromTextBoxLocatorsCss = "p-autocomplete[id='origin'] input[aria-autocomplete='list']";

    public By getFromTextBoxLocatorsXpath=By.xpath("//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']");

    public By ClickOnTheSearchIcon=By.cssSelector("svg[title='Search']");
    public By ClickOnTheCart=By.cssSelector("svg[class*='relative']");

   public By ByClickOnThePhotsCustomer=By.cssSelector("li[class*='items-center']:nth-of-type(1) > a[class*='group'] > span");
    public By ByClickOnThePhotsLivingRoom=By.cssSelector("a[data-xc='living-room'] > span[class*='items-center']");

    public void ClickOnTheSearchIcon() {
        SeleniumUtility.waitForElementVisibilityWithMaxTimeOut(driver, ClickOnTheSearchIcon, 10);
        driver.findElement(ClickOnTheSearchIcon).click();

    }
    public void ClickOnTheCart() {
        SeleniumUtility.waitForElementVisibilityWithMaxTimeOut(driver, ClickOnTheCart, 10);
        driver.findElement(ClickOnTheCart).click();
    }

    public void ByClickOnThePhotsCustomer() {
        SeleniumUtility.waitForElementVisibilityWithMaxTimeOut(driver, ByClickOnThePhotsCustomer, 10);
        driver.findElement(ByClickOnThePhotsCustomer).click();
    }

    public void ByClickOnThePhotsLivingRoom() throws InterruptedException {
        SeleniumUtility.acceptAlert(5000);
        driver.findElement(ByClickOnThePhotsLivingRoom).click();
        SeleniumUtility.acceptAlert(5000);
    }


    public void getFromTextBoxLocators () {
        commonPage.getUniqueLocator();
    }
    public void assertionForWhishList(String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
    public void assertionForSearchIcon(String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }

    public void assertionForClickOnAccountText(String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }

    public void assertionByClickOnThePhotsLivingRoom(String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
}

