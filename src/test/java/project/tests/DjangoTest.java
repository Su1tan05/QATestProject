package project.tests;

import project.browserConfig.Browser;
import project.pages.*;
import project.utils.ConfigReader;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class DjangoTest extends BaseTest {

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
        Assert.assertTrue("In a home page doesn't appear control panel", homePage.isControlPanelAppear());
        homePage.clickAddEntireButton();
        EditEntryPage editEntryPage = new EditEntryPage();
        Assert.assertTrue("Heading: 'Добавить entry' doesn't appear", editEntryPage.isHeadingAppear());
        editEntryPage.isHeadingAppear();
        editEntryPage.inputTitle("Title"+randomNumber);
        editEntryPage.inputSlug("Slug"+randomNumber);
        editEntryPage.inputTextMarkdown("Slug"+randomNumber);
        editEntryPage.inputText("Slug"+randomNumber);
        editEntryPage.clickSaveButton();
        Browser.goToUrl(ConfigReader.getProperty("blogPageUrl"));
        BlogPage blogPage = new BlogPage();
        Assert.assertTrue(String.format("Record: 'Title%s' doesn't appear", randomNumber), blogPage.isRecordAppear("Title"+randomNumber));
        Browser.goToUrl(ConfigReader.getProperty("blogAdminPanelUrl"));
        BlogAdminPanel blogAdminPanel = new BlogAdminPanel();
        blogAdminPanel.clickRecordButton("Title"+randomNumber);
        editEntryPage.clickDeleteEntryButton();
        ConfirmDeletePage confirmDeletePage = new ConfirmDeletePage();
        confirmDeletePage.clickConfirmDeleteButton();
    }
}
