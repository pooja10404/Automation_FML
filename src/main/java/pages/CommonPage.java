package pages;

import base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Map;

import static base.BaseTest.driver;

public class CommonPage {

    public Map<String, String> specificTestCaseData;

    public String uniqueLocatorCss = "input#css-text-Unique-Locator";
    public String uniqueLocatorXpath = "//input[@id='xpath-text-Unique-Locator']";

    public String textLocatorCss = "input#css-text-Text-Locator";
    public String textLocatorXpath = "//input[@id='xpath-text-Text-Locator']";
    public String withoutIndexLocatorCss= "div[id='css-label-Without-Index'] ~ input[id='css-text-Without-Index']";
    public String withoutIndexLocatorXpath= "//div[@id='xpath-label-Without-Index']/following-sibling::input[@id='xpath-text-Without-Index']";

    public String iframeLocatorCss= "div[id='css-label-Iframe-Locator'] ~ input[id='css-text-Iframe-Locator']";
    public String iframeLocatorXpath= "//div[@id='xpath-label-Iframe-Locator']/following-sibling::input[@id='xpath-text-Iframe-Locator']";

    public void launchUrl() {

        driver.get(specificTestCaseData.get("URL"));
    }

    public String getUniqueCssLocator() {
        String text = driver.findElement(By.cssSelector(uniqueLocatorCss)).getAttribute("value");
        return text;
    }

    public String getUniqueXpathLocator() {
        String text = driver.findElement(By.xpath(uniqueLocatorXpath)).getAttribute("value");
        return text;
    }

    public String getTextLocatorOfCss() {
        String text = driver.findElement(By.cssSelector(textLocatorCss)).getAttribute("value");
        return text;
    }

    public String getTextLocatorOfXpath() {
        String text = driver.findElement(By.xpath(textLocatorXpath)).getAttribute("value");
        return text;
    }
    public void assertionForUniqueLocator(String uniqueLocatorCSS, String uniqueLocatorXpath) {
        Assert.assertEquals(getUniqueCssLocator(), uniqueLocatorCSS);
        Assert.assertEquals(getUniqueXpathLocator(), uniqueLocatorXpath);
    }

    public void getUniqueLocator () {
        getUniqueCssLocator();
        getUniqueXpathLocator();
    }

    public void getTextLocator () {
        getTextLocatorOfCss();
        getTextLocatorOfXpath();
    }

    public Map<String, String> readExcel (String testCaseId) {
        try {
            String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\FML_LocatorSheet.xlsx";
            String sheetName = "Sheet1";

            ExcelReader excelDataReader = new ExcelReader(filePath, sheetName);
            Map<String, Map<String, String>> testDataMap = excelDataReader.readTestData();

            // Example: Accessing values for a specific test case ID
            specificTestCaseData = testDataMap.get(testCaseId);
            System.out.println("TestCase ID = " + testCaseId);
            for (Map.Entry<String, String> entry : specificTestCaseData.entrySet()) {
                System.out.println(entry.getKey() + " :  " + entry.getValue());
            }

            return specificTestCaseData;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public  void  rightClickOnFindMyLocator(String css)throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.cssSelector(css));
            Actions action = new Actions(driver);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
            action.contextClick(element).perform();
            Thread.sleep(2000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F);

        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public String getWithoutIndexLocatorOfCss() {
        String text = driver.findElement(By.xpath(withoutIndexLocatorCss)).getAttribute("value");
        return text;
    }
    public String getWithoutIndexLocatorOfXpath() {
        String text = driver.findElement(By.xpath(withoutIndexLocatorXpath)).getAttribute("value");
        return text;
    }
    public String getIframeLocatorOfXpath() {
        String text = driver.findElement(By.xpath(iframeLocatorCss)).getAttribute("value");
        return text;
    }
    public String getIframeLocatorOfCss() {
        String text = driver.findElement(By.xpath(iframeLocatorXpath)).getAttribute("value");
        return text;
    }

    public void assertionForWithoutIndexLocator (String WithoutIndexLocatorCSS, String WithoutIndexLocatorXpath) {
        Assert.assertEquals(getWithoutIndexLocatorOfCss(), WithoutIndexLocatorCSS);
        Assert.assertEquals(getWithoutIndexLocatorOfXpath(), WithoutIndexLocatorXpath);
    }

    public void assertionForIframeLocator (String IframeLocatorCSS, String IframeLocatorXpath) {
        Assert.assertEquals(getIframeLocatorOfXpath(), IframeLocatorCSS);
        Assert.assertEquals(getIframeLocatorOfCss(), IframeLocatorXpath);
    }
}
