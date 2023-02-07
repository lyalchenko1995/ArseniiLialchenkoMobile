package pageObjects.webPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebPageObject {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@id='rso']/div")
    private List<WebElement> searchResult;



    @FindBy(xpath = "//button[@id='L2AGLb']")
    private WebElement acceptAll;

    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getAcceptAll() {
        return acceptAll;
    }

    public void clickOnAcceptAllButton() {
        getAcceptAll().click();
    }

    public boolean assertSearchContainText(String search) {
        boolean resultBoolean = false;
        for (WebElement result : searchResult) {
            if (result.getText().contains(search)) {
                resultBoolean = true;
                break;
            }
        }
        return resultBoolean;
    }

}