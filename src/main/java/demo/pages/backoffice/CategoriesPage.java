package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage {

  RandomUtils randomUtils = new RandomUtils();


  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }
  public void clickCreate() {
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]"));
    signInButton.click();
  }
  public void inputCategoryName(){
    String nameCat = randomUtils.generateRandomCategoryName();
    WebElement inputSearch = WebDriverInstance.webDriver.findElement(By.cssSelector("div.full-height div.toggled.show-billing-reminder div.wrapper-library-categories.wrapper-0:nth-child(3) div.container.content-sidebar div.row div.col-md-10.col-md-offset-2.fixed-content-sidebar div.col-md-12.app-container:nth-child(2) div.full-height.section-content.categories div.container-full-nosub.box-content-container div._2Oah00lf8cycj6dRFK6Dah div._3t6BtNcOJdLtZZoPP-fAd6 div.row.vxFakm2WiKVgEtAJ9ttFV:nth-child(2) div._3746MST2oRJ6dE2o3cKF7T.col-md-6.col-lg-6.visible-md.visible-lg.visible-sm.undefined div._3I5Z9GZRpJfkItTo0AbZEd form._3I5Z9GZRpJfkItTo0AbZEd div._13aXBTf2Y492v0n6hKgCYU.category-field-wrapper div.row:nth-child(2) div.col-sm-12 div:nth-child(1) > input.form-control.undefined"));
    inputSearch.sendKeys(nameCat);
  }
  public void clickSave() {
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary PhtzjEWwHfB2xdkEDI8ca']"));
    signInButton.click();
  }
}
