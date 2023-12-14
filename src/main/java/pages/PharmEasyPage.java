package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class PharmEasyPage extends SeleniumUtility {
    CommonPage commonPage = new CommonPage();
    public String getLookingForTextCss = "div[class='c-IkEYc c-IkEYc-idhSfxX-css'] > div[class*='c-PJLV'] > div[class*='c-PJLV'] > span[class*='c-kkmdlQ']";
    public String getSearchCss = "div[class='c-PJLV c-bXbWpx c-bXbWpx-icOztnM-css'] > div[class*='c-PJLV']:nth-of-type(1)";
    public String getMedicineCss="div[id*='discoverOfferings-']:nth-of-type(1) span[class*='c-kkmdlQ']:nth-of-type(1)";
    public String getOrderMedlineCss="h1[class='OrderMedicine_lhsHeader__ZvTts']";

    public void clickOnLookingForText() {
        driver.findElement(By.cssSelector(getLookingForTextCss)).click();
    }

    public void clickOnSearchCss() {
        commonPage.rightClickOnFindMyLocator(getSearchCss);
    }

    public void clickOnMedicineCss() {
        commonPage.rightClickOnFindMyLocator(getMedicineCss);
    }
    public void clickOnOrderMedlineText() {
        driver.findElement(By.cssSelector(getMedicineCss)).click();
        driver.findElement(By.cssSelector(getOrderMedlineCss)).click();
    }

}
