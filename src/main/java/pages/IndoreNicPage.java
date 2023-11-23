package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static base.BaseTest.driver;

public class IndoreNicPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();

    public String getAboutDistrictDropdownLocatorsCss = "p-autocomplete[id='origin'] input[aria-autocomplete='list']";

    public String getAboutDistrictDropdownLocatorsXpath = "//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']";

    public void clickOnAboutDistrictDropdown() {
        waitForElementVisibility(getAboutDistrictDropdownLocatorsXpath, 10);
        driver.findElement(By.xpath(getAboutDistrictDropdownLocatorsXpath)).click();
    }

    public void getAboutDistrictDropdownLocators () {
        //commonPage.getUniqueLocator(getAboutDistrictDropdownLocatorsCss, getAboutDistrictDropdownLocatorsXpath);
    }

    public void assertionForAboutDistrictDropdownUniqueLocators (String uniqueLocatorCSS, String uniqueLocatorXpath) {
//        Assert.assertEquals(commonPage.getUniqueCssLocator(getAboutDistrictDropdownLocatorsCss), uniqueLocatorCSS);
//        Assert.assertEquals(commonPage.getUniqueXpathLocator(getAboutDistrictDropdownLocatorsXpath), uniqueLocatorXpath);
    }
}
