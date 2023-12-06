package pages;

public class jeevanPramaanPage extends SeleniumUtility{
    CommonPage commonpage=new CommonPage();

    public String ClickOnTheLogo="img[alt='Logo']";
    public String ClickOnTheHomeButton="li[class] > a[class='scroll']";
    public String ClickOnTheLocateButton="ul[class='nav main-nav']>li:nth-of-type(4)>a[class='scroll']";
    public String ClickOnTheHelpText="p[class='footer-text copyright']:nth-of-type(1) a:nth-of-type(1)";

   public String lastelement = "p[class='footer-text copyright']:nth-of-type(2)";
    //public WebElement element = driver.findElement(By.cssSelector("p[class='footer-text copyright']:nth-of-type(2)"));
    public String ClickOnTheFooterLine = "p[class='footer-text copyright']:nth-of-type(4)";


    public void ClickOnTheJeevanPravanLogo() throws InterruptedException {
        commonpage.rightClickOnFindMyLocator(ClickOnTheLogo);
    }
    public void ClickOnTheHomeButton() throws InterruptedException {
        commonpage.rightClickOnFindMyLocator(ClickOnTheHomeButton);
    }
    public void ClickOnTheLocateCenter() throws InterruptedException {
        commonpage.rightClickOnFindMyLocator(ClickOnTheLocateButton);
    }
    public void ClickOnTheHelpTextOnFooter() throws InterruptedException {
        moveToElement(lastelement);
        //waitForElementVisibility(LastUpdatedText,40);
        commonpage.rightClickOnFindMyLocator(ClickOnTheHelpText);
    }

    public void ClickOnTheFooterLine() throws InterruptedException {
        moveToElement(lastelement);
        //waitForElementVisibility(LastUpdatedText,40);
        commonpage.rightClickOnFindMyLocator(ClickOnTheFooterLine);
    }
}
