package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    // Constructor
    public LoginPage(WebDriver givenDriver){
        super(givenDriver);

    }
    // Locators
    By emailField = By.cssSelector("input[type='email']");
    By passwordField = By.cssSelector("input[type='password']");
    By submitButton = By.cssSelector("button[type='submit']");

    // Page Methods

    public void provideEmail(String email){
        findElement(emailField).sendKeys(email);
    }

    public void providePassword(String password){
        findElement(passwordField).sendKeys(password);

    }
    public void clickSubmitButton(){
        findElement(submitButton).click();
    }

    public void login(String email, String password){
        provideEmail(email);
        providePassword(password);
        clickSubmitButton();
    }
}


