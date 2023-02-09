package pageObjects.webPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.webPages.forms.CockiesForm;

import java.util.List;

public class WebPageObject {

    public CockiesForm cockiesForm;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//div[@id='rso']/div")
    private List<WebElement> searchResult;

    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }

    public WebElement getSearchField() {
        return searchField;
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
