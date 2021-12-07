package project.pages;

import project.elements.Button;

public class BlogPage {

    private Button recordButton(String entryTitle){
        return new Button(String.format("//a[contains(text(),'%s')]",entryTitle),"recordButton");
    }

    public boolean isRecordAppear(String entryTitle){
        return recordButton(entryTitle).isDisplayed();
    }
}
