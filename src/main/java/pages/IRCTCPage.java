package pages;
import org.openqa.selenium.By;


import static base.BaseTest.driver;
public class IRCTCPage extends SeleniumUtility{

    CommonPage commonPage = new CommonPage();
    public String getFromTextBoxLocatorsXpath = "//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']";

    public String ArrowTextLocatorCss= "span[class='fa fa-angle-up ng-star-inserted']";

    public String getFromBhopalLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1)>div[class*='form-group']:nth-of-type(1) div[class*='white-back']:nth-of-type(3)>div[class*='col-xs-']:nth-of-type(1)";


    public String getDateTextLocatorCss= "div[class*='row'] > span > strong";
    public String getArrowTextLocatorCss= "div[class*='col-lg-']:nth-of-type(2) button[class='btn_Tab']:nth-of-type(2) span[class='fa fa-angle-down ng-star-inserted']";

    public void clickOnFromTextBox() {
        driver.findElement(By.xpath(getFromTextBoxLocatorsXpath)).click();
    }

    public void clickOnBhopalText() {
        driver.findElement(By.cssSelector(getFromBhopalLocatorCss)).click();
    }

    public void clickOnDateText() {
        driver.findElement(By.cssSelector(getDateTextLocatorCss)).click();
    }

    public void clickOnArrowButton() throws InterruptedException {
        driver.findElement(By.cssSelector(getArrowTextLocatorCss));
        String Element ="div[class*='col-lg-']:nth-of-type(2) button[class='btn_Tab']:nth-of-type(5)";
        moveToElement(Element);
        driver.findElement(By.cssSelector(getArrowTextLocatorCss)).click();
        commonPage.rightClickOnFindMyLocator(ArrowTextLocatorCss);



    }

}
