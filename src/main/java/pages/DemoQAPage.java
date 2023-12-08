package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.BaseTest.driver;

public class DemoQAPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();
    public String getTextBoxCss = "div[class='element-list collapse show'] > ul[class='menu-list']>li[id*='item-']:nth-of-type(1)>span[class='text']";
    public String getAlertFrameWindowTextCss = "div[class*='card']:nth-of-type(3)>div h5";
    public String getDoYouLikeTextCss = "div[class*='mb-']";
    public String getMultiSelectDropdownCss = "div[class='row'] > div[class*='col-md-'] > div[class*='css-'] > div[class*='css-'] > div[class*='css-']:nth-of-type(1)";

    public String getMenuItemCss = "ul[id='nav']>li:nth-of-type(1)>a";
    public String samplePageHeadingTextcss = "h1[id='sampleHeading']";

    public String samplePageFramecss = "div[id='frame1Wrapper']";

    public String samplePageFrameOne = "frame1";

    public String samplePageFrameTwo = "frame2";

    public void clickOnTextBox(){
        commonPage.rightClickOnFindMyLocator(getTextBoxCss);
    }
    public void clickOnAlertFrameWindowText(){
        scrollTillEndOfPage();
        commonPage.rightClickOnFindMyLocator(getAlertFrameWindowTextCss);
    }
    public void clickOnDoYouLikeText(){
        driver.findElement(By.cssSelector(getDoYouLikeTextCss)).click();
    }

    public void clickOnMultiSelectDropdown(){
        scrollTillEndOfPage();
        commonPage.rightClickOnFindMyLocator(getMultiSelectDropdownCss);
    }

    public void clickOnMenuItem()  {
        driver.findElement(By.cssSelector(getMenuItemCss)).click();
    }
    public void clickOnSamplePage()  {
        driver.findElement(By.cssSelector(samplePageFramecss)).click();
    }
    public void clickOnSamplePageHeadingText()  {
        WebElement iframe_element=driver.findElement(By.id(samplePageFrameOne));
        driver.switchTo().frame(iframe_element);
        driver.findElement(By.cssSelector(samplePageHeadingTextcss)).click();
        driver.switchTo().defaultContent();
    }

    public void
    clickOnSamplePageSecondHeadingText()  {
        scrollTillEndOfPage();
        WebElement iframe_element=driver.findElement(By.id(samplePageFrameTwo));
        driver.switchTo().frame(iframe_element);
        driver.findElement(By.cssSelector(samplePageHeadingTextcss)).click();
        driver.switchTo().defaultContent();
    }

    public void clickOnParentFramePage()  {
        scrollTillEndOfPage();
        driver.findElement(By.cssSelector(samplePageFramecss)).click();
    }
}
