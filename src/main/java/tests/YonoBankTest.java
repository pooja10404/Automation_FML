package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.YonoBankPage;
import java.util.Map;

public class YonoBankTest extends BaseTest {
    YonoBankPage yonoBankPage = new YonoBankPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void yonoBankTest1() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_01");
        commonPage.launchUrl();
        yonoBankPage.clickOnSbiLogo();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest2() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_02");
        commonPage.launchUrl();
        yonoBankPage.clickOnHeadingText();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest3() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_03");
        commonPage.launchUrl();
        yonoBankPage.clickOnLoginButton();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }


    @Test
    public void yonoBankTest4() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_04");
        commonPage.launchUrl();
        yonoBankPage.clickOnRegisterButton();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest5() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_05");
        commonPage.launchUrl();
        yonoBankPage.clickOnInitiateOnlineImg();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest6() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_06");
        commonPage.launchUrl();
        yonoBankPage.clickOnPrivacyStatementText();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest7() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_07");
        commonPage.launchUrl();
        yonoBankPage.clickOnSbiFooterText();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest8() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_08");
        commonPage.launchUrl();
        yonoBankPage.clickOnCreateMandateText();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void yonoBankTest9() throws InterruptedException {
        Map<String, String> values = commonPage.readExcel("YONO_SBI_09");
        commonPage.launchUrl();
        yonoBankPage.clickOnCreateMandatesForm();
        yonoBankPage.getUniqueLocatorsForYonoBank();
        yonoBankPage.assertionForYonoSbiUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }
}
