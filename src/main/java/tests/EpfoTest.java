package tests;
import base.BaseTest;
import org.testng.annotations.*;
import pages.CommonPage;
import pages.EpfoPage;
import java.util.Map;

public class EpfoTest extends BaseTest  {
    EpfoPage epfopage=new EpfoPage();

    @Test(priority=1)
    public void EPFO_01() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("EPFO_01");
        commonPage.launchUrl();
        epfopage.ClickOnTheTextOfEase();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority=2)
    public void EPFO_02() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("EPFO_02");
        commonPage.launchUrl();
        epfopage.ClickOnTheFooterHomeText();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority=3)
    public void EPFO_03() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("EPFO_03");
        commonPage.launchUrl();
        epfopage.ClickOnTheOperatingTextOnHomePage();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority=4)
    public void EPFO_04() throws InterruptedException {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("EPFO_04");
        commonPage.launchUrl();
        epfopage.ClickOnTheFooterOwnedText();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
