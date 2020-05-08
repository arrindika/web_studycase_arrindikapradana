package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemLibraryPage {
  RandomUtils randomUtils = new RandomUtils();

  public void waitAbit(int millis){
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }
  public void clickCreate() {
    waitAbit(3000);
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.cssSelector("div.full-height div.toggled.show-billing-reminder div.wrapper-library-list.wrapper-0:nth-child(3) div.container.content-sidebar div.row div.col-md-10.col-md-offset-2.fixed-content-sidebar div.col-md-12.app-container:nth-child(2) div.full-height.section-content.list div.container-full-nosub.box-content-container div._2Oah00lf8cycj6dRFK6Dah div._3t6BtNcOJdLtZZoPP-fAd6 div._1ZtROoOluMqUhEhpX-qcmm.library-action-bar:nth-child(1) div.col-lg-6.col-md-6.col-sm-6.col-xs-6.no-padding.action-item span.pull-right ul._3qr_khNbjsHlGijkWFFRh-._314MAui579Qh_KiLhl1LQ_ li._2tDXGhEEhe9YDzx0rc0Vgt.li-total-item.visible-md.visible-lg:nth-child(1) > button.btn.btn-primary"));
    signInButton.click();
  }
  public void clickEdit() {
    waitAbit(3000);
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//table[@class='_1b4UAhw_Xz0057lBi6m7-K']//tbody"));
    signInButton.click();
  }
  public void inputItemName(){
    String nameCat = randomUtils.generateRandomFoodName();
    WebElement inputSearch = WebDriverInstance.webDriver.findElement(By.cssSelector("div.full-height div.toggled.show-billing-reminder div.wrapper-library-list.wrapper-0:nth-child(3) div.container.content-sidebar div.row div.col-md-10.col-md-offset-2.fixed-content-sidebar div.col-md-12.app-container:nth-child(2) div.full-height.section-content.list div.container-full-nosub.box-content-container div._2Oah00lf8cycj6dRFK6Dah div._3t6BtNcOJdLtZZoPP-fAd6 div.row.vxFakm2WiKVgEtAJ9ttFV:nth-child(2) div._3746MST2oRJ6dE2o3cKF7T.col-md-6.col-lg-6.visible-md.visible-lg.visible-sm.undefined div.BTOniXPMuHyKk_xpufHpx div.cQCieUePTgNOtZoH79x4D form.full-height.form-item div.Gczle9ywHrB7TwvYmlq5d.body-form-item div.row:nth-child(1) div.col-lg-9.col-md-9.col-sm-9.no-padding-left.no-padding-right._3__vkmyt8oQlI9tRxQCbYi:nth-child(3) div.row:nth-child(1) div.col-lg-12 div.form-group div:nth-child(1) > input.form-control.undefined"));
    inputSearch.clear();
    inputSearch.sendKeys(nameCat);
  }
  public void inputItemPrice(String price){
    WebElement inputSearch = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']"));
    inputSearch.sendKeys(price);
  }
  public void inputItemSKU(){
    String nameCat = randomUtils.generateRandomSKU();
    WebElement inputSearch = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='SKU']"));
    inputSearch.sendKeys(nameCat);
  }
  public void clickSave() {
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary no-outline']"));
    signInButton.click();
    waitAbit(3000);
  }
}
