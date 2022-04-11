package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement loginPOM (WebDriver driver){
        //Presslogin
        By Presslogin = By.cssSelector("div [class=\"button-1 login-button\"]");
        WebElement loginElement = driver.findElement(Presslogin);
        return loginElement;
    }
}

