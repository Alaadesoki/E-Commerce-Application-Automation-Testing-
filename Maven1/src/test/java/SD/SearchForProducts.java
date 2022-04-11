package SD;

import Pages.ChangPasswordPage;
import Pages.LoginPage;
import Pages.RegstrarionPage;
import Pages.SearchForProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SearchForProducts {
    WebDriver driver = null;

    @Given("user open the website & loged with valid data")
    public void Searchforproduct ()throws InterruptedException {

        RegstrarionPage Regestration =new RegstrarionPage();
        LoginPage Login =new LoginPage();

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
        Regestration.emailPOM(driver).sendKeys("alaa.mostafa795@gmail.com");
        Regestration.passwordPOM(driver).sendKeys("alaa2020");
        Login.loginPOM(driver).click();;

    }

    @When("user search for laptop")
    public void SearchForSuchProduct (){

        SearchForProductPage SearchForProduct =new SearchForProductPage();

    ///Type The Product
        SearchForProduct.SearchForProductPOM(driver).sendKeys("laptop");
    //Click to  Search button
        SearchForProduct.ClickToSearchButtonPOM(driver).click();
    }

    @And("User landing to the laptops page")
    public void UseCouldFindTheProduct (){
        driver.findElement(By.linkText("https://demo.nopcommerce.com/search?q=laptop"));
        driver.getCurrentUrl();
        }

    @Then("User Found the result")
    public void ProductFound (){
        String ExpectedResult = "ADD TO CART";
        String ActualResult = driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();

        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @AfterTest
    public void quit () {
        driver.quit();
    }
}
