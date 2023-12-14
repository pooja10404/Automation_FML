package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.CommonPage;
import pages.jeevanPramaanPage;
import java.util.Map;


public class jeevanPramaanTest extends BaseTest {
    jeevanPramaanPage jeevanpramaanPage = new jeevanPramaanPage();

    @Test(priority = 1)
    public void JEEVAN_PRAMAAN_01() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_01");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheJeevanPravanLogo();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 2)
    public void JEEVAN_PRAMAAN_02() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_02");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnThePencilButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"), values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"), values.get("TextLocatorXpath"));

    }

    @Test(priority = 3)
    public void JEEVAN_PRAMAAN_03() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_03");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheLocateCenter();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"), values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"), values.get("TextLocatorXpath"));

    }

    @Test(priority = 4)
    public void JEEVAN_PRAMAAN_04() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_04");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheHelpTextOnFooter();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"), values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"), values.get("TextLocatorXpath"));

    }

    @Test(priority = 5)
    public void JEEVAN_PRAMAAN_05() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_05");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheFooterLine();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"), values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"), values.get("TextLocatorXpath"));

    }
}
