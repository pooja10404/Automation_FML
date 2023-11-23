package tests;

import Urls.URLConstants;
import base.BaseTest;
import base.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.IRCTCPage;

import java.util.Collections;
import java.util.Map;

import static org.testng.Assert.*;

public class IrctcTest extends BaseTest {

    IRCTCPage irctcPage = new IRCTCPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void irctcTest1() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_01");
        commonPage.launchUrl();
        irctcPage.clickOnFromTextBox();
        Thread.sleep(5000);
        irctcPage.getFromTextBoxLocators();
        Thread.sleep(5000);

        // Assersion
        irctcPage.assertionForgetBookTicketUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }
}
