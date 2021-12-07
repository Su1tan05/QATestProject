package project.pages;

import project.elements.Button;

public class HomePage {

    private Button controlPanel = new Button("//a[@href='/admin/']","controlPanel");

    private Button addEntireButton = new Button("//a[contains(@class,'addlink') and contains(@href,'entry')] ","addEntireButton");

    public boolean isControlPanelAppear(){
        return controlPanel.isDisplayed();
    }

    public void clickAddEntireButton(){
        addEntireButton.click();
    }
}
