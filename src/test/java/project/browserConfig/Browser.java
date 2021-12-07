package project.browserConfig;

import project.utils.ConfigReader;
import project.utils.LogUtils;
import org.openqa.selenium.WebDriver;

public class Browser {

    private static WebDriver driver;

    private Browser() {
    }

    public static WebDriver getDriver()  {
        if (driver == null) {
            driver = BrowserFactory.getBrowser(ConfigReader.getProperty("browser"));
        }
        return driver;
    }

    public static void goToUrl(String url)  {
        LogUtils.info(String.format("Go to %s .", url));
        Browser.getDriver().get(url);
    }

    public static void maximizeWindow()  {
        LogUtils.info("Maximize window");
        Browser.getDriver().manage().window().maximize();
    }
}
