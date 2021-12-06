package Project.Pages;

import Project.Elements.Button;
import Project.Elements.Label;

public class HomePage {

    private Button controlPanel = new Button("//a[@href='/admin/']","controlPanel");

    public boolean isControlPanelAppear(){
        return controlPanel.isDisplayed();
    }
}
