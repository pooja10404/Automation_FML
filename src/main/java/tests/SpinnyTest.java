package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.SpinnyPage;

import java.util.Map;

public class SpinnyTest extends BaseTest {
    SpinnyPage spinnyPage=new SpinnyPage();
    CommonPage commonPage = new CommonPage();

    @Test(priority = 1)
    public void Spinny_TC_01(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_01");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheViewOnYourCar();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 2)
    public void Spinny_TC_02(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_02");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheBuyCar();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 3)
    public void Spinny_TC_03(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_03");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheShortList();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 4)
    public void Spinny_TC_04(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_04");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheExplore();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority = 5)
    public void Spinny_TC_05(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_05");
        commonPage.launchUrl();
        spinnyPage.ClickOnThePriceRange();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 6)
    public void Spinny_TC_06(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_06");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheBuyCarDown();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority = 7)
    public void Spinny_TC_07(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_07");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheQuote();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 8)
    public void Spinny_TC_08(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_08");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheUsedCarAtSpinny();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 9)
    public void Spinny_TC_09(){
        Map<String, String> values = commonPage.readExcel("Spinny_TC_09");
        commonPage.launchUrl();
        spinnyPage.ClickOnTheFbLogo();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
