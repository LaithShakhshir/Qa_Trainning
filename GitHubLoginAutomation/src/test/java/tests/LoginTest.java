package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DriverSetup;

public class LoginTest extends DriverSetup {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"validUser", "validPass"},
            {"invalidUser", "validPass"},
            {"validUser", "invalidPass"},
            {"", ""}  // Add more test cases from the Excel file
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        // Add assertions here to validate the login result.
    }
}
