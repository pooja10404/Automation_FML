package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.FreshersJobPage;
import java.util.Map;


public class FreshersJobTest extends BaseTest {

    FreshersJobPage freshersJobPage = new FreshersJobPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void freshersJob1(){
        Map<String, String> values = commonPage.readExcel("Freshers_Jobs_01");
        commonPage.launchUrl();
        freshersJobPage.clickOnTotalVacanciesText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void freshersJob2(){
        Map<String, String> values = commonPage.readExcel("Freshers_Jobs_02");
        commonPage.launchUrl();
        freshersJobPage.clickOnFresherJobFaqText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test
    public void freshersJob3(){
        Map<String, String> values = commonPage.readExcel("Freshers_Jobs_03");
        commonPage.launchUrl();
        freshersJobPage.clickOnKvsRecurimentText();
        commonPage.assertionForUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
    }


}
