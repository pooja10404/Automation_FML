package pages;
import org.openqa.selenium.By;
import static base.BaseTest.driver;

public class UitRgpvPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();

    public String getArrowCss = "div[class*='col-lg-']:nth-of-type(1)>div[class='footer_col'] ul[class='list-item']>i[class='la la-angle-right']:nth-of-type(1)";
    public String closeButton= "button[class='btn btn-secondary btn-sm']";
    public String getPhotoGalleryTextCss="div[class*='col-lg-']:nth-of-type(2) ul[class='list-item']>li:nth-of-type(1)>a";
    public String getplayButonCss="a[class='overlay-link play-now ripple']";
    public String helpSupportLink="div[class*='col-md-'] > h2";
    public String closeButtonOnHomePagePopUp= "button[class='btn-close']";
    public String ClickOnTheTextOnImage= "div[class*='col-md-']:nth-of-type(1)>div[class='ctg_content'] h4";

    public void arrowButton() {
        closeButton();
        scrollTillEndOfPage();
        driver.findElement(By.cssSelector(getArrowCss)).click();
    }

    public void closeButton(){
        waitForElementVisibility(closeButton, 20);
        driver.findElement(By.cssSelector(closeButton)).click();
    }

    public void closeButtonOnscreen()
    {
        waitForElementVisibility(closeButton, 20);
        commonPage.rightClickOnFindMyLocator(closeButtonOnHomePagePopUp);
    }

    public void clickOnTheImageText()
    {
        closeButton();
        scrollingToElementofAPage(ClickOnTheTextOnImage);
        commonPage.rightClickOnFindMyLocator(ClickOnTheTextOnImage);
    }

    public void photoGalleryText(){
        closeButton();
        scrollTillEndOfPage();
        commonPage.rightClickOnFindMyLocator(getPhotoGalleryTextCss);
    }

    public void playButton(){
        closeButton();
        scrollingToElementofAPage(helpSupportLink);
        waitForElementVisibility(getplayButonCss,20);
        commonPage.rightClickOnFindMyLocator(getplayButonCss);
    }
}
