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
    public void uitRgpv09(){
        Map<String, String> values = commonPage.readExcel("UITRGPV_AC_09");
        commonPage.launchUrl();
        uitRgpvPage.ArrowButton();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }

}
