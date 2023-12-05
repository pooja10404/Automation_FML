package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DemoQAPage;
import pages.FreeJobAlertPage;
import pages.FreshersJobPage;

import java.time.Duration;
import java.util.Map;


public class DemoQATest extends BaseTest {
    DemoQAPage demoQAPage = new DemoQAPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void demoQA1(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_01");
        commonPage.launchUrl();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        demoQAPage.clickOnTextBox();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void demoQA2(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_02");
        commonPage.launchUrl();
        demoQAPage.clickOnAlertFrameWindowText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void demoQA3() {
        Map<String, String> values = commonPage.readExcel("Demo_QA_03");
        commonPage.launchUrl();
        demoQAPage.clickOnDoYouLikeText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }
    @Test
    public void demoQA4(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_04");
        commonPage.launchUrl();
        demoQAPage.clickOnMultiSelectDropdown();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void demoQA5(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_05");
        commonPage.launchUrl();
        demoQAPage.clickOnMenuItem();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }





}
