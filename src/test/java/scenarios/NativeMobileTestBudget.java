package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.navitePages.BudgetActivityPage;
import pageObjects.navitePages.LoginPage;
import pageObjects.navitePages.RegistrationPage;
import setup.BaseTest;

import java.io.IOException;

import static dataProviders.nativeData.*;

public class NativeMobileTestBudget extends BaseTest {

    @Test(groups = {"native"}, description = "Test that budget activity page is displayed")
    public void budgetPageOpenedTest() throws IOException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.openRegistrationPage();
//        Create new user
        RegistrationPage registrationPage = new RegistrationPage(getDriver());
        registrationPage.fillRegistrationForm(getEmailProperties(), getUserNameProperty(), getUserPasswordProperty());
        registrationPage.clickRegistrationButton();

        loginPage.login(getEmailProperties(), getUserPasswordProperty());

        BudgetActivityPage budgetActivityPage = new BudgetActivityPage(getDriver());
        Assert.assertEquals(budgetActivityPage.getBudgetPageName(), "BudgetActivity");
    }

}
