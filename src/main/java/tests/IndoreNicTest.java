package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.IndoreNicPage;

import java.util.Map;

public class IndoreNicTest extends BaseTest {
    IndoreNicPage indoreNicPage = new IndoreNicPage();
    CommonPage commonPage = new CommonPage();

//    @Test
//    public void indoreNicTest1() throws InterruptedException {
//
//        Map<String, String> values = commonPage.readExcel("INDORE_NIC_01");
//        commonPage.launchUrl();
//        indoreNicPage.clickOnAboutDistrictDropdown();
//        Thread.sleep(5000);
//        indoreNicPage.getAboutDistrictDropdownLocators();
//        Thread.sleep(5000);
//
//        // Assersion
//        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }


//    @Test
//    public void indoreNicTest2() throws InterruptedException {
//
//        Map<String, String> values = commonPage.readExcel("INDORE_NIC_02");
//        commonPage.launchUrl();
//        indoreNicPage.clickOnWebsitePolices();
//        Thread.sleep(5000);
//        indoreNicPage.getAboutDistrictDropdownLocators();
//        Thread.sleep(5000);
//
//        // Assersion
//        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }

//    @Test
//    public void indoreNicTest3() throws InterruptedException {
//
//        Map<String, String> values = commonPage.readExcel("INDORE_NIC_03");
//        commonPage.launchUrl();
//        indoreNicPage.clickOnElectionCommition();
//
//        Thread.sleep(5000);
//        indoreNicPage.getAboutDistrictDropdownLocators();
//        Thread.sleep(5000);
//
//        // Assersion
//        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }

    @Test
    public void indoreNicTest4() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_04");
        commonPage.launchUrl();
        indoreNicPage.clickOnCopyRightText();

        Thread.sleep(5000);
        indoreNicPage.getAboutDistrictDropdownLocators();
        Thread.sleep(5000);

        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void indoreNicTest5() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_05");
        commonPage.launchUrl();
        indoreNicPage.clickOnJointDirectorText();

        Thread.sleep(5000);
        indoreNicPage.getAboutDistrictDropdownLocators();
        Thread.sleep(5000);

        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }


//    @Test
//    public void indoreNicTest6() throws InterruptedException {
//
//        Map<String, String> values = commonPage.readExcel("INDORE_NIC_06");
//        commonPage.launchUrl();
//        indoreNicPage.clickOnNewConnectionTabBox();
//
//        //Thread.sleep(5000);
//        indoreNicPage.getAboutDistrictDropdownLocators();
//        Thread.sleep(5000);
//
//        // Assersion
//        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }

    @Test
    public void indoreNicTest7() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_07");
        commonPage.launchUrl();
        indoreNicPage.clickOnMasterPlanText();

        //Thread.sleep(5000);
        indoreNicPage.getAboutDistrictDropdownLocators();
        Thread.sleep(5000);

        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void indoreNicTest8() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_08");
        commonPage.launchUrl();
        indoreNicPage.clickOnIndoreDistrictNameText();

        //Thread.sleep(5000);
        indoreNicPage.getAboutDistrictDropdownLocators();
        Thread.sleep(5000);

        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void indoreNicTest9() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_09");
        commonPage.launchUrl();
        indoreNicPage.clickStdAndPinCodeText();

        //Thread.sleep(5000);
        indoreNicPage.getAboutDistrictDropdownLocators();
        Thread.sleep(5000);

        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void indoreNicTest10() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_10");
        commonPage.launchUrl();
        indoreNicPage.clickPostOfficeText();

        indoreNicPage.getAboutDistrictDropdownLocators();
        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void indoreNicTest11() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_11");
        commonPage.launchUrl();
        indoreNicPage.clickPinCodeBoxText();

        indoreNicPage.getAboutDistrictDropdownLocators();
        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }


}
