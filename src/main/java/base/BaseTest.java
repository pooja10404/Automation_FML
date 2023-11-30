package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;

public class BaseTest {
    public static WebDriver driver;

    public WebDriver getDriver() {
        return this.driver;
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\FindMYLocator.crx"));
        options.addArguments("--remote-allow-origin=*", "ignore-certificate-errors");
        System.out.println("Opening extension");
        driver = new ChromeDriver(options);

        getDriver().manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver = getDriver();
    }

    @AfterMethod
    public void tearDown() {

        driver.close();
        driver.quit();
    }
}
