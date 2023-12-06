package tests;
import base.BaseTest;
import org.testng.annotations.*;
import pages.CommonPage;
import pages.jeevanPramaanPage;

import java.time.Duration;
import java.util.Map;


public class jeevanPramaanTest extends BaseTest {
    jeevanPramaanPage jeevanpramaanPage=new jeevanPramaanPage();

    @Test(priority=1)
    public void JEEVAN_PRAMAAN_01() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_01");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheJeevanPravanLogo();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=2)
    public void JEEVAN_PRAMAAN_02() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_02");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheHomeButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=3)
    public void JEEVAN_PRAMAAN_03() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_03");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheLocateCenter();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=4)
    public void JEEVAN_PRAMAAN_04() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_04");
        commonPage.launchUrl();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        jeevanpramaanPage.ClickOnTheHelpTextOnFooter();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=5)
    public void JEEVAN_PRAMAAN_05() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JEEVAN_PRAMAAN_05");
        commonPage.launchUrl();
        jeevanpramaanPage.ClickOnTheFooterLine();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
