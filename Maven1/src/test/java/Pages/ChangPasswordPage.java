package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangPasswordPage {
    public WebElement ClickToMyAccountPOM (WebDriver driver){
        //Click to my account
        By ClickToMyAccount = By.className("account-link");
        WebElement ClickToMyAccountElement = driver.findElement(ClickToMyAccount);
        return ClickToMyAccountElement;
}

    public WebElement ChangePasswordPOM (WebDriver driver){
        //ChangePassword
        By ChangePassword = By.cssSelector("a[href=\"/customer/changepassword\"]");
        WebElement ChangePasswordElement = driver.findElement(ChangePassword);
        return ChangePasswordElement;
    }

    public WebElement OldPasswordPOM (WebDriver driver){
        //oldPassword
        By oldPassword = By.id("OldPassword");
        WebElement OldPasswordElement = driver.findElement(oldPassword);
        return OldPasswordElement;
    }

    public WebElement NewPasswordPOM (WebDriver driver){
        //newPassword
        By newPassword = By.id("NewPassword");
        WebElement NewPasswordElement = driver.findElement(newPassword);
        return NewPasswordElement;
    }

    public WebElement ConfirmNewPasswordPOM (WebDriver driver){
        //confirmNewPassword
        By ConfirmNewPassword = By.id("ConfirmNewPassword");
        WebElement confirmNewPasswordElement = driver.findElement(ConfirmNewPassword);
        return confirmNewPasswordElement;
    }

    public WebElement ClickChangePasswordPOM (WebDriver driver){
        //Click Change Password
        By ClickChangePassword = By.cssSelector("button[class=\"button-1 change-password-button\"]");
        WebElement ClickChangePasswordElement = driver.findElement(ClickChangePassword);
        return ClickChangePasswordElement;
    }
}
