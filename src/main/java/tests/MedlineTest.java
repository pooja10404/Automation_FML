package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.MedlinePages;

import java.util.Map;


public class MedlineTest extends BaseTest {

    MedlinePages medlinePages = new MedlinePages();
    CommonPage commonPage = new CommonPage();

    @Test
    public void medline01() {
        Map<String, String> values = commonPage.readExcel("Medline_01");
        commonPage.launchUrl();
        medlinePages.clickOnsearchBar();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));

    }

    @Test
    public void medline02() {
        Map<String, String> values = commonPage.readExcel("Medline_02");
        commonPage.launchUrl();
        medlinePages.clickOnSku();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));

    }


}
