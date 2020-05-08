package demo.steps_definition;

import demo.pages.SignInPage;
import demo.pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitionsAndroid {

  StartPage startPage = new StartPage();
  SignInPage signInPage = new SignInPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @When("User input email/phone {string} on sign in page")
  public void userInputEmailOnSignInPage(String user) {
    signInPage.inputEmailPhone(user);
  }

    @When("User input password {string} on sign in page")
    public void userInputPasswordOnSignInPage(String pass) {
      signInPage.inputPassword(pass);
    }

    @When("User click sign in button on sign in page")
    public void userClickSignInButtonOnSignInPage() {
    signInPage.clickSignIn();
    }

    @Then("User is on moka homepage")
    public void userIsOnMokaHomepage() {
      boolean actual = signInPage.isOnPage();
      Assert.assertTrue(actual);
    }

  @When("User click sign in button on moka start page android")
  public void userClickSignInButtonOnMokaStartPageAndroid() {
    signInPage.clickSignIn();
  }
}
