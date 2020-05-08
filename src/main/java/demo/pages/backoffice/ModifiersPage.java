package demo.pages.backoffice;

import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModifiersPage {
//  When User click create modifier
//  And User input name "Toping" on name modifier field
//  And User click add manage option
//  And User click add option
//  And User input "name" on name option
//  And User input "1000" on price option
//  And User click save option
//  And User click save modifier
//  Then Moodifier is created
  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void clickCreateModifier(){
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]"));
    signInButton.click();
  }
  public void inputNameModifier(String name){
    WebElement inputSearch = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group']//div//input[@placeholder='Name']"));
    inputSearch.clear();
    inputSearch.sendKeys(name);
  }
  public void clickAddManageOption(){
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']"));
    signInButton.click();
  }
  public void clickAddOption(){
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]"));
    signInButton.click();
  }
  public void inputNameOption(String name){
    WebElement inputSearch = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']//input[@placeholder='Name']"));
    inputSearch.sendKeys(name);
  }
  public void inputPriceOption(String price){
    WebElement inputSearch = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-5']//input[@placeholder='Rp. 0']"));
    inputSearch.sendKeys(price);
  }
  public void clickSaveOption(){
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]"));
    signInButton.click();
  }
  public void clickSaveModifier(){
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
    signInButton.click();
  }
  public void clickEditModifier(){
    WebElement signInButton = WebDriverInstance.webDriver.findElement(By.cssSelector("div.full-height div.toggled.show-billing-reminder div.wrapper-library-modifier.wrapper-0:nth-child(3) div.container.content-sidebar div.row div.col-md-10.col-md-offset-2.fixed-content-sidebar div.col-md-12.app-container:nth-child(2) div.full-height.section-content.modifier div.container-full-nosub.box-content-container div._2Oah00lf8cycj6dRFK6Dah div._3t6BtNcOJdLtZZoPP-fAd6 div.row.vxFakm2WiKVgEtAJ9ttFV:nth-child(2) div._2u9WyANk0v1N6186ifrZDB.col-md-12.col-lg-12 div.lFJaC7dLP0xe5Xl77J8lI:nth-child(2) div._2_YEgVIcULqKttsPrgMOMW.modifiers-table-content-wrapper div:nth-child(1) table._2JuFI6X-Glp88Ls-NshcV2 tbody:nth-child(1) tr:nth-child(1) > td.Z-eIadU5btk94bugGbx1M"));
    signInButton.click();
  }
}
