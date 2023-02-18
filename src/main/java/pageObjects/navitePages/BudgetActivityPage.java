package pageObjects.navitePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class BudgetActivityPage extends NativePageObject {

    @AndroidFindBy(xpath = "//*[contains(@text,'BudgetActivity')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label='Budget']")
    private WebElement budgetActivity;

    public BudgetActivityPage(AppiumDriver driver) {
        super(driver);
    }

    public String getBudgetPageName() {
        return budgetActivity.getText();
    }

}
