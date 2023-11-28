package pages;

import base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Map;

import static base.BaseTest.driver;

public class CommonPage {

    public Map<String, String> specificTestCaseData;

    public String uniqueLocatorCss = "input#css-text-Unique-Locator";
    public String uniqueLocatorXpath = "//input[@id='xpath-text-Unique-Locator']";

    public String textLocatorCss = "input#css-text-Text-Locator";
    public String textLocatorXpath = "//input[@id='xpath-text-Text-Locator']";
    public void launchUrl() {

        driver.get(specificTestCaseData.get("URL"));
    }

    public String getUniqueCssLocator() {
        String text = driver.findElement(By.cssSelector(uniqueLocatorCss)).getAttribute("value");
        System.out.println("Css Locator: " + text);
        return text;
    }

    public String getUniqueXpathLocator() {
        String text = driver.findElement(By.xpath(uniqueLocatorXpath)).getAttribute("value");
        System.out.println("Xpath locator: " + text);

        return text;
    }

    public String getTextLocatorOfCss() {
        String text = driver.findElement(By.cssSelector(textLocatorCss)).getAttribute("value");
        System.out.println("@@@@@@@@@@@@" + text);

        return text;
    }

    public String getTextLocatorOfXpath() {
        String text = driver.findElement(By.xpath(textLocatorXpath)).getAttribute("value");

        System.out.println("@@@@@@@@@@@@" + text);

        return text;
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
            System.out.println("Element"+element);
            Actions action = new Actions(driver);
            Thread.sleep(2000);
            action.contextClick(element).perform();
            Robot robot = new Robot();
            Thread.sleep(2000);
           robot.keyPress(KeyEvent.VK_F);
            Thread.sleep(2000);

        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
