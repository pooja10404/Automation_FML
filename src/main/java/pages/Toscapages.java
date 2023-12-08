package pages;

public class Toscapages extends SeleniumUtility{
    CommonPage commonpage=new CommonPage();

    public String ClickOnShareIcon ="iframe[name*='f']";
    public String ClickOnTweetIcon ="iframe[id*='twitter-widget-']";

    public void ClickOnTheIframeOfShareButton()  {
        commonpage.rightClickForIframeLocator(ClickOnShareIcon);
    }

    public void ClickOnTheIframeOfTweetButton()  {
        commonpage.rightClickForIframeLocator(ClickOnTweetIcon);
    }
}
