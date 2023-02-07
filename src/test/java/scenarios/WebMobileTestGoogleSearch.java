package scenarios;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.webPages.WebPageObject;
import setup.BaseTest;

import java.io.IOException;

import static dataProviders.webData.getKeyWordProperties;
import static dataProviders.webData.getSearchEngineProperties;

public class WebMobileTestGoogleSearch extends BaseTest {

    @Test(groups = {"web"}, description = "Test google search")
    public void webTest() throws IOException {
        WebPageObject webPageObject = new WebPageObject(getDriver());

        //open Google page
        getDriver().get(getSearchEngineProperties());
        waitUntilWebPageOpened();
        webPageObject.clickOnAcceptAllButton();
        //Enter search key value
        webPageObject.getSearchField().sendKeys(getKeyWordProperties() + Keys.ENTER);

        Assert.assertTrue(webPageObject.assertSearchContainText(getKeyWordProperties()));
    }
}
