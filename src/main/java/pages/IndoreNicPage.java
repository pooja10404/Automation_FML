package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static base.BaseTest.driver;

public class IndoreNicPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();

    public String getAboutDistrictDropdownLocatorsCss = "li[aria-haspopup='true']:nth-of-type(2) > a";

    public String getWebsitePoliciesCss = "ul[id='menu-footer-en']>li[id*='menu-item-']:nth-of-type(1)>a";
    public String getAboutDistrictDropdownLocatorsXpath = "//ul[@id='menu-header-en']/li[@aria-haspopup='true'][1]/a";


    public String getElectionCommitionCss = "a[title='Election Commission Of India'] > div[class='list-text']";

    public String getCopyRightTextCss="div[class='copyRightsText'] > p:nth-of-type(2)";
    public String getCopyRightTextXpath="//div[@class='copyRightsText']/p[2]";
    public String getJointDirectorTextCss="tr:nth-of-type(1) > td[data-th='OFFICER']";

    public String getNewConnectionTabBoxCSS="li[class='relatedContainer']:nth-of-type(7)";

    public String getMasterPlanTextCss="tr:nth-of-type(1) > td[data-th*='Title'] > span[class='bt-content']";
    public String getIndoreDistrictNameTextCss="table[class*='table']:nth-of-type(1) th[scope='col']:nth-of-type(1)";

    public String getStdAndPinCodeTextCss="h1";

    public String getPostOfficeTextCss="div[id*='post-'] > p:nth-of-type(2)";
    public String getPinCodeBoxTextCss="table[class*='table']:nth-of-type(2) th[scope='col']:nth-of-type(1)";



    public void clickOnAboutDistrictDropdown() {
      //  waitForElementVisibility(getAboutDistrictDropdownLocatorsXpath, 10);
        driver.findElement(By.xpath(getAboutDistrictDropdownLocatorsXpath)).click();
    }

    public void clickOnWebsitePolices() {
        driver.findElement(By.cssSelector(getWebsitePoliciesCss)).click();
    }

    public void clickOnElectionCommition() {
        driver.findElement(By.cssSelector(getElectionCommitionCss)).click();

    }

    public void clickOnCopyRightText() {
        driver.findElement(By.cssSelector(getCopyRightTextCss)).click();
    }

        public void clickOnJointDirectorText() {
        driver.findElement(By.cssSelector(getJointDirectorTextCss)).click();
    }

    public void clickOnNewConnectionTabBox() {
        driver.findElement(By.cssSelector(getNewConnectionTabBoxCSS)).isDisplayed();
    }

    public void clickOnMasterPlanText() {
        driver.findElement(By.cssSelector(getMasterPlanTextCss)).click();
    }

    public void clickOnIndoreDistrictNameText() {
        driver.findElement(By.cssSelector(getIndoreDistrictNameTextCss)).click();
    }

    public void clickStdAndPinCodeText() {
        driver.findElement(By.cssSelector(getStdAndPinCodeTextCss)).click();
    }

    public void clickPostOfficeText() {
        driver.findElement(By.cssSelector(getPostOfficeTextCss)).click();
    }

    public void clickPinCodeBoxText() {
        driver.findElement(By.cssSelector(getPinCodeBoxTextCss)).click();
    }



    public void getAboutDistrictDropdownLocators () {
        //commonPage.getUniqueLocator(getAboutDistrictDropdownLocatorsCss, getAboutDistrictDropdownLocatorsXpath);
        commonPage.getUniqueLocator();
    }

    public void assertionForAboutDistrictDropdownUniqueLocators (String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
}
