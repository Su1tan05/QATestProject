package project.utils;

import project.browserConfig.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private static WebDriverWait wait = new WebDriverWait(Browser.getDriver(), Integer.parseInt(ConfigReader.getProperty("explicitlyWait")));

    public static void waitVisibilityOfElementLocated(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}