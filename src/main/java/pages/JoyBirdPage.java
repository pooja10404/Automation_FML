package pages;
import org.openqa.selenium.By;
import org.testng.Assert;

import static base.BaseTest.driver;

public class JoyBirdPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();
    public By ClickOnTheSearchIcon=By.cssSelector("svg[title='Search']");
    public By ClickOnTheCart=By.cssSelector("svg[class*='relative']");
    public By ByClickOnThePhotsLivingRoom=By.cssSelector("a[data-xc='living-room'] > span[class*='items-center']");

    public void ClickOnTheSearchIcon() {
        SeleniumUtility.waitForElementVisibilityWithMaxTimeOut(driver, ClickOnTheSearchIcon, 10);
        driver.findElement(ClickOnTheSearchIcon).click();

    }
    public void ClickOnTheCart() {
        SeleniumUtility.waitForElementVisibilityWithMaxTimeOut(driver, ClickOnTheCart, 10);
        driver.findElement(ClickOnTheCart).click();
    }

    public void ByClickOnThePhotsLivingRoom() throws InterruptedException {
        driver.findElement(ByClickOnThePhotsLivingRoom).click();

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

    public void assertionByClickOnThePhotsLivingRoom(String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
}

