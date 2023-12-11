package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.Toscapages;

import java.util.Map;

public class Toscatest extends BaseTest {

    Toscapages toscapages=new Toscapages();

    @Test(priority=1)
    public void Iframe_Tosca_01()  {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("Iframe_Tosca_01");
        commonPage.launchUrl();
        toscapages.ClickOnTheIframeOfShareButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }


    @Test(priority=2)
    public void Iframe_Tosca_02()  {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("Iframe_Tosca_02");
        commonPage.launchUrl();
        toscapages.ClickOnTheIframeOfTweetButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}

