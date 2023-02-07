package pageObjects.navitePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends NativePageObject {

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    WebElement emailField;

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    WebElement userNameField;

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    WebElement passwordField;

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    WebElement confirmPasswordField;

    @FindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    WebElement registerButton;

    public RegistrationPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public void fillRegistrationForm(String email, String username, String password) {
        emailField.sendKeys(email);
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
    }

    public void clickRegisterButton() {
        getRegisterButton().click();
    }
}
