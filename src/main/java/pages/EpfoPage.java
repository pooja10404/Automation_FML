package pages;
import org.openqa.selenium.By;
import static base.BaseTest.driver;

public class EpfoPage extends SeleniumUtility
{
    CommonPage commonpage=new CommonPage();
    public String ClickOnTheEase ="span[class='nor_letter']:nth-of-type(2)";
    public String ClickOnTheHomeText ="div[id='footer_link'] a:nth-of-type(1)";
    public String ClickOnTheOperatingText ="div[class='iternl_wrkr'] > span[class='nor_letter']:nth-of-type(2)";

    public String ClickOnTheOwned="span[id='copyrt']";

    public void ClickOnTheTextOfEase() {
        driver.findElement(By.cssSelector(ClickOnTheEase)).click();
    }
    public void ClickOnTheFooterHomeText() throws InterruptedException {
        commonpage.rightClickOnFindMyLocator(ClickOnTheHomeText);
    }

    public void ClickOnTheOperatingTextOnHomePage() throws InterruptedException {
        driver.findElement(By.cssSelector(ClickOnTheOperatingText)).click();
    }
    public void ClickOnTheFooterOwnedText() throws InterruptedException {
        driver.findElement(By.cssSelector(ClickOnTheOwned)).click();
    }
}
