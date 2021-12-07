package project.pages;

import project.elements.Button;
import project.elements.TextField;

public class LoginPage {

    private TextField userNameTextField = new TextField("//input[@name='username']","userNameTextField");
    private TextField passwordTextField = new TextField("//input[@name='password']", "passwordTextField");
    private Button loginButton = new Button("//input[@type='submit']","loginButton");

    public void inputLogin(String login) {
        userNameTextField.sendKeys(login);
    }

    public void inputPassword(String pass){
        passwordTextField.sendKeys(pass);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }
}
