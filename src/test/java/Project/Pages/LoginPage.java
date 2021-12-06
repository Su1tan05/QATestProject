package Project.Pages;

import Project.Elements.Button;
import Project.Elements.Label;

public class LoginPage {

    private Label userName = new Label("//input[@name='username']","userName");
    private Label password = new Label("//input[@name='password']", "password");
    private Button loginButton = new Button("//input[@type='submit']","loginButton");

    public void inputLogin(String login) {
        userName.sendKeys(login);
    }

    public void inputPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }
}
