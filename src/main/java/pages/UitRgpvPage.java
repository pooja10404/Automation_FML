package pages;
import org.openqa.selenium.By;
import static base.BaseTest.driver;

public class UitRgpvPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();

    public String getArrowCss = "div[class*='col-lg-']:nth-of-type(1)>div[class='footer_col'] ul[class='list-item']>i[class='la la-angle-right']:nth-of-type(1)";
    public String closeButton= "button[class='btn btn-secondary btn-sm']";

    public void ArrowButton() {
        CloseButton();
        scrollTillEndOfPage();
        driver.findElement(By.cssSelector(getArrowCss)).click();
    }

    public void CloseButton() {
        waitForElementVisibility(closeButton, 20);
        driver.findElement(By.cssSelector(closeButton)).click();
    }

}
