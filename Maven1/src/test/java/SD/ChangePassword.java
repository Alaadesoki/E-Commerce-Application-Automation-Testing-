package SD;

import Pages.ChangPasswordPage;
import Pages.LoginPage;
import Pages.RegstrarionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ChangePassword {
    WebDriver driver = null;

    @Given("user enter valid data and click on login button")
    public void Register ()throws InterruptedException {

        RegstrarionPage Regestration =new RegstrarionPage();
        // Bridge between test scripts & browser
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe" ;
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);

        // Nem object of webdriver
        driver = new ChromeDriver();
        // Navigate to google website maximize & wait 3 sec
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        //Log in with valid email and password
        Regestration.emailPOM(driver).sendKeys("alaa@example.com");
        Regestration.passwordPOM(driver).sendKeys("alaa2020");
        driver.findElement(By.cssSelector("div [class=\"button-1 login-button\"]")).click();

    }

    @When("user enter old and new password and click to change password button")
    public void  NewPassword (){

        RegstrarionPage Regestration =new RegstrarionPage();
        LoginPage Login =new LoginPage();
        ChangPasswordPage ChangePasword = new ChangPasswordPage();


        //Click to my account
        driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    //Click to change password
        driver.findElement(By.cssSelector("By.cssSelector(\"a[href=\\\"/customer/changepassword\\\"]\")"));
    //Change password
        //Old Password
        ChangePasword.OldPasswordPOM(driver).sendKeys("alaa2020");
        //New Password
        ChangePasword.NewPasswordPOM(driver).sendKeys("alaa20201");
        //Confirm New Password
        ChangePasword.ConfirmNewPasswordPOM(driver).sendKeys("alaa20201");
        //Click Change Password
        ChangePasword.ClickChangePasswordPOM(driver).click();

    }

    @Then("User Could change password succesfuly")
    public void passwordChangedsuccesfuly (){
        String ExpectedResult = "Password was changed";
        String ActualResult = driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();

        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @AfterTest
    public void quit () {
        driver.quit();
    }
}
