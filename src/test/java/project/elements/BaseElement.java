package project.elements;

import project.browserConfig.Browser;
import project.utils.LogUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import project.utils.WaitUtils;

import java.util.ArrayList;

public abstract class BaseElement {

    protected By locator;
    private String nameOfElement;


    public BaseElement(String locator, String nameOfElement) {
        this.locator = By.xpath(locator);
        this.nameOfElement = nameOfElement;
    }

    public void click() {
        LogUtils.info(String.format("Click %s .", nameOfElement));
        Browser.getDriver().findElement(locator).click();
    }

    public By getLocator() {
        return locator;
    }

    public String getNameOfElement() {
        return nameOfElement;
    }

    public boolean isDisplayed() {
        LogUtils.info(String.format("Check %s is displayed.", nameOfElement));
        return Browser.getDriver().findElements(locator).size() > 0;
    }

    public void sendKeys(String text) {
        LogUtils.info(String.format("Input text '%s' into %s", text,  nameOfElement));
        Browser.getDriver().findElement(locator).sendKeys(text);
    }

    public void clearAndType(String text) {
        LogUtils.info(String.format("Input text '%s' into %s", text,  nameOfElement));
        Browser.getDriver().findElement(locator).clear();
        Browser.getDriver().findElement(locator).sendKeys(text);
    }

    public void waitVisibilityOfElement() {
        WaitUtils.waitVisibilityOfElementLocated(locator);
    }

    public String getText() {
        LogUtils.info(String.format("Get text from %s.", nameOfElement));
        return Browser.getDriver().findElement(locator).getText();
    }

    public ArrayList<WebElement> findElements() {
        LogUtils.info(String.format("Find elements %s.", nameOfElement));
        return (ArrayList<WebElement>) Browser.getDriver().findElements(locator);
    }

    public void hoverElement() {
        Actions actions = new Actions(Browser.getDriver());
        LogUtils.info(String.format("Hover %s.", nameOfElement));
        WebElement elementMenu = Browser.getDriver().findElement(locator);
        actions.moveToElement(elementMenu).perform();
    }
}