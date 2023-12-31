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
    public void JOY_BIRD_04(){
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_04");
        commonPage.launchUrl();
        joyBirdPage.ByClickOnTheShowRoom();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));

    }
    @Test(priority=4)
    public void JOY_BIRD_05(){
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_05");
        commonPage.launchUrl();
        joyBirdPage.ByClickOnThePhotsLivingRoom();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
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

    @Test(priority=6)
    public void JOY_BIRD_07()  {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_Iframe_07");
        commonPage.launchUrl();
        joyBirdPage.ClickOnMessageIframeBox();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
    }

    @Test(priority=6)
    public void JOY_BIRD_08()  {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("JOY_BIRD_Iframe_08");
        commonPage.launchUrl();
        joyBirdPage.ClickOnLogPageView();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
    }
}
