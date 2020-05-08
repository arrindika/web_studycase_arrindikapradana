package demo.pages;


import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class HomePage {
        public void chooseOrder(String itemName){
            String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = '%s']";
            AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath, itemName))).click();
        }
        public void clickCheckout(){
            WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
            checkoutButton.click();
        }
        public void clickCharge(){
            WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
            checkoutButton.click();
        }
        public void chooseLowPaymenr(){
            WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_lowest"));
            checkoutButton.click();
        }
    public void chooseMediumPaymenr(){
        WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_middle"));
        checkoutButton.click();
    }
    public void chooseHighPaymenr(){
        WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_highest"));
        checkoutButton.click();
    }
        public boolean isOnReceiptPage(){
            WebDriverWait wait = new WebDriverWait(androidDriver, 30);
            WebElement signInLabel = wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("change_text_view")));
            return signInLabel.isDisplayed();
        }
    public void clickQuantity(){
        WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("quantity_text_view"));
        checkoutButton.click();
    }
    public void changeQuantity(String item){
        WebElement inputSearch = AndroidDriverInstance.androidDriver.findElement(By.id("choose_item_variant_quantity"));
        inputSearch.clear();
        inputSearch.sendKeys(item);
    }
    public void saveQuantity(){
        WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        checkoutButton.click();
    }
    public void checkButtonCheckout(){
        WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
        checkoutButton.getAttribute("enabled");
    }
}
