package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.K8omsPage;

import java.util.Map;


public class K8omsTest extends BaseTest {

    K8omsPage k8omsPage = new K8omsPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void k8oms01() {
        Map<String, String> values = commonPage.readExcel("k8oms_Iframe_01");
        commonPage.launchUrl();
        k8omsPage.clickOnK8mosIframe();
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"), values.get("UniqueLocatorXpath"));
        commonPage.assertionForIframeLocator(values.get("IframeLocatorCSS"), values.get("IframeLocatorXpath"));
    }
}
