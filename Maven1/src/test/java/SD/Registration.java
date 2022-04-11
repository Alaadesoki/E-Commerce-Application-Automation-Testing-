package SD;

import Pages.RegstrarionPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Registration {

 WebDriver driver = null;

    @Given("user navigat to the website")
    public void Register ()throws InterruptedException {
        // Bridge between test scripts & browser
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe" ;
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);

        // Nem object of webdriver
        driver = new ChromeDriver();
        // Navigate to google website maximize & wait 3 sec
        driver.navigate().to("https://demo.nopcommerce.com/n");
        driver.manage().window().maximize();

        Thread.sleep(3000);
    }

    @And("user enter valid data and click on register button")
    public void validData () throws InterruptedException {

        RegstrarionPage Regestration =new RegstrarionPage();

        //Personal data
        driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
        Regestration.firstNamePOM(driver).sendKeys("alaa");
        Regestration.lastNamePOM(driver).sendKeys("desoki");
        Regestration.emailPOM(driver).sendKeys("alaa@gmail.com");

        //PassWord
        Regestration.passwordPOM(driver).sendKeys("PassWordAlaa");
        //confirmPassWord
        Regestration.confirmpasswordPOM(driver).sendKeys("PassWordAlaa");

        //Click Register
//        driver.findElement(By.id("register-button")).click();

        Thread.sleep(3000);
    }

    @Then("User Could register successfully & go to home page")
    public void homePage() {
    String ExpectedResult  = "Your registration completed";
    String ActualResult = driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();

        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
    @After
    public void Quit () {
    driver.quit();
    }

}




