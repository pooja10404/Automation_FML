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
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));


    }

    @Test
    public void irctcTest2(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_02");
        commonPage.launchUrl();
        irctcPage.clickOnToTextBox();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test
    public void irctcTest3(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_03");
        commonPage.launchUrl();
        irctcPage.clickOnAcFirstClassDropdown();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void irctcTest4(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_04");
        commonPage.launchUrl();
        irctcPage.clickOnGeneralDropdown();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test
    public void irctcTest5(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_05");
        commonPage.launchUrl();
        irctcPage.clickOnSearchButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void irctcTest6(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_06");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnDestinationTextBox();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }

    @Test
    public void irctcTest7(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_07");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnDestinationLocationIcon();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test
    public void irctcTest8() {
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_08");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnAllClassesDropdownList();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }

    @Test
    public void irctcTest9(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_09");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnFlexibleWithDateCheckbox();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void irctcTest10(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_10");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnPersonWithDisabilityConcessionCheckbox();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void irctcTest11(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_11");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnResultText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test
    public void irctcTest12(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_12");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnRunsOn();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }

    @Test
    public void irctcTest13(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_13");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnTotalTimeDuration();
        //commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        //commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void irctcTest14(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_14");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnBookNowButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void irctcTest15(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_15");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnRefreshButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void irctcTest16(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_16");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnHourLine();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }

    @Test
    public void irctcTest17(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_17");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.leftClickOnHourLine();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test
    public void irctcTest18(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_18");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.irctcOtherText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }
    @Test
    public void irctcTest19(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_19");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        irctcPage.irctcWalletLink();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }
    @Test
    public void irctcTest20(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_20");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnFooterLink();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test
    public void irctcTest21(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_21");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnArrowButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test
    public void irctcTest22(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_22");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnDateText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }

    @Test
    public void irctcTest23(){
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_23");
        commonPage.launchUrl();
        commonPage.irctcLoginDetails();
        irctcPage.clickOnBhopalText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }
}
