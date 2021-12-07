package project.pages;

import project.elements.Button;

public class BlogAdminPanel {

    private Button recordButton(String entryTitle){
        return new Button(String.format("//a[contains(text(),'%s')]",entryTitle),"recordButton");
    }

    public void clickRecordButton(String entryTitle){
        recordButton(entryTitle).click();
    }
}
