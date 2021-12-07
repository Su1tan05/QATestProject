package Project.Pages;

import Project.Elements.Button;

public class BlogPage {

    private Button recordButton(String entryTitle){
        return new Button(String.format("//a[contains(text(),'%s')]",entryTitle),"recordButton");
    }

    public boolean isRecordAppear(String entryTitle){
        return recordButton(entryTitle).isDisplayed();
    }

    public void clickRecordButton(String entryTitle){
        recordButton(entryTitle).click();
    }
}
