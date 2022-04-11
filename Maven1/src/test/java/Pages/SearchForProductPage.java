package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForProductPage {

    public WebElement SearchForProductPOM (WebDriver driver){
        //Search Box
        By SearchForProduct = By.id("small-searchterms");
        WebElement SearchForProductElement = driver.findElement(SearchForProduct);
        return SearchForProductElement;
    }

    public WebElement ClickToSearchButtonPOM (WebDriver driver){
        //Search button
        By ClickToSearchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        WebElement ClickToSearchButtonElement = driver.findElement(ClickToSearchButton);
        return ClickToSearchButtonElement;
    }
}
