package pages;

import org.openqa.selenium.By;

import static base.BaseTest.driver;

public class FreshersJobPage extends SeleniumUtility{
    CommonPage commonPage = new CommonPage();
    public String getTotalVacanciesTextCss = "div[class='post-body entry-content'] > table:nth-of-type(1) td[valign='top']:nth-of-type(1) b";
    public String getFresherJobFaqTextCss= "h4 > font[color*='ff'] > font";
    public String getKvsRecurimentTextCss ="div[id*='footer']:nth-of-type(1)>div[class='footer-column section'] ul>li:nth-of-type(1)>a";
    public void clickOnTotalVacanciesText()  {
          driver.findElement(By.cssSelector(getTotalVacanciesTextCss)).click();
    }

    public void clickOnFresherJobFaqText()  {
        driver.findElement(By.cssSelector(getFresherJobFaqTextCss)).click();
    }

    public void clickOnKvsRecurimentText(){
        commonPage.rightClickOnFindMyLocator(getKvsRecurimentTextCss);
    }

}
