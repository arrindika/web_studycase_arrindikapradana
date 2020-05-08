package demo.steps_definition;

import demo.pages.backoffice.ItemLibraryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ItemStepDefinition {

    ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
    @Given("User is on create Item page on backoffice")
    public void userIsOnCreateItemPageOnBackoffice() {
        itemLibraryPage.clickCreate();
    }

    @When("User input name on create item page")
    public void userInputNameOnCreateItemPage() {
        itemLibraryPage.inputItemName();
    }

    @And("User input price {string} on create item page")
    public void userInputPriceOnCreateItemPage(String price) {
        itemLibraryPage.inputItemPrice(price);
    }

    @And("User input SKU on create item page")
    public void userInputSKUOnCreateItemPage() {
        itemLibraryPage.inputItemSKU();
    }

    @And("User click save item")
    public void userClickSaveItem() {
        itemLibraryPage.clickSave();
    }

    @Then("Item saved")
    public void itemSaved() {
    }

    @Given("User is on edit Item page on backoffice")
    public void userIsOnEditItemPageOnBackoffice() {
        itemLibraryPage.clickEdit();
    }
}
