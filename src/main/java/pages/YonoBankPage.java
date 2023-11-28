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

    public String getCreateMandatesFormCss="input[id='captchaAnswer']";
    public String getSbiCreateMandateTextCss="a[class='create-mandate create-emandate']";

    public String getLoginButtonTextCss ="a[class='btn yn-btn btn-yono-homepage login-btn']";
    public String getRegisterButtonTextCss="a[class*='btn']:nth-of-type(2)";


    public void clickOnSbiLogo() {
        driver.findElement(By.cssSelector(getSbiLogoCss)).click();
    }

    public void clickOnHeadingText() {
        driver.findElement(By.cssSelector(getHeadingTextCss)).click();
    }


    public void clickOnLoginButton() throws InterruptedException {
        commonPage.rightClickOnFindMyLocator(getLoginButtonTextCss);
    }

    public void clickOnRegisterButton() throws InterruptedException {
        commonPage.rightClickOnFindMyLocator(getRegisterButtonTextCss);
    }

    public void clickOnInitiateOnlineImg() throws InterruptedException{
        //driver.findElement(By.cssSelector(getInitiateOnlineImgCss)).click();
        commonPage.rightClickOnFindMyLocator(getInitiateOnlineImgCss);
    }

    public void clickOnSbiFooterText() {
        driver.findElement(By.cssSelector(getSbiFooterTextCss)).click();
    }

    public void clickOnCreateMandateText() throws InterruptedException{
        commonPage.rightClickOnFindMyLocator(getSbiCreateMandateTextCss);
    }
//      need to check
    public void clickOnCreateMandatesForm() throws InterruptedException{
       // commonPage.rightClickOnFindMyLocator(getCreateMandatesFormCss);
        driver.findElement(By.cssSelector(getCreateMandatesFormCss)).click();
    }
    public void getUniqueLocatorsForYonoBank () {
        commonPage.getUniqueLocator();
    }
    public void assertionForYonoSbiUniqueLocators (String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(commonPage.getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(commonPage.getUniqueXpathLocator(), uniqueLocatorXpath);
    }
}
