package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static base.BaseTest.driver;
public class JoyBirdPage extends SeleniumUtility{
    public String ClickOnTheSearchIcon ="svg[title='Search']";
    public String ClickOnTheCart="svg[class*='relative']";
    public String ByClickOnThePhotsLivingRoom="a[data-xc='living-room'] > span[class*='items-center']";

    public String ByClickOnTheShowRoom="ul[class*='flex-row']:nth-of-type(1)>li[class*='items-center']:nth-of-type(2) span";

    public String  ByClickOnFreeDesignText="button[class*='group']:nth-of-type(5)";

    public void ClickOnTheSearchIcon() {
        driver.findElement(By.cssSelector(ClickOnTheSearchIcon)).click();
    }
    public void ClickOnTheCart() {
        driver.findElement(By.cssSelector(ClickOnTheCart)).click();
    }

    public void ByClickOnThePhotsLivingRoom()  {
        driver.findElement(By.cssSelector(ByClickOnThePhotsLivingRoom)).click();
    }
    public void ByClickOnTheShowRoom() {
        driver.findElement(By.cssSelector(ByClickOnTheShowRoom)).click();
    }

    public void ByClickOnFreeDesignText() {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ByClickOnFreeDesignText)));
        driver.findElement(By.cssSelector(ByClickOnFreeDesignText)).click();
    }


}


