package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.BaseTest.driver;

public class jeevanPramaanPage extends SeleniumUtility{
    CommonPage commonpage=new CommonPage();

    public String ClickOnTheLogo="img[alt='Logo']";
    public String ClickOnTheHomeButton="li[class] > a[class='scroll']";
    public String ClickOnTheLocateButton="ul[class='nav main-nav']>li:nth-of-type(4)>a[class='scroll']";
    public String ClickOnTheHelpText="p[class='footer-text copyright']:nth-of-type(1)>a:nth-of-type(1)";
    public String ClickOnTheFooterLine = "p[class='footer-text copyright']:nth-of-type(4)";
    public void ClickOnTheJeevanPravanLogo(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheLogo);
    }
    public void ClickOnTheHomeButton(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheHomeButton);
    }
    public void ClickOnTheLocateCenter(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheLocateButton);
    }
    public void ClickOnTheHelpTextOnFooter(){
        scrollTillEndOfPage();
        commonpage.rightClickOnFindMyLocator(ClickOnTheHelpText);
    }
    public void ClickOnTheFooterLine(){
        scrollTillEndOfPage();
        commonpage.rightClickOnFindMyLocator(ClickOnTheFooterLine);
    }
}
