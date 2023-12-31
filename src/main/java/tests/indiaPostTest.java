package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.indiaPostPage;

import java.util.Map;

public class indiaPostTest extends BaseTest {
    indiaPostPage indiapostPage=new indiaPostPage();

    @Test(priority=1)
    public void indiapost_TC_01() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_01");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheLogoOfWebsite();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=2)
    public void indiapost_TC_02() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_02");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheEmblemLogo();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=3)
    public void indiapost_TC_03() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_03");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheSliderImage();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=4)
    public void indiapost_TC_04() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_04");
        commonPage.launchUrl();
        indiapostPage.clickOnTheTracklogo();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=5)
    public void indiapost_TC_05() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_05");
        commonPage.launchUrl();
        indiapostPage.clickOnTheRadioButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));

    }

    @Test(priority=6)
    public void indiapost_TC_06() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_06");
        commonPage.launchUrl();
        indiapostPage.InputTextBoxOfComplaintBox();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=7)
    public void indiapost_TC_07() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_07");
        commonPage.launchUrl();
        indiapostPage.clickOnThecaptch();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=8)
    public void indiapost_TC_08() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_08");
        commonPage.launchUrl();
        indiapostPage.clickOnTheTrackNowButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=9)
    public void indiapost_TC_09() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_09");
        commonPage.launchUrl();
        indiapostPage.clickOnTheHelplineImg();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority=10)
    public void indiapost_TC_10() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_10");
        commonPage.launchUrl();
        indiapostPage.ClickOnTelephoneImg();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=11)
    public void indiapost_TC_11() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_11");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheMenuButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }

    @Test(priority=12)
    public void indiapost_TC_12() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_12");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheAboutUsButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
        commonPage.assertionForWithoutIndexLocator(values.get("WithoutIndexCSS"),values.get("WithoutIndexXpath"));
        commonPage.assertionForTextLocator(values.get("TextLocatorCSS"),values.get("TextLocatorXpath"));
    }
    @Test(priority=13)
    public void indiapost_TC_13() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_13");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheImageMoc();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=14)
    public void indiapost_TC_14() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_14");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheTextInsideNewsUpdate();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=15)
    public void indiapost_TC_15() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_15");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheFaceBookLogo();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=16)
    public void indiapost_TC_16() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_16");
        commonPage.launchUrl();
        indiapostPage.ClickOnCheckedRadioButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
    @Test(priority=17)
    public void indiapost_TC_17() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_17");
        commonPage.launchUrl();
        indiapostPage.ClickOnPinCodeInputFiled();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=18)
    public void indiapost_TC_18() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_18");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheGetAvailabelButton();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }

    @Test(priority=19)
    public void indiapost_TC_19() {
        CommonPage commonPage = new CommonPage();
        Map<String, String> values = commonPage.readExcel("indiapost_TC_19");
        commonPage.launchUrl();
        indiapostPage.ClickOnTheTCSLink();
        // Asserstion
        commonPage.assertionForUniqueLocator(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
