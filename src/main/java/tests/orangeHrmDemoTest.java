package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.orangeHrmdemoPages;

import java.util.Map;

public class orangeHrmDemoTest extends BaseTest {
    orangeHrmdemoPages orangehrm = new orangeHrmdemoPages();

    @Test(priority = 1)
    public void orangehrmlive_TC_01() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_01");
        commonPage.launchUrl();
        orangehrm.ClickOnOrangeHrmLogo();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 2)
    public void orangehrmlive_TC_02() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_02");
        commonPage.launchUrl();
        orangehrm.ClickOnHrmLinkReDirct();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"), values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"), values.get("TextLocatorXpath"));
    }

    @Test(priority = 3)
    public void orangehrmlive_TC_03() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_03");
        commonPage.launchUrl();
        orangehrm.ClickOnTheLoginText();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 4)
    public void orangehrmlive_TC_04() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_04");
        commonPage.launchUrl();
        orangehrm.ClickOnTheUsernameText();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 5)
    public void orangehrmlive_TC_05() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_05");
        commonPage.launchUrl();
        orangehrm.ClickOnTheUsername();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 6)
    public void orangehrmlive_TC_06() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_06");
        commonPage.launchUrl();
        orangehrm.Login();
        orangehrm.ClickOnTheDashboard();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 7)
    public void orangehrmlive_TC_07() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_07");
        commonPage.launchUrl();
        orangehrm.Login();
        orangehrm.ClickOnTheProfilePhoto();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

    @Test(priority = 8)
    public void orangehrmlive_TC_08() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("orangehrmlive_TC_08");
        commonPage.launchUrl();
        orangehrm.Login();
        orangehrm.ClickOnTheHelpPopUp();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
    }

}
