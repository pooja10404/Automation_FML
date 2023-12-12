package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class indiaPostPage extends SeleniumUtility {
    CommonPage commonpage=new CommonPage();


    public String clickOnlogo="img[id='india-post-logo']";
    public String clickOnEmblem="img[id='emblem-of-india-logo']";
    public String clickOnTheSliderimage="img[alt*='Web']";
    public String clickOnTheTracklogo="img[id='feature-box-item-image/']";
    public String clickOnTheRadioLogo=" label[class='control-label radio-inline']:nth-of-type(3) > input[id*='ctl']";
    public String clickOnThecaptch="img[id*='ctl']";
    public String TrackNowButton="input[class*='btn']";

    public String CompliantBox="input[aria-label='Enter a valid consignment number']";

    public String HelpLinebutton="div[id='feature-box-item-helpline'] > h4:nth-of-type(1)";
    public String clickOnTelephopne="img[alt='Calculate Postage']";

    public void ClickOnTheLogoOfWebsite() {
        commonpage.rightClickOnFindMyLocator(clickOnlogo);
    }

    public void ClickOnTheEmblemLogo() {
      driver.findElement(By.cssSelector(clickOnEmblem)).click();
    }

    public void ClickOnTheSliderImage() {
        driver.findElement(By.cssSelector(clickOnTheSliderimage)).click();
    }

    public void clickOnTheTracklogo() {
        driver.findElement(By.cssSelector(clickOnTheTracklogo)).click();
    }

    public void clickOnTheRadioButton() {
        driver.findElement(By.cssSelector(clickOnTheRadioLogo)).click();
    }

    public void InputTextBoxOfComplaintBox() {
        commonpage.waitForElementVisibility(CompliantBox,10);
        driver.findElement(By.cssSelector(CompliantBox)).click();
    }

    public void clickOnThecaptchaText() {
        driver.findElement(By.cssSelector(clickOnThecaptch)).click();
    }
    public void clickOnTheTrackNowButton() {
        driver.findElement(By.cssSelector(TrackNowButton)).click();
    }

    public void clickOnTheHelplineImg() {
        driver.findElement(By.cssSelector(HelpLinebutton)).click();
    }

    public void ClickOnTelephoneImg() {
        commonpage.rightClickOnFindMyLocator(clickOnTelephopne);
    }
}
