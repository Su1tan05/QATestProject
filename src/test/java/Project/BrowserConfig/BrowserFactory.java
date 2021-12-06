package Project.BrowserConfig;

import Project.Exceptions.DriverError;
import Project.Utils.ConfigReader;
import Project.Utils.LogUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BrowserFactory {

    public static WebDriver getBrowser(String browserName)  {
        browserName = browserName.toLowerCase();
        String browserLanguage = ConfigReader.getProperty("lang");
        switch (browserName)
        {
            case "chrome":
                return getChromeInstance(browserLanguage);
            case "firefox":
                return getFirefoxfInstance(browserLanguage);
            default:
                throw new DriverError("Input correct browser name! (Examples: Chrome, Firefox)");
        }
    }

    private static FirefoxDriver getFirefoxfInstance(String language) {
        LogUtils.info(String.format("Get firefox driver"));
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments(language);
        return new FirefoxDriver(firefoxOptions);
    }

    private static ChromeDriver getChromeInstance(String language) {
        LogUtils.info(String.format("Get chrome driver"));
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(language);
        return new ChromeDriver(chromeOptions);
    }
}