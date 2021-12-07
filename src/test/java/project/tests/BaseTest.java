package project.tests;

import project.browserConfig.Browser;
import project.utils.ConfigReader;
import org.junit.AfterClass;
import project.utils.LogUtils;
import org.junit.BeforeClass;
import org.apache.log4j.PropertyConfigurator;


public class BaseTest
{
    @BeforeClass
    public static void setUp() {
        PropertyConfigurator.configure(ConfigReader.getProperty("log_config"));
        Browser.goToUrl(ConfigReader.getProperty("url"));
        Browser.maximizeWindow();
    }

    @AfterClass
    public static void doAfterAllTest(){
        LogUtils.info("Close browser");
        Browser.getDriver().quit();
    }
}