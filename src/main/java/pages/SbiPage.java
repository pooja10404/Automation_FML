package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class SbiPage  extends SeleniumUtility{
    CommonPage commonpage=new CommonPage();

    public String ClickOnTheSbiLogo ="img[alt='SBI Home Loan']";
    public String ClickOnTheAbout ="ul[class='clearfix'] a[title='About Us']";
    public String ClickOnTheApplicationTracker="a[class='call-back-btn']";
    public String ClickOnTheProduct="div[class='product-head'] span";
    public String ClickOnTheSbi="div[class='owl-item']:nth-of-type(2) span";
    public String ClickOnTheSbiImg="img[alt='Home Loan EMI Calculator']";
    public String ClickOnTheAppStore="img[a]";
    public String ClickOnTheCibilScore="a[class='cred-score-link'] > img";

    public void ClickOnTheSbiLogo(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheSbiLogo);
    }
    public void ClickOnTheAboutUs(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheAbout);
    }

    public void ClickOnTheApplicationTracker(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheApplicationTracker);
    }

    public void ClickOnTheOurProducts(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheProduct);
    }

    public void ClickOnTheSbi(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheSbi);
    }

    public void ClickOnTheCalculatorImg(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheSbiImg);
    }

    public void ClickOnTheAppStore(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheAppStore);
    }

    public void ClickOnTheCibilScore(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheCibilScore);
    }
}
