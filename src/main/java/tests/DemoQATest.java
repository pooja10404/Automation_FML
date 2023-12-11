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

    @Test
    public void demoQA6(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_Iframe_06");
        commonPage.launchUrl();
        demoQAPage.clickOnSamplePage();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
    }

    @Test
    public void demoQA7(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_Iframe_07");
        commonPage.launchUrl();
        demoQAPage.clickOnSamplePageHeadingText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }


    @Test
    public void demoQA8(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_Iframe_08");
        commonPage.launchUrl();
        demoQAPage.clickOnSamplePageSecondHeadingText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void demoQA9(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_Iframe_09");
        commonPage.launchUrl();
        demoQAPage.clickOnParentFramePage();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void demoQA10(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_10");
        commonPage.launchUrl();
        demoQAPage.clickOnFemaleRadioButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }

    @Test
    public void demoQA11(){
        Map<String, String> values = commonPage.readExcel("Demo_QA_11");
        commonPage.launchUrl();
        demoQAPage.clickOnReadingCheckbox();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }






}
