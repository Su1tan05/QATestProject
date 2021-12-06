package Project.Tests;

import Project.BrowserConfig.Browser;
import Project.Utils.ConfigReader;
import org.junit.AfterClass;
import org.junit.Before;
import Project.Utils.LogUtils;
import org.junit.BeforeClass;
import org.apache.log4j.PropertyConfigurator;


public class BaseTest
{
    @BeforeClass
    public static void setUp() {
        PropertyConfigurator.configure(ConfigReader.getProperty("log_config"));
        Browser.getUrl(ConfigReader.getProperty("url"));
        Browser.maximizeWindow();
    }

    @AfterClass
    public static void doAfterAllTest(){
        LogUtils.info("Close browser");
        Browser.getDriver().quit();
    }
}