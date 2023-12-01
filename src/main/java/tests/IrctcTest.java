package tests;
import base.BaseTest;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.IRCTCPage;

import java.time.Duration;
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
    public void irctcTest21() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_21");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        irctcPage.clickOnArrowButton();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test
    public void irctcTest22(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_22");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnDateText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }

    @Test
    public void irctcTest23(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_23");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnBhopalText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }
}
