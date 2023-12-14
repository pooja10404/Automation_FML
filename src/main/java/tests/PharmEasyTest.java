package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.PharmEasyPage;

import java.util.Map;


public class PharmEasyTest extends BaseTest {

    PharmEasyPage pharmEasyPage = new PharmEasyPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void pharmEasy01(){
        Map<String, String> values = commonPage.readExcel("Pharm_Easy_01");
        commonPage.launchUrl();
        pharmEasyPage.clickOnLookingForText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void pharmEasy02(){
        Map<String, String> values = commonPage.readExcel("Pharm_Easy_02");
        commonPage.launchUrl();
        pharmEasyPage.clickOnSearchCss();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }

    @Test
    public void pharmEasy03(){
        Map<String, String> values = commonPage.readExcel("Pharm_Easy_03");
        commonPage.launchUrl();
        pharmEasyPage.clickOnMedicineCss();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void pharmEasy04(){
        Map<String, String> values = commonPage.readExcel("Pharm_Easy_04");
        commonPage.launchUrl();
        pharmEasyPage.clickOnOrderMedlineText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }




}
