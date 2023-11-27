package tests;

import Urls.URLConstants;
import base.BaseTest;
import base.ExcelReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.IRCTCPage;
import pages.YonoBankPage;

import java.util.Collections;
import java.util.Map;

import static org.testng.Assert.*;

public class YonoBankTest extends BaseTest {
    YonoBankPage yonoBankPage = new YonoBankPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void yonoBankTest1() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("YONO_SBI_01");
        commonPage.launchUrl();

        yonoBankPage.clickOnSbiLogo();
        yonoBankPage.getUniqueLocatorsForYonoBank();

        // Assersion
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest2() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("YONO_SBI_02");
        commonPage.launchUrl();

        yonoBankPage.clickOnHeadingText();
        yonoBankPage.getUniqueLocatorsForYonoBank();

        // Assersion
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

//    @Test
//    public void yonoBankTest3() throws InterruptedException {
//        CommonPage commonPage = new CommonPage();
//        Map<String, String> values = commonPage.readExcel("YONO_SBI_03");
//        commonPage.launchUrl();
//
//        yonoBankPage.clickOnHeadingText();
//        yonoBankPage.getUniqueLocatorsForYonoBank();
//
//        // Assersion
//        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }


//    @Test
//    public void yonoBankTest4() throws InterruptedException {
//        CommonPage commonPage = new CommonPage();
//        Map<String, String> values = commonPage.readExcel("YONO_SBI_04");
//        commonPage.launchUrl();
//
//        yonoBankPage.clickOnHeadingText();
//        yonoBankPage.getUniqueLocatorsForYonoBank();
//
//        // Assersion
//        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }

    @Test
    public void yonoBankTest5() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("YONO_SBI_05");
        commonPage.launchUrl();

        yonoBankPage.clickOnInitiateOnlineImg();
        yonoBankPage.getUniqueLocatorsForYonoBank();

        // Assersion
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

//    @Test
//    public void yonoBankTest6() throws InterruptedException {
//        CommonPage commonPage = new CommonPage();
//        Map<String, String> values = commonPage.readExcel("YONO_SBI_06");
//        commonPage.launchUrl();
//
//        yonoBankPage.clickOnInitiateOnlineImg();
//        yonoBankPage.getUniqueLocatorsForYonoBank();
//
//        // Assersion
//        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }

    @Test
    public void yonoBankTest7() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("YONO_SBI_07");
        commonPage.launchUrl();

        yonoBankPage.clickOnSbiFooterText();
        yonoBankPage.getUniqueLocatorsForYonoBank();

        // Assersion
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest8() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("YONO_SBI_08");
        commonPage.launchUrl();

        yonoBankPage.clickOnSbiFooterText();
        yonoBankPage.getUniqueLocatorsForYonoBank();

        // Assersion
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

//    @Test
//    public void yonoBankTest9() throws InterruptedException {
//        CommonPage commonPage = new CommonPage();
//        Map<String, String> values = commonPage.readExcel("YONO_SBI_09");git
//        commonPage.launchUrl();
//
//        yonoBankPage.clickOnCreateMandatesForm();
//        yonoBankPage.getUniqueLocatorsForYonoBank();
//
//        // Assersion
//        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }
}