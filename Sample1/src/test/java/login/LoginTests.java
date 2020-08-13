package login;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickSignIn();
        loginPage.setCompanyNameField("suwinco");
        loginPage.setUserNameField("suwin");
        loginPage.setPasswordField("123");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        assertTrue(dashboardPage.getTitle().contains("Dashboard"),"My Payslip");

    }

}
