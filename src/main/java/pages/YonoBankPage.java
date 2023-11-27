package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static base.BaseTest.driver;

public class YonoBankPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();

    public String getSbiLogoCss = "a[rel='external'] > img";
    public String getHeadingTextCss="div[class*='mt-md-']";
    public String getInitiateOnlineImgCss="div[class*='col-md-']:nth-of-type(1) img[class='onb-img']";
    public String getSbiFooterTextCss="div[class='float-right hidden-xs'] > p";

    public String getCreateMandatesFormCss="div[class='main_content_emandate']";


    public void clickOnSbiLogo() {
        driver.findElement(By.cssSelector(getSbiLogoCss)).click();
    }

    public void clickOnHeadingText() {
        driver.findElement(By.cssSelector(getHeadingTextCss)).click();
    }

    public void clickOnInitiateOnlineImg() {
        driver.findElement(By.cssSelector(getInitiateOnlineImgCss)).click();
    }

    public void clickOnSbiFooterText() {
        driver.findElement(By.cssSelector(getSbiFooterTextCss)).click();
    }

    public void clickOnCreateMandatesForm() {
        driver.findElement(By.cssSelector(getCreateMandatesFormCss)).click();
    }
    public void getUniqueLocatorsForYonoBank () {
        //commonPage.getUniqueLocator(getAboutDistrictDropdownLocatorsCss, getAboutDistrictDropdownLocatorsXpath);
        commonPage.getUniqueLocator();
    }
    public void assertionForYonoSbiUniqueLocators (String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
}
