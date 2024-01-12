package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.Acre99Page;
import java.util.Map;

public class Acre99Test extends BaseTest {
    CommonPage commonPage = new CommonPage();
    Acre99Page acre =new Acre99Page();

    @Test(priority = 1)
    public void Acre_TC_01(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_01");
        commonPage.launchUrl();
        acre.ClickOnTheSuperOffer();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 2)
    public void Acre_TC_02(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_02");
        commonPage.launchUrl();
        acre.ClickOnTheForBuyers();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority = 3)
    public void Acre_TC_03(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_03");
        commonPage.launchUrl();
        acre.ClickOnThePostBuyers();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }
    @Test(priority = 4)
    public void Acre_TC_04(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_04");
        commonPage.launchUrl();
        acre.ClickOnTheBuy();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority = 5)
    public void Acre_TC_05(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_05");
        commonPage.launchUrl();
        acre.CickOnTheProfile();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }


    @Test(priority = 6)
    public void Acre_TC_06(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_06");
        commonPage.launchUrl();
        acre.CickOnTheArticle();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }

    @Test(priority = 7)
    public void Acre_TC_07(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_07");
        commonPage.launchUrl();
        acre.CickOnTheUpside();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 8)
    public void Acre_TC_08(){
        Map<String, String> values = commonPage.readExcel("Acre_TC_08");
        commonPage.launchUrl();
        acre.RentingHome();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
