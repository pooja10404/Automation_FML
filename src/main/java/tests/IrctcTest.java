package tests;
import base.BaseTest;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.IRCTCPage;
import java.util.Map;


public class IrctcTest extends BaseTest {

    IRCTCPage irctcPage = new IRCTCPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void irctcTest1(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_01");
        commonPage.launchUrl();
        irctcPage.clickOnFromTextBox();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));


    }

    @Test
    public void irctcTest2(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_23");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnBhopalText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }
}
