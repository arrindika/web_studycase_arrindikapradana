package demo.steps_definition;

import demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaCheckout {

    HomePage homePage = new HomePage();

    @When("User order {string} on favorites page")
    public void userOrderOnFavoritesPage(String item) {
        homePage.chooseOrder(item);
    }

    @When("User click charge payment on homepage")
    public void userClickChargePaymentOnHomepage() {
        homePage.clickCheckout();
    }

    @When("User choose low payment")
    public void userChooseLowPayment() {
        homePage.chooseLowPaymenr();
    }

    @When("User click charge on payment page")
    public void userClickChargeOnPaymentPage() {
        homePage.clickCharge();
    }


    @Then("User see receipt page")
    public void userSeeReceiptPage() {
        boolean actual = homePage.isOnReceiptPage();
        Assert.assertTrue(actual);
    }

    @When("User click quantity on favorites page")
    public void userClickQuantityOnFavoritesPage() {
        homePage.clickQuantity();
    }

    @When("User change quantity to {string}")
    public void userChangeQuantityTo(String item) {
        homePage.changeQuantity(item);
    }

    @When("User click save")
    public void userClickSave() {
        homePage.saveQuantity();
    }

    @And("User choose medium payment")
    public void userChooseMediumPayment() {
        homePage.chooseMediumPaymenr();
    }

    @And("User choose high payment")
    public void userChooseHighPayment() {
        homePage.chooseHighPaymenr();
    }
}
