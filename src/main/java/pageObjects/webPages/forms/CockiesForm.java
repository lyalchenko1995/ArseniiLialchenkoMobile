package pageObjects.webPages.forms;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CockiesForm {

    @FindBy(xpath = "//button[@id='W0wltc']")
    private WebElement acceptAllButton;

    public CockiesForm(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    public WebElement getAcceptAllButton() {
        return acceptAllButton;
    }

    public void clickOnCockiesButton(AppiumDriver appiumDriver) {
        appiumDriver.executeScript("arguments[0].scrollIntoView(false)", getAcceptAllButton());
        appiumDriver.executeScript("arguments[0].click();", getAcceptAllButton());
    }

}
