package Project.Pages;

import Project.Elements.Button;

public class EntryPage {

    private Button addEntryButton = new Button("//a[contains(@class,'addlink')]","addEntryButton");



    public void clickAddEntryButton()
    {
        addEntryButton.click();
    }
}
