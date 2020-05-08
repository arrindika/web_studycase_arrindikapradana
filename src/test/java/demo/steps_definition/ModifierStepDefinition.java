package demo.steps_definition;

import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifierStepDefinition {
    ModifiersPage modifiersPage = new ModifiersPage();

    @Given("User is on moka modifier create page on backoffice")
    public void userIsOnMokaModifierOnBackoffice() {
        modifiersPage.clickCreateModifier();    }

    @And("User input name {string} on name modifier field")
    public void userInputNameOnNameModifierField(String name) {
        modifiersPage.inputNameModifier(name);
    }

    @And("User click add manage option")
    public void userClickAddManageOption() {
        modifiersPage.clickAddManageOption();
    }

    @And("User click add option")
    public void userClickAddOption() {
        modifiersPage.clickAddOption();
    }

    @And("User input {string} on name option")
    public void userInputOnNameOption(String name) {
        modifiersPage.inputNameOption(name);
    }

    @And("User input {string} on price option")
    public void userInputOnPriceOption(String price) {
        modifiersPage.inputPriceOption(price);
    }

    @And("User click save option")
    public void userClickSaveOption() {
        modifiersPage.clickSaveOption();
    }

    @And("User click save modifier")
    public void userClickSaveModifier() {
        modifiersPage.clickSaveModifier();
    }

    @Then("Moodifier is created")
    public void moodifierIsCreated() {
    }

    @Given("User is on moca modifier edit page on backoffice")
    public void userIsOnMocaModifierEditPageOnBackoffice() {
        modifiersPage.clickEditModifier();
    }

    @When("User change name {string} on name modifier field")
    public void userChangeNameOnNameModifierField(String name) {
        modifiersPage.inputNameModifier(name);
    }

    @Then("Modifier is updated")
    public void modifierIsUpdated() {
    }
}
