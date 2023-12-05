package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static base.BaseTest.driver;
public class IRCTCPage extends SeleniumUtility{

    CommonPage commonPage = new CommonPage();
    public String getFromTextBoxLocatorsXpath = "//p-autocomplete[@id='origin']//input[@aria-autocomplete='list']";
    public String getToTextBoxLocatorCss= "p-autocomplete[id='destination'] input[aria-autocomplete='list']";
    public String getAllClassesDropdownLocatorCss= "p-dropdown[id='journeyClass']>div[class*='ng-tns-c']";
    public String getAcFirstClassElementLocatorCss= "p-dropdownitem[class*='ng-tns-c']:nth-of-type(3) span[class='ng-star-inserted']";
    public String getGeneralDropdownLocatorCss= "p-dropdown[id='journeyQuota']>div[class*='ng-tns-c']";
    public String getSearchButtonLocatorCss= "button[class='search_btn train_Search']";
    public String getDestinationTextboxLocatorCss= "div[class*='level']:nth-of-type(2) div[class*='col-lg-']:nth-of-type(2) input[aria-autocomplete='list']";
    public String getDestinationLocationIconLocatorCss= "form[class='ng-pristine ng-valid ng-touched'] i[class='fa fa-map-marker']";
    public String getAllClassesDropdownListLocatorCss= "form[class='ng-pristine ng-valid ng-touched'] div[class*='col-lg-']:nth-of-type(4) div[class*='ui-dropdown-label-co']";
    public String getFlexibleWithDateCheckboxLocatorCss= "div[class*='level']:nth-of-type(2) label[for='dateSpecific']";
    public String getPersonWithDisabilityConcessionCheckboxLocatorCss= "div[class*='level']:nth-of-type(2) label[for='concessionBooking']";
    public String getResultTextLocatorCss= "div[class='hidden-xs'] strong";
    public String getRunsOnLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1)>div[class*='form-group']:nth-of-type(1) span[class='pull-left hidden-xs']";
    public String getTotalTimeDurationLocatorXpath= "//div[@class='ng-star-inserted'][1]/div[contains(@class, 'form-group')][1]//span[contains(@class, 'col-xs-')]/span";
    public String getBookNowButtonLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1) button[class='btnDefault disable-book train_Search ng-star-inserted']";
    public String getRefreshButtonLocatorCss= "div[class='ng-star-inserted']:nth-of-type(6) table td[class='ng-star-inserted']:nth-of-type(1) div[class*='col-xs-']";
    public String getHourLineLocatorCss= "div[class='border-all ng-star-inserted'] div[class='sliderDiv ng-star-inserted']:nth-of-type(2) span[class*='ui-slider-range']";
    public String getFromBhopalLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1)>div[class*='form-group']:nth-of-type(1) div[class*='white-back']:nth-of-type(3)>div[class*='col-xs-']:nth-of-type(1)";


    public void clickOnFromTextBox() {
        driver.findElement(By.xpath(getFromTextBoxLocatorsXpath)).click();
    }
    public void clickOnToTextBox() {
        driver.findElement(By.cssSelector(getToTextBoxLocatorCss)).click();
    }
    public void clickOnAllClassesDropdown() {
        driver.findElement(By.cssSelector(getAllClassesDropdownLocatorCss)).click();
    }
    public void clickOnAcFirstClassDropdown() {
        this.clickOnAllClassesDropdown();
        commonPage.rightClickOnFindMyLocator(getAcFirstClassElementLocatorCss);
    }
    public void clickOnGeneralDropdown() {
        driver.findElement(By.cssSelector(getGeneralDropdownLocatorCss)).isDisplayed();
        driver.findElement(By.cssSelector(getGeneralDropdownLocatorCss)).click();
    }
    public void clickOnSearchButton() {
        driver.findElement(By.cssSelector(getSearchButtonLocatorCss)).isDisplayed();
        driver.findElement(By.cssSelector(getSearchButtonLocatorCss)).click();
    }
    public void clickOnDestinationTextBox() {
        driver.findElement(By.cssSelector(getDestinationTextboxLocatorCss)).click();
    }
    public void clickOnDestinationLocationIcon() {
        this.clickOnDestinationTextBox();
        waitForElementVisibility(getDestinationLocationIconLocatorCss,20);
        driver.findElement(By.cssSelector(getDestinationLocationIconLocatorCss)).click();
    }
    public void clickOnAllClassesDropdownList() {
        this.clickOnDestinationTextBox();
        waitForElementVisibility(getAllClassesDropdownListLocatorCss,20);
        driver.findElement(By.cssSelector(getAllClassesDropdownListLocatorCss)).click();
    }
    public void clickOnFlexibleWithDateCheckbox() {
        commonPage.rightClickOnFindMyLocator(getFlexibleWithDateCheckboxLocatorCss);
    }
    public void clickOnPersonWithDisabilityConcessionCheckbox() {
        commonPage.rightClickOnFindMyLocator(getPersonWithDisabilityConcessionCheckboxLocatorCss);
    }
    public void clickOnResultText() {
        waitForElementStaleness(getElement(getResultTextLocatorCss),20);
        commonPage.rightClickOnFindMyLocator(getResultTextLocatorCss);
    }
    public void clickOnRunsOn()  {
        WebElement element=driver.findElement(By.cssSelector(getRunsOnLocatorCss));
        clickOnElementSide(element, "left");
    }
    public void clickOnTotalTimeDuration()  {
        driver.findElement(By.xpath(getTotalTimeDurationLocatorXpath)).click();
    }
    public void clickOnBookNowButton()  {
        driver.findElement(By.cssSelector(getBookNowButtonLocatorCss)).click();
    }
    public void clickOnRefreshButton() {
        WebElement element=driver.findElement(By.cssSelector(getRefreshButtonLocatorCss));
        clickOnElementSide(element, "left");
    }
    public void clickOnHourLine()  {
        waitForElementStaleness(getElement(getHourLineLocatorCss),50);
        commonPage.rightClickOnFindMyLocator(getHourLineLocatorCss);
    }
    public void leftClickOnHourLine() {
        driver.findElement(By.cssSelector(getHourLineLocatorCss)).click();
    }
    public void clickOnBhopalText() {
        driver.findElement(By.cssSelector(getFromBhopalLocatorCss)).click();
    }
}
