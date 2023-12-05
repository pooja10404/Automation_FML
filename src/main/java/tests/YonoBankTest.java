package tests;
import base.BaseTest;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.YonoBankPage;

import java.time.Duration;
import java.util.Map;

public class YonoBankTest extends BaseTest {
    YonoBankPage yonoBankPage = new YonoBankPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void yonoBankTest1()  {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_01");
        commonPage.launchUrl();
        yonoBankPage.clickOnSbiLogo();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest2()  {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_02");
        commonPage.launchUrl();
        yonoBankPage.clickOnHeadingText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));


    }

    @Test
    public void yonoBankTest3(){
        Map<String, String> values = commonPage.readExcel("YONO_SBI_03");
        commonPage.launchUrl();
        yonoBankPage.clickOnLoginButton();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));


    }


    @Test
    public void yonoBankTest4(){
        Map<String, String> values = commonPage.readExcel("YONO_SBI_04");
        commonPage.launchUrl();
        yonoBankPage.clickOnRegisterButton();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));


    }

    @Test
    public void yonoBankTest5(){
        Map<String, String> values = commonPage.readExcel("YONO_SBI_05");
        commonPage.launchUrl();
        yonoBankPage.clickOnInitiateOnlineImg();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }

    @Test
    public void yonoBankTest6(){
        Map<String, String> values = commonPage.readExcel("YONO_SBI_06");
        commonPage.launchUrl();
        yonoBankPage.clickOnPrivacyStatementText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }

    @Test
    public void yonoBankTest7()  {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_07");
        commonPage.launchUrl();
        yonoBankPage.clickOnSbiFooterText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }

    @Test
    public void yonoBankTest8(){
        Map<String, String> values = commonPage.readExcel("YONO_SBI_08");
        commonPage.launchUrl();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        yonoBankPage.clickOnCreateMandateText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest9(){
        Map<String, String> values = commonPage.readExcel("YONO_SBI_09");
        commonPage.launchUrl();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        yonoBankPage.clickOnCreateMandatesForm();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }
}
