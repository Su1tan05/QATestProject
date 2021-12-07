package Project.Tests;

import Project.BrowserConfig.Browser;
import Project.Pages.*;
import Project.Utils.ConfigReader;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class DjangoTest extends BaseTest {

    private final String entriesPagePath = ConfigReader.getProperty("entriesPagePath");
    private final String blogPagePath = ConfigReader.getProperty("blogPagePath");
    private final int randomNumbersLength = 11;
    private final String randomNumber = RandomStringUtils.random(randomNumbersLength, false, true);

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
        EntryPage entryPage = new EntryPage();
        entryPage.clickAddEntryButton();
        EditEntryPage editEntryPage = new EditEntryPage();
        Assert.assertTrue("Heading: 'Добавить entry' doesn't appear", editEntryPage.isHeadingAppear());
        editEntryPage.isHeadingAppear();
        editEntryPage.inputTitle("Title"+randomNumber);
        editEntryPage.inputSlug("Slug"+randomNumber);
        editEntryPage.inputTextMarkdown("Slug"+randomNumber);
        editEntryPage.inputText("Slug"+randomNumber);
        editEntryPage.clickSaveButton();
        Browser.goToUrl(ConfigReader.getProperty("url")+blogPagePath);
        BlogPage blogPage = new BlogPage();
        Assert.assertTrue(String.format("Record: 'Title%s' doesn't appear", randomNumber), blogPage.isRecordAppear("Title"+randomNumber));
        blogPage.clickRecordButton("Title"+randomNumber);
        editEntryPage.clickDeleteEntryButton();
        ConfirmDeletePage confirmDeletePage = new ConfirmDeletePage();
        confirmDeletePage.clickConfirmDeleteButton();
    }
}
