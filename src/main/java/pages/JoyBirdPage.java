package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.BaseTest.driver;


public class JoyBirdPage extends SeleniumUtility{
    CommonPage commonpage=new CommonPage();
    public String ClickOnTheSearchIcon ="svg[title='Search']";
    public String ClickOnTheCart="svg[class*='relative']";
    public String ByClickOnThePhotsLivingRoom="a[data-xc='living-room'] > span[class*='items-center']";

    public String ByClickOnTheShowRoom="ul[class*='flex-row']:nth-of-type(1)>li[class*='items-center']:nth-of-type(2) span";

    public String  ByClickOnFreeDesignText="button[class*='group']:nth-of-type(5)";
    public String getMessageIframeBoxText="iframe[class='hero-launcher-avatar']";
    public String clickonSustainability="div[class*='flex'] > div[class*='w-']:nth-of-type(1) > ul>li:nth-of-type(5)>a";

    public String messageIframe="iframe[data-qa='launcher-icon-iframe']";

    public String getLogPageViewCss="iframe[id='avo-debugger']";

    public void ClickOnTheSearchIcon() {
        driver.findElement(By.cssSelector(ClickOnTheSearchIcon)).click();
    }
    public void ClickOnTheCart() {
        driver.findElement(By.cssSelector(ClickOnTheCart)).click();
    }

    public void ByClickOnThePhotsLivingRoom(){
        commonpage.rightClickOnFindMyLocator(ByClickOnThePhotsLivingRoom);
    }
    public void ByClickOnTheShowRoom() {
        commonpage.rightClickOnFindMyLocator(ByClickOnTheShowRoom);

    }

    public void ByClickOnFreeDesignText() {
        waitForElementVisibility(ByClickOnFreeDesignText,20);
        driver.findElement(By.cssSelector(ByClickOnFreeDesignText)).click();
    }

    public void ClickOnMessageIframeBox() {
        driver.findElement(By.cssSelector(clickonSustainability)).click();
//        waitForElementVisibility(clickonCloseButton,40);
//        driver.findElement(By.cssSelector(clickonCloseButton)).click();
        scrollTillEndOfPage();
        waitForElementVisibility(clickonSustainability,60);
        WebElement iframe_element=driver.findElement(By.cssSelector(messageIframe));
        driver.switchTo().frame(iframe_element);
        commonpage.rightClickOnFindMyLocator(getMessageIframeBoxText);
        driver.switchTo().defaultContent();

    }

    public void ClickOnLogPageView() {
        scrollTillEndOfPage();
        driver.findElement(By.cssSelector(getLogPageViewCss)).click();
    }



}


