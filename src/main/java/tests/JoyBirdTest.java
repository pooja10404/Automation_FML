package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.CommonPage;
import pages.JoyBirdPage;

import java.util.Map;

public class JoyBirdTest extends BaseTest {

    JoyBirdPage joyBirdPage = new JoyBirdPage();
    CommonPage commonPage = new CommonPage();

    @Test(priority=1)
    public void JOY_BIRD_02() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_02");
        commonPage.launchUrl();
        joyBirdPage.ClickOnTheSearchIcon();
        joyBirdPage.getFromTextBoxLocators();
        // Assersion
        joyBirdPage.assertionForSearchIcon(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=2)
    public void JOY_BIRD_03() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_03");
        commonPage.launchUrl();
        joyBirdPage.ClickOnTheCart();
        joyBirdPage.getFromTextBoxLocators();
        // Assersion
        joyBirdPage.assertionForWhishList(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=3)
    public void JOY_BIRD_05() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_05");
        commonPage.launchUrl();
        joyBirdPage.ByClickOnThePhotsLivingRoom();
        joyBirdPage.getFromTextBoxLocators();
        // Assersion
        joyBirdPage.assertionByClickOnThePhotsLivingRoom(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
