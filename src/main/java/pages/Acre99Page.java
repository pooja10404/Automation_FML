package pages;

import org.openqa.selenium.By;
import tests.Acre99Test;

import static base.BaseTest.driver;

public class Acre99Page extends SeleniumUtility {
    CommonPage commonpage=new CommonPage();

    public String ClickOnTheSuperOffer= "input[class='component__searchInput']";
    public String ClickOnTheforbuyers= " div[class='theader__PrimaryNav theader__with_indicator'] > div[data-label]:nth-of-type(1) > a";
    public String ClickOnThePostBuyers="div[data-custominfo='{\"custom_object\":{\"url\":\"/postproperty/\"}}'] div[class='style__post'] ";
    public String ClickOnThebuy="div[data-label='BUY']";
    public String CickOnTheProfile="div[data-label='USER_PROFILE_DROPDOWN']:nth-of-type(5) > i[class*='icon']";
    public String CickOnTheArticle="div[class*='footer']:nth-of-type(1) > ul[class='list_header_semiBold typoWhiteColor']>li:nth-of-type(8)>a[class='pageComponent typoWhiteColor']";
    public String CickOnTheSideUp="div[class*='iconS']";
    public String CickOnTheFbIcon="div[class='footer__appContainer']:nth-of-type(2) img[decoding='async']";

    public String Footer="  div[class='footer__footercolumn footer__contactus']";
    public String RentHome="img[alt='Renting a Home']";



    public void ClickOnTheSuperOffer(){
        driver.findElement(By.cssSelector(ClickOnTheSuperOffer)).click();

    }
    public void ClickOnTheForBuyers(){
        driver.findElement(By.cssSelector(ClickOnTheforbuyers)).click();

    }
    public void ClickOnThePostBuyers(){
        commonpage.rightClickOnFindMyLocator(ClickOnThePostBuyers);
    }

    public void  ClickOnTheBuy(){
        commonpage.rightClickOnFindMyLocator(ClickOnThebuy);
    }

    public void CickOnTheProfile(){
        commonpage.rightClickOnFindMyLocator(CickOnTheProfile);
    }

    public void CickOnTheArticle(){
        scrollTillEndOfPage();
        commonpage.rightClickOnFindMyLocator(CickOnTheArticle);
    }

    public void CickOnTheUpside(){
        scrollTillEndOfPage();
        commonpage.rightClickOnFindMyLocator(CickOnTheSideUp);
    }
    public void CickOnTheFbIcon(){
        scrollTillEndOfPage();
        scrollingToElementofAPage(Footer);
        commonpage.rightClickOnFindMyLocator(CickOnTheFbIcon);
    }

    public void RentingHome(){
        commonpage.rightClickOnFindMyLocator(RentHome);
    }

}

