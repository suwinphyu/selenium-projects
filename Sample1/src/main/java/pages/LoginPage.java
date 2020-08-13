package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By companyNameField = By.id("CompanyName");
    private By userNameField = By.id("UserName");
    private By passwordField = By.id("password");
    private By loginButton = By.id("btnLoginMobile");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setCompanyNameField(String companyName) {
        driver.findElement(companyNameField).sendKeys(companyName);
    }

    public void setUserNameField(String userName) {
      driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public DashboardPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }

}
