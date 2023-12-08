package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class K8omsPage extends SeleniumUtility{

    public String getK8mosIframeCss = "iframe[id='1ab4fb516639a32a_5']";

    public void clickOnK8mosIframe()  {
        scrollTillEndOfPage();
        driver.findElement(By.cssSelector(getK8mosIframeCss)).click();
    }


}
