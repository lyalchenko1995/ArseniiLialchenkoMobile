package scenarios;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.webPages.WebPageObject;
import pageObjects.webPages.forms.CockiesForm;
import setup.BaseTest;

import java.io.IOException;

import static dataProviders.webData.getSearchKeyProperty;
import static dataProviders.webData.getGoogleLinkProperty;

public class WebMobileTestGoogleSearch extends BaseTest {

    @Test(groups = {"web"}, description = "Test google search")
    public void webTest() throws IOException {
        WebPageObject webPageObject = new WebPageObject(getDriver());

        //open Google page
        getDriver().get(getGoogleLinkProperty());
        waitUntilWebPageOpened();

        //Close cockies pop-up
        CockiesForm cockiesForm = new CockiesForm(getDriver());
        cockiesForm.clickOnCockiesButton(getDriver());
        //Enter search key value
        webPageObject.getSearchField().sendKeys(getSearchKeyProperty() + Keys.ENTER);

        Assert.assertTrue(webPageObject.assertSearchContainText(getSearchKeyProperty()));
    }
}
