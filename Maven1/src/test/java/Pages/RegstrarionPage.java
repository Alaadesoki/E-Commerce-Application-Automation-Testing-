package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegstrarionPage {

    public WebElement firstNamePOM (WebDriver driver){
        //firstName
        By firstName = By.id("FirstName");
        WebElement firstNameElement = driver.findElement(firstName);
        return firstNameElement;
    }

    public WebElement lastNamePOM (WebDriver driver){
        //lastName
        By lastName = By.id("LastName");
        WebElement lastNameElement = driver.findElement(lastName);
        return lastNameElement;
    }
    public WebElement emailPOM (WebDriver driver){
        //email
        By email = By.id("Email");
        WebElement emailElement = driver.findElement(email);
        return emailElement;
    }
    public WebElement passwordPOM (WebDriver driver){
        //Password
        By password = By.id("Password");
        WebElement passwordElement = driver.findElement(password);
        return passwordElement;
    }

    public WebElement confirmpasswordPOM (WebDriver driver){
        //confirmPassword
        By confirmPassword = By.id("ConfirmPassword");
        WebElement confirmpasswordElement = driver.findElement(confirmPassword);
        return confirmpasswordElement;
    }
}
