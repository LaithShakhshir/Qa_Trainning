package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login_field")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "commit")
    WebElement signInButton;

    public void login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        signInButton.click();
    }
}
