package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.IndoreNicPage;

import java.util.Map;

public class IndoreNicTest extends BaseTest {
    IndoreNicPage indoreNicPage = new IndoreNicPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void indoreNicTest1(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_01");
        commonPage.launchUrl();
        indoreNicPage.clickOnAboutDistrictDropdown();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));


    }


    @Test
    public void indoreNicTest2(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_02");
        commonPage.launchUrl();
        indoreNicPage.clickOnWebsitePolices();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }


    @Test
    public void indoreNicTest3(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_03");
        commonPage.launchUrl();
        indoreNicPage.clickOnElectionCommition();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));


    }

    @Test
    public void indoreNicTest4(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_04");
        commonPage.launchUrl();
        indoreNicPage.clickOnCopyRightText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));


    }

    @Test
    public void indoreNicTest5(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_05");
        commonPage.launchUrl();
        indoreNicPage.clickOnJointDirectorText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }


    @Test
    public void indoreNicTest6(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_06");
        commonPage.launchUrl();
        indoreNicPage.clickOnNewConnectionTabBox();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void indoreNicTest7(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_07");
        commonPage.launchUrl();
        indoreNicPage.clickOnMasterPlanText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }

    @Test
    public void indoreNicTest8(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_08");
        commonPage.launchUrl();
        indoreNicPage.clickOnIndoreDistrictNameText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }

    @Test
    public void indoreNicTest9(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_09");
        commonPage.launchUrl();
        indoreNicPage.clickStdAndPinCodeText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }

    @Test
    public void indoreNicTest10(){
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_10");
        commonPage.launchUrl();
        indoreNicPage.clickPostOfficeText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void indoreNicTest11()  {
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_11");
        commonPage.launchUrl();
        indoreNicPage.clickPinCodeBoxText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }
    @Test
    public void indoreNicTest12()  {
        Map<String, String> values = commonPage.readExcel("INDORE_NIC_12");
        commonPage.launchUrl();
        indoreNicPage.clickCollectrateText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }



}

