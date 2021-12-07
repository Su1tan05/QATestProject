package Project.Pages;

import Project.Elements.Button;

public class ConfirmDeletePage {

    private Button confirmDeleteButton = new Button("//input[@type='submit']","deleteConfirmButton");

    public void clickConfirmDeleteButton(){
        confirmDeleteButton.click();
    }
}
