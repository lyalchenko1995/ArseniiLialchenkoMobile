package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import pageObjects.navitePages.LoginPage;
import pageObjects.webPages.WebPageObject;
import setup.IPageObject;

import java.lang.reflect.Field;

public class PageObject implements IPageObject {

    Object somePageObject; // it should be set of web page or EPAM Test App WebElements

    public PageObject(String appType, AppiumDriver appiumDriver) throws Exception {

        System.out.println("Current app type: " + appType);
        switch (appType) {
            case "web":
                somePageObject = new WebPageObject(appiumDriver);
                break;
            case "native":
                somePageObject = new LoginPage(appiumDriver);
                break;
            default:
                throw new Exception("Can't create a page object for " + appType);
        }

    }

    @Override
    public WebElement getWelement(String weName) {
        // use reflection technique
        try {
            Field field = somePageObject.getClass().getDeclaredField(weName);
            field.setAccessible(true);
            return (WebElement) field.get(somePageObject);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("The field is null");
            e.printStackTrace();
            return null;
        }

    }
}
