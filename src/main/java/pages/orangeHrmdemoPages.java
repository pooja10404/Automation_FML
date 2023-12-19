package pages;
import org.openqa.selenium.By;

import static base.BaseTest.driver;
public class orangeHrmdemoPages extends SeleniumUtility{
    CommonPage commonpage=new CommonPage();
    public String clickOnlogo = "img[alt='company-branding']";
    public String clickOnHrmLinkReDirect = "p[class='oxd-text oxd-text--p orangehrm-copyright'] > a";
    public String clickOnLoginText ="h5[class*='oxd-text']";
    public String clickOnTextOfUsername ="p[class='oxd-text oxd-text--p']:nth-of-type(1)";
    public String clickOnTheUsername ="input[name='username']";
    public String clickOnThePassword ="input[name='password']";
    public String clickOnTheLogin ="button[class*='oxd-button']";
    public String clickOnDashboard =" h6[class*='oxd-text']";
    public String clickOnProfile ="img[class='oxd-userdropdown-img']";
    public String clickOnTheHlep ="i[class='oxd-icon bi-question-lg']";


    public void ClickOnOrangeHrmLogo() {
        driver.findElement(By.cssSelector(clickOnlogo)).click();
    }

    public void ClickOnHrmLinkReDirct() {
        driver.findElement(By.cssSelector(clickOnHrmLinkReDirect)).click();
    }

    public void ClickOnTheLoginText() {
        driver.findElement(By.cssSelector(clickOnLoginText)).click();
    }

    public void ClickOnTheUsernameText() {
        driver.findElement(By.cssSelector(clickOnTextOfUsername)).click();
    }
    public void ClickOnTheUsername() {
        driver.findElement(By.cssSelector(clickOnTheUsername)).click();
    }
    public void Login()
    {
        driver.findElement(By.cssSelector(clickOnTheUsername)).sendKeys("Admin");
        driver.findElement(By.cssSelector(clickOnThePassword)).sendKeys("admin123");
        driver.findElement(By.cssSelector(clickOnTheLogin)).click();
    }
    public void ClickOnTheDashboard() {
        driver.findElement(By.cssSelector(clickOnDashboard)).click();
    }
    public void ClickOnTheProfilePhoto() {
        driver.findElement(By.cssSelector(clickOnProfile)).click();
    }
    public void ClickOnTheHelpPopUp() {
        commonpage.rightClickOnFindMyLocator(clickOnTheHlep);
    }

}
