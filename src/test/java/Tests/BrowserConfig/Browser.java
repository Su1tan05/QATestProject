package Tests.BrowserConfig;

import Tests.Utils.ConfigReader;
import Tests.Utils.LogUtils;
import Tests.BrowserConfig.BrowserFactory;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Browser {

    private static WebDriver driver;

    private Browser() {
    }

    public static WebDriver getDriver() throws Exception {
        if (driver == null) {
            driver = BrowserFactory.getBrowser(ConfigReader.getProperty("browser"));
        }
        return driver;
    }

    public static void getUrl(String url) throws Exception {
        LogUtils.info(String.format("Go to %s .", url));
        Browser.getDriver().get(url);
    }

    public static void maximizeWindow() throws Exception {
        LogUtils.info("Maximize window");
        Browser.getDriver().manage().window().maximize();
    }

    public static void setImplicitlyWait() throws Exception {
        LogUtils.info("Set implicitly wait");
        Browser.getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(ConfigReader.getProperty("implicitlyWait")), TimeUnit.SECONDS);
    }
}
