package pageObjects.navitePages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BudgetActivityPage extends NativePageObject {

    @FindBy(xpath = "//*[contains(@text,'BudgetActivity')]")
    private WebElement budgetActivity;

    public BudgetActivityPage(AppiumDriver driver) {
        super(driver);
    }

    public String getBudgetPageName() {
        return budgetActivity.getText();
    }

}
