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

        loginPage.openRegistrationPage();
        //Create new user
        registrationPage.fillRegistrationForm(getEmailProperties(), getUserNameFromProperties(), getUserPasswordFromProperties());
        registrationPage.clickRegisterButton();

        loginPage.login(getUserNameFromProperties(), getUserPasswordFromProperties());

        Assert.assertEquals(budgetActivityPage.getBudgetPageName(), "BudgetActivity");
    }

}
