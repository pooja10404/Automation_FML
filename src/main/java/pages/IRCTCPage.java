package pages;
import org.openqa.selenium.By;
import static base.BaseTest.driver;
public class IRCTCPage extends SeleniumUtility{

    CommonPage commonPage = new CommonPage();
    public String getFromTextBoxLocatorsXpath = "//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']";

    public String getFromBhopalLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1)>div[class*='form-group']:nth-of-type(1) div[class*='white-back']:nth-of-type(3)>div[class*='col-xs-']:nth-of-type(1)";


    public void clickOnFromTextBox() {
        driver.findElement(By.xpath(getFromTextBoxLocatorsXpath)).click();
    }

    public void clickOnBhopalText() {
        driver.findElement(By.cssSelector(getFromBhopalLocatorCss)).click();
    }


}
