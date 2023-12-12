package pages;
import org.openqa.selenium.By;


import static base.BaseTest.driver;

public class AbhiVyaktipages extends SeleniumUtility{
    CommonPage commonpage=new CommonPage();

    public String ClickOnThePauseIcon ="div[class*='col-md-']:nth-of-type(3) div[class='video_icon'] img";
    public String ClickOnTheExperence ="div[class*='col-lg-']:nth-of-type(1) img[alt='garba mahotsav']";
    public String clickOnPrivacyPolicy=" div[class*='col-md-']:nth-of-type(4)>a:nth-of-type(1)";
    public String clickOnParagraph="div[id='workshops']:nth-of-type(5) p";
    public  String iframe=".g-recaptcha";

    public void ClickOnThePauseIconOnScreen(){
        driver.findElement(By.cssSelector(ClickOnThePauseIcon)).click();
    }
    public void ClickOnTheParagraphOnHomePage(){
        driver.findElement(By.cssSelector(clickOnParagraph)).click();
    }

    public void ClickOnTheYearOfExperience(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheExperence);
    }
    public void ClickOnThePrivacyPolicyOnHomePgae(){
        commonpage.rightClickOnFindMyLocator(clickOnPrivacyPolicy);
    }
    public void ClickOnTheIframeOnPage(){
        scrollTillEndOfPage();
        commonpage.rightClickForIframeLocator(iframe);
    }
}
