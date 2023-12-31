package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class indiaPostPage extends SeleniumUtility {
    CommonPage commonpage = new CommonPage();

    public String clickOnlogo = "img[id='india-post-logo']";
    public String clickOnEmblem = "img[id='emblem-of-india-logo']";
    public String clickOnTheSliderimage = "img[alt*='Web']";
    public String clickOnTheTracklogo = "img[id='feature-box-item-image/']";
    public String clickOnTheRadioLogo = " label[class='control-label radio-inline']:nth-of-type(3) > input[id*='ctl']";
    public String clickOnThecaptch = "img[id*='ctl']";
    public String TrackNowButton = "input[class*='btn']";
    public String CompliantBox = "input[aria-label='Enter a valid consignment number']";
    public String HelpLinebutton = "div[id='feature-box-item-helpline'] > h4:nth-of-type(1)";
    public String clickOnTelephopne = "img[alt='Calculate Postage']";
    public String clickOnMenu = "nav[id='slide-menu_multilevelpushmenu'] > div[class='levelHolderClass ltr'] > p";
    public String clickOnAboutUs = "nav[id='slide-menu_multilevelpushmenu'] > div[class='levelHolderClass ltr'] > ul>li:nth-of-type(1)>a";
    public String clickOnImage = "img[alt='Shri Ashwini Vaishnaw, MOC']";
    public String clickOnText = "a[title*='Allocation'] > p";
    public String clickOnlogoFacebook = "img[alt='facebook page']";
    public String clickOnCheckedButton = "input[checked='checked']";
    public String clickOnPinCode = "input[title*='from']";
    public String ClickOnTheGetAvailable = "input[aria-label='Get Available Services']";
    public String ClickOnTheTcsLinkUrl = "a[rel='noopener noreferrer'] > strong";

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
        commonpage.waitForElementVisibility(CompliantBox, 10);
        driver.findElement(By.cssSelector(CompliantBox)).click();
    }
    public void clickOnThecaptch() {
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
    public void ClickOnTheMenuButton() {
        driver.findElement(By.cssSelector(clickOnMenu)).click();
    }
    public void ClickOnTheAboutUsButton() {
        commonpage.rightClickOnFindMyLocator(clickOnAboutUs);
    }
    public void ClickOnTheImageMoc() {
        driver.findElement(By.cssSelector(clickOnImage)).click();
    }
    public void ClickOnTheTextInsideNewsUpdate() {
        commonpage.rightClickOnFindMyLocator(clickOnText);
    }
    public void ClickOnTheFaceBookLogo() {
        commonpage.rightClickOnFindMyLocator(clickOnlogoFacebook);
    }
    public void ClickOnCheckedRadioButton() {
        driver.findElement(By.cssSelector(clickOnCheckedButton)).click();
    }
    public void ClickOnPinCodeInputFiled() {
        driver.findElement(By.cssSelector(clickOnPinCode)).click();
    }
    public void ClickOnTheGetAvailabelButton() {
        driver.findElement(By.cssSelector(ClickOnTheGetAvailable)).click();
    }
    public void ClickOnTheTCSLink() {
        commonpage.rightClickOnFindMyLocator(ClickOnTheTcsLinkUrl);
    }
}
