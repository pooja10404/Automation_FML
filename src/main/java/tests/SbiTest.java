package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.SbiPage;

import java.util.Map;

public class SbiTest extends BaseTest {
    SbiPage sbipage=new SbiPage();

    CommonPage commonPage = new CommonPage();

    @Test(priority = 1)
    public void Sbi_TC_01(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_01");
        commonPage.launchUrl();
        sbipage.ClickOnTheSbiLogo();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority =2 )
    public void Sbi_TC_02(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_02");
        commonPage.launchUrl();
        sbipage.ClickOnTheAboutUs();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority =3)
    public void Sbi_TC_03(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_03");
        commonPage.launchUrl();
        sbipage.ClickOnTheApplicationTracker();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority =4)
    public void Sbi_TC_04(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_04");
        commonPage.launchUrl();
        sbipage.ClickOnTheOurProducts();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority =5)
    public void Sbi_TC_05(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_05");
        commonPage.launchUrl();
        sbipage.ClickOnTheSbi();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }


    @Test(priority =6)
    public void Sbi_TC_06(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_06");
        commonPage.launchUrl();
        sbipage.ClickOnTheCalculatorImg();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority =7)
    public void Sbi_TC_07(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_07");
        commonPage.launchUrl();
        sbipage.ClickOnTheAppStore();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority =8)
    public void Sbi_TC_08(){
        Map<String, String> values = commonPage.readExcel("Sbi_TC_08");
        commonPage.launchUrl();
        sbipage.ClickOnTheCibilScore();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
