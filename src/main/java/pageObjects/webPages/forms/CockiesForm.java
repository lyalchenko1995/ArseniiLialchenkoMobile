package pageObjects.webPages.forms;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CockiesForm {

    private static final String SCROLL_TO_ELEMENT_SCRIPT = "arguments[0].scrollIntoView(false)";

    @FindBy(xpath = "//button[@id='W0wltc']")
    private WebElement acceptAllButton;

    public CockiesForm(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    public WebElement getAcceptAllButton() {
        return acceptAllButton;
    }

    public void clickOnCockiesButton(AppiumDriver appiumDriver) {
        appiumDriver.executeScript(SCROLL_TO_ELEMENT_SCRIPT, getAcceptAllButton());
        appiumDriver.executeScript("arguments[0].click();", getAcceptAllButton());
    }

}
