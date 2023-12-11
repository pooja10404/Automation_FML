package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class IndoreNicPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();
    public String getWebsitePoliciesCss = "ul[id='menu-footer-en']>li[id*='menu-item-']:nth-of-type(1)>a";
    public String getAboutDistrictDropdownLocatorscss = "li[aria-haspopup='true']:nth-of-type(2) > a";
    public String getElectionCommitionCss = "a[title='Election Commission Of India'] > div[class='list-text']";
    public String getCopyRightTextCss="div[class='copyRightsText'] > p:nth-of-type(2)";
    public String getJointDirectorTextCss="tr:nth-of-type(1) > td[data-th='OFFICER']";
    public String getNewConnectionTabBoxCSS="a[title='New Tap Connection'] span[class*='icon-supply']";
    public String getMasterPlanTextCss="tr:nth-of-type(1) > td[data-th*='Title'] > span[class='bt-content']";
    public String getIndoreDistrictNameTextCss="table[class*='table']:nth-of-type(1) th[scope='col']:nth-of-type(1)";
    public String getStdAndPinCodeTextCss="h1";
    public String getPostOfficeTextCss="div[id*='post-'] > p:nth-of-type(2)";
    public String getPinCodeBoxTextCss="table[class*='table']:nth-of-type(2) th[scope='col']:nth-of-type(1)";
    public String getAdministrationSetupCss="li[aria-haspopup='true'] > ul[aria-hidden='false']>li[aria-haspopup='true']:nth-of-type(4)>a";
    public String getCollectrateCss="li[aria-haspopup='true']:nth-of-type(4) > ul[class='sub-menu show-menu']>li[id*='menu-item-']:nth-of-type(1)>a";



    public void clickOnAboutDistrictDropdown(){
        driver.findElement(By.cssSelector(getAboutDistrictDropdownLocatorscss)).isDisplayed();
        commonPage.rightClickOnFindMyLocator(getAboutDistrictDropdownLocatorscss);
    }

    public void clickOnWebsitePolices(){
        commonPage.rightClickOnFindMyLocator(getWebsitePoliciesCss);
    }

    public void clickOnElectionCommition(){
        commonPage.rightClickOnFindMyLocator(getElectionCommitionCss);
    }

    public void clickOnCopyRightText() {
        driver.findElement(By.cssSelector(getCopyRightTextCss)).click();
    }

        public void clickOnJointDirectorText() {
        driver.findElement(By.cssSelector(getJointDirectorTextCss)).click();
    }

    public void clickOnNewConnectionTabBox(){
        commonPage.rightClickOnFindMyLocator(getNewConnectionTabBoxCSS);
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

    public void clickCollectrateText() {
        moveToElement(getAboutDistrictDropdownLocatorscss);
        moveToElement(getAdministrationSetupCss);
        commonPage.rightClickOnFindMyLocator(getCollectrateCss);
    }

}
