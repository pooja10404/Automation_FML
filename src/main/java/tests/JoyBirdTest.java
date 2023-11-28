package tests;

import Urls.URLConstants;
import base.BaseTest;
import base.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.IRCTCPage;
import pages.SeleniumUtility;

import java.util.Collections;
import java.util.Map;

import static org.testng.Assert.*;

public class IrctcTest extends BaseTest {

    IRCTCPage irctcPage = new IRCTCPage();
    CommonPage commonPage = new CommonPage();
//    @Test(priority=1)
//    public void irctcTest1() throws InterruptedException {
//        CommonPage commonPage = new CommonPage();
//        Map<String, String> values = commonPage.readExcel("IRCTC_TC_01");
//        commonPage.launchUrl();
//        irctcPage.clickOnFromTextBox();
//        irctcPage.getFromTextBoxLocators();
//        // Assersion
//        irctcPage.assertionForgetBookTicketUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//    }
//    @Test(priority=2)
//    public void irctcTest2() throws InterruptedException {
//        CommonPage commonPage = new CommonPage();
//        Map<String, String> values = commonPage.readExcel("IRCTC_TC_02");
//        commonPage.launchUrl();
//        irctcPage.clickToFromTextBox();
//        irctcPage.getFromTextBoxLocators();
//        // Assersion
//        irctcPage.assertionForgetBookTicketUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
//
//    }
}
