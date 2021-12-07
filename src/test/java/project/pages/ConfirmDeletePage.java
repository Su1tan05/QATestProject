package project.pages;

import project.elements.Button;

public class ConfirmDeletePage {

    private Button confirmDeleteButton = new Button("//input[@type='submit']","deleteConfirmButton");

    public void clickConfirmDeleteButton(){
        confirmDeleteButton.click();
    }
}
