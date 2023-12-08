package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DeveloperMozillaPage;
import java.util.Map;


public class DeveloperMozillaTest extends BaseTest {

    DeveloperMozillaPage developerMozillaPage = new DeveloperMozillaPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void developerMozilla01(){
        Map<String, String> values = commonPage.readExcel("Developer_mozilla_Iframe_01");
        commonPage.launchUrl();
        developerMozillaPage.clickOnHtmlDemoFrame();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
    }
    @Test
    public void developerMozilla02(){
        Map<String, String> values = commonPage.readExcel("Developer_mozilla_Iframe_02");
        commonPage.launchUrl();
        developerMozillaPage.clickOnExampleDomainIframe();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"),values.get("IframeLocatorXpath"));
    }

}
