package SD;

import Pages.LoginPage;
import Pages.RegstrarionPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {

    WebDriver driver = null;

    @Given("user open the website")
    public void OpenBrowser ()throws InterruptedException {
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
    }

    @When("user enter valid data and click on login button")
    public void InsertData () throws InterruptedException {

        RegstrarionPage Regestration =new RegstrarionPage();
        LoginPage Login =new LoginPage();

        Regestration.emailPOM(driver).sendKeys("alaa@example.com");
        Regestration.passwordPOM(driver).sendKeys("alaa2020");
        Login.loginPOM(driver).click();

        Thread.sleep(2000);
    }

    @Then("User Could login successfully & go to home page")
    public void loginSuccessfully () {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
    }
    @After
    public void quit () {
        driver.quit();
    }
}
