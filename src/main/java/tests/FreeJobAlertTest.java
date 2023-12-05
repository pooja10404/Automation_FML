package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.FreeJobAlertPage;
import java.util.Map;


public class FreeJobAlertTest extends BaseTest {

    FreeJobAlertPage freeJobAlertPage = new FreeJobAlertPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void freeJobAlert1(){
        Map<String, String> values = commonPage.readExcel("Free_Jobs_Alert_01");
        commonPage.launchUrl();
        freeJobAlertPage.clickOnSearchBoxText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void freeJobAlert2(){
        Map<String, String> values = commonPage.readExcel("Free_Jobs_Alert_02");
        commonPage.launchUrl();
        freeJobAlertPage.clickOnLatestNotificationText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }




}
