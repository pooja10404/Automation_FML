package pages;

import base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
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

public class CommonPage extends SeleniumUtility {

    public Map<String, String> specificTestCaseData;
    public String uniqueLocatorCss = "input#css-text-Unique-Locator";
    public String uniqueLocatorXpath = "//input[@id='xpath-text-Unique-Locator']";
    public String textLocatorCss = "input#css-text-Text-Locator";
    public String textLocatorXpath = "//input[@id='xpath-text-Text-Locator']";
    public String withoutIndexLocatorCss= "div[id='css-label-Without-Index'] ~ input[id='css-text-Without-Index']";
    public String withoutIndexLocatorXpath= "//div[@id='xpath-label-Without-Index']/following-sibling::input[@id='xpath-text-Without-Index']";
    public String iframeLocatorCss= "div[id='css-label-Iframe-Locator'] ~ input[id='css-text-Iframe-Locator']";
    public String originSearchLocator= "p-autocomplete[id='origin'] input[aria-autocomplete='list']";
    public String destinationSearchLocator= "p-autocomplete[id='destination'] input[aria-autocomplete='list']";
    public String bhopalTextLocator= "//span[contains(text(),'BHOPAL  JN - BPL ')]";
    public String indoreTextLocator= "//span[contains(text(),'INDORE JN BG - INDB')]";
    public String searchButton="button[class='search_btn train_Search']";
    public String loader ="div[id='loaderP']";


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
        try {
            Assert.assertEquals(getUniqueCssLocator(), uniqueLocatorCSS);
            Assert.assertEquals(getUniqueXpathLocator(), uniqueLocatorXpath);
        }catch (StaleElementReferenceException e){
            Assert.assertEquals(getUniqueCssLocator(), uniqueLocatorCSS);
            Assert.assertEquals(getUniqueXpathLocator(), uniqueLocatorXpath);
        }
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


    public  void  rightClickOnFindMyLocator(String css) {
        try {
            WebElement element = driver.findElement(By.cssSelector(css));
            waitForElementVisibility(css,20);
            Actions action = new Actions(driver);
            waitForElementVisibility(css,30);
            action.contextClick(element).perform();
            Thread.sleep(3000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F);

        } catch (AWTException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getWithoutIndexLocatorOfCss() {
        String text = driver.findElement(By.cssSelector(withoutIndexLocatorCss)).getAttribute("value");
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
        String text = driver.findElement(By.cssSelector(iframeLocatorCss)).getAttribute("value");
        return text;
    }

    public void assertionForWithoutIndexLocator (String WithoutIndexLocatorCSS, String WithoutIndexLocatorXpath) {
        Assert.assertEquals(getWithoutIndexLocatorOfCss(), WithoutIndexLocatorCSS);
        Assert.assertEquals(getWithoutIndexLocatorOfXpath(), WithoutIndexLocatorXpath);
    }

    public void assertionForTextLocator (String getTextLocatorOfCss, String getTextLocatorOfXpath) {
        Assert.assertEquals(getTextLocatorOfCss(), getTextLocatorOfCss);
        Assert.assertEquals(getTextLocatorOfXpath(), getTextLocatorOfXpath);
    }
    public void assertionForIframeLocator (String IframeLocatorCSS, String IframeLocatorXpath) {
        Assert.assertEquals(getIframeLocatorOfXpath(), IframeLocatorCSS);
        Assert.assertEquals(getIframeLocatorOfCss(), IframeLocatorXpath);
    }
//    public void assertionForUniqueLocators (String uniqueLocatorCSS, String uniqueLocatorXpath) {
//
//        try {
//            Assert.assertEquals(getUniqueCssLocator(), uniqueLocatorCSS);
//            Assert.assertEquals(getUniqueXpathLocator(), uniqueLocatorXpath);
//        }
//        catch(org.openqa.selenium.StaleElementReferenceException ex){}
//
//
//    }
    public void irctcLoginDetails () {
        driver.findElement(By.cssSelector(originSearchLocator)).sendKeys("BHOPAL  JN - BPL ");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(bhopalTextLocator)));
        WebElement fromClickElement= driver.findElement(By.xpath(bhopalTextLocator));
        jsClick(fromClickElement);
        driver.findElement(By.cssSelector(destinationSearchLocator)).sendKeys(" INDORE JN BG - INDB ");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(indoreTextLocator)));
        try {
            driver.findElement(By.xpath(indoreTextLocator)).click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {}
        driver.findElement(By.cssSelector(searchButton)).click();
        waitForElementInVisibility(loader,20);
    }
}
