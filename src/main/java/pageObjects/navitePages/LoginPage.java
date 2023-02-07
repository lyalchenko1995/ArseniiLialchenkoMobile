package pageObjects.navitePages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends NativePageObject {

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    private WebElement signInBtn;

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    private WebElement registerButton;

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    private WebElement emailField;

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    private WebElement passwordField;

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void openRegistrationPage() {
        registerButton.click();
    }

    public void login(String emailOrUsername, String password) {
        emailField.sendKeys(emailOrUsername);
        passwordField.sendKeys(password);
        signInBtn.click();
    }

}
