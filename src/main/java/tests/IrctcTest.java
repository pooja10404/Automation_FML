package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.IRCTCPage;

import java.util.Map;
public class IrctcTest extends BaseTest {

    IRCTCPage irctcPage = new IRCTCPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void irctcTest1() {
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_01");
        commonPage.launchUrl();
        irctcPage.clickOnFromTextBox();
        irctcPage.getFromTextBoxLocators();
        // Assersion
        irctcPage.assertionForgetBookTicketUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));

    }

    @Test
    public void irctcTest2()  {
        Map<String, String> values = commonPage.readExcel("IRCTC_TC_23");
        commonPage.launchUrl();
        driver.findElement(By.cssSelector("p-autocomplete[id='origin'] input[aria-autocomplete='list']")).sendKeys("BHOPAL  JN - BPL ");
        driver.findElement(By.cssSelector("li[class*='ng-tns-c']:nth-of-type(2)")).isDisplayed();
        driver.findElement(By.cssSelector("li[class*='ng-tns-c']:nth-of-type(2)")).click();
        driver.findElement(By.cssSelector("p-autocomplete[id='destination'] input[aria-autocomplete='list']")).sendKeys(" INDORE JN BG - INDB ");
        driver.findElement(By.cssSelector("li[class*='ng-tns-c']")).isDisplayed();
        driver.findElement(By.cssSelector("li[class*='ng-tns-c']")).click();
        driver.findElement(By.cssSelector("button[class='search_btn train_Search']")).click();
        irctcPage.clickOnBhopalText();
        irctcPage.getFromTextBoxLocators();
        irctcPage.assertionForgetBookTicketUniqueLocators(values.get("UniqueLocatorCSS"),values.get("UniqueLocatorXpath"));
    }
}
