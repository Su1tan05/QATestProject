package Project.Pages;

import Project.Elements.Button;
import Project.Elements.TextField;

public class EditEntryPage {

    private final TextField heading = new TextField("//h1[contains(text(),'Добавить entry')]","heading");
    private final TextField titleTextField = new TextField("//input[contains(@id,'title')]","titleTextField");
    private final TextField slugTextField = new TextField("//input[contains(@id,'slug')]","slugTextField");
    private final TextField textMarkdownTextField = new TextField("//textarea[contains(@name,'text_markdown')]","textMarkdownTextField");
    private final TextField textField = new TextField("//textarea[@name='text']","textField");
    private final Button saveButton = new Button("//input[contains(@name,'save')]","saveButton");
    private final Button deleteEntryButton = new Button("//a[contains(@class,'deletelink')]","deleteEntryButton");

    public boolean isHeadingAppear(){
        return heading.isDisplayed();
    }

    public void inputTitle(String text){
        titleTextField.clearAndType(text);
    }

    public  void inputSlug(String text){
        slugTextField.clearAndType(text);
    }

    public void inputTextMarkdown(String text){
        textMarkdownTextField.clearAndType(text);
    }

    public void inputText(String text){
        textField.clearAndType(text);
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void clickDeleteEntryButton(){
        deleteEntryButton.click();
    }
}
