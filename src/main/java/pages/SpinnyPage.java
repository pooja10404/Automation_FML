package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class SpinnyPage {

    CommonPage commonpage=new CommonPage();


    public String ClickOnTheViewOnYourCar ="input[class='styles__searchInput styles__forGTM']";
    public String ClickOnTheBuyCar ="a[class='styles__desktopNavItem'] > span";
    public String ClickOnTheShortList ="div[class='styles__shorlistIconWrap'] > svg[fill='none']";
    public String ClickOnTheExplore ="li[class='ExploreBy__listItem ExploreBy__exploreHeading']";
    public String ClickOnThePriceRange ="li[class='ExploreBy__listItem ExploreBy__listItemDropdown']:nth-of-type(2)";

    public String ClickOnTheBuyCarDown ="button[class*='BuyAndSellTabDesktop']";
    public String ClickOnThePointImg ="li:nth-of-type(1) img[class='Image__animateOpacity BuyCarTabDesktop__background']";
    public String ClickOnTheBrowseCar ="a[class='SpinnyDesktopFooter__callSection']:nth-of-type(1)";

    public String ClickOnTheUsedCarAtSpinny ="h3[class*='SpinnyDesktopFooter'] > a[class*='SpinnyDesktopFooter']";
    public String ClickOnTheFbLogo ="a[aria-label='facebook'] > svg";


    public void ClickOnTheViewOnYourCar(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheViewOnYourCar);
    }
    public void ClickOnTheBuyCar(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheBuyCar);
    }
    public void ClickOnTheShortList(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheShortList);
    }
    public void ClickOnTheExplore(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheExplore);
    }
    public void ClickOnThePriceRange(){
        commonpage.rightClickOnFindMyLocator(ClickOnThePriceRange);
    }
    public void ClickOnTheBuyCarDown(){
        driver.findElement(By.cssSelector(ClickOnTheBuyCarDown)).click();
    }
    public void ClickOnTheUsedCarAtSpinny(){
        commonpage.rightClickOnFindMyLocator(ClickOnTheUsedCarAtSpinny);
    }

    public void ClickOnTheQuote(){
        commonpage.scrollTillEndOfPage();
        commonpage.rightClickOnFindMyLocator(ClickOnTheBrowseCar);
    }

    public void ClickOnTheFbLogo(){
        commonpage.scrollTillEndOfPage();
        commonpage.rightClickOnFindMyLocator(ClickOnTheFbLogo);
    }



}
