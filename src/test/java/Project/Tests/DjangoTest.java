package Project.Tests;

import Project.BrowserConfig.Browser;
import Project.Pages.HomePage;
import Project.Utils.ConfigReader;
import org.junit.Assert;
import org.junit.Test;
import Project.Pages.LoginPage;

public class DjangoTest extends BaseTest {

    private final String entriesPagePath = ConfigReader.getProperty("entriesPagePath");

    @Test
    public void EntriesTest()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(ConfigReader.getTestData("userName"));
        loginPage.inputPassword(ConfigReader.getTestData("password"));
        loginPage.clickLoginButton();

        HomePage homePage = new HomePage();
        Assert.assertTrue("In a home page doesn't appear control panel",homePage.isControlPanelAppear());
        Browser.goToUrl(ConfigReader.getProperty("url")+entriesPagePath);
    }
}
