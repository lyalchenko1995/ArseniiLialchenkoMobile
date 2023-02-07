package pageObjects.navitePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends NativePageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    private WebElement signInBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    private WebElement registerButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    private WebElement emailField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
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
