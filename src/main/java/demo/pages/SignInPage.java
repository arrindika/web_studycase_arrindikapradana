package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class SignInPage {
    public void inputEmailPhone(String user){
        WebElement inputSearch = AndroidDriverInstance.androidDriver.findElement(By.id("emailOrPhoneEditText"));
        inputSearch.sendKeys(user);
    }
    public void inputPassword(String password){
        WebElement inputSearch = AndroidDriverInstance.androidDriver.findElement(By.id("passwordEditText"));
        inputSearch.sendKeys(password);
    }
    public void clickSignIn(){
        WebElement signInButton = AndroidDriverInstance.androidDriver.findElement(By.id("signInButton"));
        signInButton.click();
    }
    public boolean isOnPage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement signInLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("customerTitle")));
        return signInLabel.isDisplayed();
    }
}
