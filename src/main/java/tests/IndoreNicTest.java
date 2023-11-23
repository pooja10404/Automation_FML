package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.IndoreNicPage;

import java.util.Map;

public class IndoreNicTest extends BaseTest {
    IndoreNicPage indoreNicPage = new IndoreNicPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void indoreNicTest1() throws InterruptedException {

        Map<String, String> values = commonPage.readExcel("INDORE_NIC_01");
        commonPage.launchUrl();
        indoreNicPage.clickOnAboutDistrictDropdown();
        Thread.sleep(5000);
        indoreNicPage.getAboutDistrictDropdownLocators();
        Thread.sleep(5000);

        // Assersion
        indoreNicPage.assertionForAboutDistrictDropdownUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }
}

