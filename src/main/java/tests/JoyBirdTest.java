package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.CommonPage;
import pages.JoyBirdPage;

import java.util.Map;

public class JoyBirdTest extends BaseTest {

    JoyBirdPage joyBirdPage = new JoyBirdPage();
    @Test(priority=1)
    public void JOY_BIRD_02() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_02");
        commonPage.launchUrl();
        joyBirdPage.ClickOnTheSearchIcon();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=2)
    public void JOY_BIRD_03()  {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_03");
        commonPage.launchUrl();
        joyBirdPage.ClickOnTheCart();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }
    @Test(priority=3)
    public void JOY_BIRD_04() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_04");
        commonPage.launchUrl();
        joyBirdPage.ByClickOnTheShowRoom();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=4)
    public void JOY_BIRD_05() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_05");
        commonPage.launchUrl();
        joyBirdPage.ByClickOnThePhotsLivingRoom();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test(priority=5)
    public void JOY_BIRD_06()  {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_06");
        commonPage.launchUrl();
        joyBirdPage.ByClickOnFreeDesignText();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
