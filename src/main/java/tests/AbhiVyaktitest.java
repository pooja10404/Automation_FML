package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.AbhiVyaktipages;
import pages.CommonPage;
import pages.SeleniumUtility;

import java.util.Map;

public class AbhiVyaktitest extends BaseTest {

    AbhiVyaktipages abhiVyaktipages=new AbhiVyaktipages();

    @Test(priority=1)
    public void ABHI_VYAKTI_01() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("ABHI_VYAKTI_01");
        commonPage.launchUrl();
        abhiVyaktipages.ClickOnThePauseIconOnScreen();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }


    @Test(priority=2)
    public void ABHI_VYAKTI_02() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("ABHI_VYAKTI_02");
        commonPage.launchUrl();
        Thread.sleep(9000);
        abhiVyaktipages.ClickOnTheYearOfExperience();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=3)
    public void ABHI_VYAKTI_03() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("ABHI_VYAKTI_03");
        commonPage.launchUrl();
        abhiVyaktipages.ClickOnThePrivacyPolicyOnHomePgae();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority=4)
    public void ABHI_VYAKTI_04() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("ABHI_VYAKTI_04");
        commonPage.launchUrl();
        abhiVyaktipages.ClickOnTheParagraphOnHomePage();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

}

