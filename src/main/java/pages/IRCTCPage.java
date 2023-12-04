package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static base.BaseTest.driver;
public class IRCTCPage extends SeleniumUtility{

    CommonPage commonPage = new CommonPage();
    public String getFromTextBoxLocatorsXpath = "//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']";
    public String ArrowTextLocatorCss= "span[class='fa fa-angle-up ng-star-inserted']";
    public String getFromBhopalLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1)>div[class*='form-group']:nth-of-type(1) div[class*='white-back']:nth-of-type(3)>div[class*='col-xs-']:nth-of-type(1)";
    public String getDateTextLocatorCss= "div[class*='row'] > span > strong";
    public String getArrowTextLocatorCss= "div[class*='col-lg-']:nth-of-type(2) button[class='btn_Tab']:nth-of-type(2) span[class='fa fa-angle-down ng-star-inserted']";
    public String getIrctcWalletLocatorCss="div[class*='col-lg-']:nth-of-type(3) button[class='btn_Tab']:nth-of-type(1)>span[class='footer_headings']";
    public String getIrctcOtherTextLocatorCss="div[class='border-all ng-star-inserted'] p-panel[class*='ng-tns-c'] table[class*='ng-tns-c'] span[class='t-t-O']";
    public String irctcMovetoElement="div[class*='col-lg-']:nth-of-type(2) button[class='btn_Tab']:nth-of-type(5)";
    public void clickOnFromTextBox() {
        driver.findElement(By.xpath(getFromTextBoxLocatorsXpath)).click();
    }
    public void clickOnBhopalText() {
        driver.findElement(By.cssSelector(getFromBhopalLocatorCss)).click();
    }
    public void clickOnDateText() {
        driver.findElement(By.cssSelector(getDateTextLocatorCss)).click();
    }
    public void clickOnFooterLink() throws InterruptedException {
        waitForElementVisibility(irctcMovetoElement,80);
        moveToElement(irctcMovetoElement);
        driver.findElement(By.cssSelector(getArrowTextLocatorCss)).click();
    }
    public void irctcWalletLink() throws InterruptedException {
        waitForElementVisibility(irctcMovetoElement,80);
        commonPage.rightClickOnFindMyLocator(getIrctcWalletLocatorCss);
    }
    public void irctcOtherText() throws InterruptedException {
        commonPage.rightClickOnFindMyLocator(getIrctcOtherTextLocatorCss);
    }
    public void clickOnArrowButton() throws InterruptedException {
        waitForElementVisibility(irctcMovetoElement,50);
        moveToElement(irctcMovetoElement);
        driver.findElement(By.cssSelector(getArrowTextLocatorCss)).click();
        commonPage.rightClickOnFindMyLocator(ArrowTextLocatorCss);
    }

}
