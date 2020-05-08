package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryStepDefinition {

    CategoriesPage categoriesPage = new CategoriesPage();

    @Given("User is on create category page on backoffice")
    public void userIsOnCategoryPageOnBackoffice() {
        categoriesPage.clickCreate();
    }

    @When("User input name on create category page")
    public void userInputNameOnCreateCategoryPage() {
        categoriesPage.inputCategoryName();
    }

    @And("User click save category")
    public void userClickSaveCategory() {
        categoriesPage.clickSave();
    }

    @Then("Category saved")
    public void categorySaved() {
    }
}
