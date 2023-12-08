package pages;
import org.openqa.selenium.By;
import static base.BaseTest.driver;

public class DeveloperMozillaPage extends SeleniumUtility{
    public String getHtmlDemoFrameCss = "iframe[class='interactive is-tabbed-standard-height']";
    public String getExampleDomainIframeCss = "iframe[id='frame_a_simple_iframe']";


    public void clickOnHtmlDemoFrame()  {
        driver.findElement(By.cssSelector(getHtmlDemoFrameCss)).click();
    }

    public void clickOnExampleDomainIframe(){
        scrollingToElementofAPage(getExampleDomainIframeCss);
        driver.findElement(By.cssSelector(getExampleDomainIframeCss)).click();
    }

}
