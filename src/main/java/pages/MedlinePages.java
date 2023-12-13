package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static base.BaseTest.driver;

public class MedlinePages extends SeleniumUtility{
    public String getSearchBarCss = "input[id='search']";
    public String getSkuCss= "span[x-text='product_sku']";
       public void clickOnsearchBar()  {
        driver.findElement(By.cssSelector(getSearchBarCss)).click();
    }

    public void clickOnSku()  {
        driver.findElement(By.cssSelector(getSearchBarCss)).sendKeys("NON75100Z", Keys.ENTER);
        driver.findElement(By.cssSelector(getSkuCss)).click();
    }

}
