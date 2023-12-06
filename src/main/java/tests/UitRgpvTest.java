package tests;
import base.BaseTest;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.UitRgpvPage;


import java.time.Duration;
import java.util.Map;


public class UitRgpvTest extends BaseTest {
    CommonPage commonPage = new CommonPage();
    UitRgpvPage uitRgpvPage = new UitRgpvPage();

    @Test
    public void uitRgpv03(){
        Map<String, String> values = commonPage.readExcel("UITRGPV_AC_03");
        commonPage.launchUrl();
        uitRgpvPage.playButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test
    public void uitRgpv04(){
        Map<String, String> values = commonPage.readExcel("UITRGPV_AC_04");
        commonPage.launchUrl();
        uitRgpvPage.photoGalleryText();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }
    @Test
    public void uitRgpv05(){
        Map<String, String> values = commonPage.readExcel("UITRGPV_AC_05");
        commonPage.launchUrl();
        uitRgpvPage.arrowButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }

}
