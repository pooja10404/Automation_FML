package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    public String ArrowTextLocatorCss= "span[class='fa fa-angle-up ng-star-inserted']";
    public String getFromBhopalLocatorCss= "div[class='ng-star-inserted']:nth-of-type(1)>div[class*='form-group']:nth-of-type(1) div[class*='white-back']:nth-of-type(3)>div[class*='col-xs-']:nth-of-type(1)";
    public String getDateTextLocatorCss= "div[class*='row'] > span > strong";
    public String getArrowTextLocatorCss= "div[class*='col-lg-']:nth-of-type(2) button[class='btn_Tab']:nth-of-type(2) span[class='fa fa-angle-down ng-star-inserted']";
    public String getIrctcWalletLocatorCss="div[class*='col-lg-']:nth-of-type(3) button[class='btn_Tab']:nth-of-type(1)>span[class='footer_headings']";
    public String getIrctcOtherTextLocatorCss="div[class='border-all ng-star-inserted'] p-panel[class*='ng-tns-c'] table[class*='ng-tns-c'] span[class='t-t-O']";
    public String irctcMovetoElement="div[class*='col-lg-']:nth-of-type(2) button[class='btn_Tab']:nth-of-type(5)";
    public String getDishaLocatorCss = "div[id='askDishaLuncher'] > img:nth-of-type(1)";
    public String crossOriginLocator="div[id='book-form']";
    public String HolidayMenuCss = "a[aria-label='Menu Holiday']";
    public String dishaIframeId = "Disha-Bot";
    public String HolidaySubMenuCss="a[aria-label='Sub Menu of Holiday, Tourist Trains. Having sub menu'] > span[class='list_text']";
    public String HolidaySubMenuGauravMenuCss="li[class='menu-list header-icon-menu']:nth-of-type(7) li:nth-of-type(1)>ul[class='child-drop']>li:nth-of-type(1)";
    public String getLadiesOptionCss="li[aria-label='LADIES']";

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
    public void clickOnDateText() {
        driver.findElement(By.cssSelector(getDateTextLocatorCss)).click();
    }
    public void clickOnFooterLink(){
        waitForElementVisibility(irctcMovetoElement,80);
        moveToElement(irctcMovetoElement);
        driver.findElement(By.cssSelector(getArrowTextLocatorCss)).click();
    }
    public void clickOnDisha(){
        driver.findElement(By.cssSelector(getDishaLocatorCss)).click();
        WebElement iframe_element=driver.findElement(By.id(dishaIframeId));
        driver.switchTo().frame(iframe_element);
        driver.findElement(By.cssSelector(crossOriginLocator)).click();
        driver.switchTo().defaultContent();
    }

    public void clickOnHolidayMenu() {
        driver.findElement(By.cssSelector(HolidayMenuCss)).click();
    }
    public void clickOnHolidaySubMenuGauravMenu(){
        moveToElement(HolidayMenuCss);
        moveToElement(HolidaySubMenuCss);
        driver.findElement(By.cssSelector(HolidaySubMenuGauravMenuCss)).click();
    }

    public void clickOnLadiesOption(){
        driver.findElement(By.cssSelector(getGeneralDropdownLocatorCss)).click();
        moveToElement(getLadiesOptionCss);
        commonPage.rightClickOnFindMyLocator(getLadiesOptionCss);
      //  driver.findElement(By.cssSelector(getLadiesOptionCss)).click();

    }

    public void irctcWalletLink(){
        waitForElementVisibility(irctcMovetoElement,80);
        commonPage.rightClickOnFindMyLocator(getIrctcWalletLocatorCss);
    }
    public void irctcOtherText(){
        commonPage.rightClickOnFindMyLocator(getIrctcOtherTextLocatorCss);
    }
    public void clickOnArrowButton(){
        waitForElementVisibility(irctcMovetoElement,50);
        moveToElement(irctcMovetoElement);
        driver.findElement(By.cssSelector(getArrowTextLocatorCss)).click();
        commonPage.rightClickOnFindMyLocator(ArrowTextLocatorCss);
    }

}
