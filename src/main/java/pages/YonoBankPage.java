package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public String getPrivacyStatementTextCss="li:nth-of-type(1) > a[routerlinkactive='active']";


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
        commonPage.rightClickOnFindMyLocator(getInitiateOnlineImgCss);
    }

    public void clickOnPrivacyStatementText() throws InterruptedException{
        commonPage.rightClickOnFindMyLocator(getPrivacyStatementTextCss);
    }

    public void clickOnSbiFooterText() {
        driver.findElement(By.cssSelector(getSbiFooterTextCss)).click();
    }

    public void clickOnCreateMandateText() throws InterruptedException{
        commonPage.rightClickOnFindMyLocator(getSbiCreateMandateTextCss);
    }
    public void clickOnCreateMandatesForm(){
        driver.findElement(By.cssSelector(getCreateMandatesFormCss)).click();
    }


}
