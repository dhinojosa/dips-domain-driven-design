package com.xyzcorp.cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BakingFeatureSteps {

    private String pastryitem;

    @Given("a customer")
    public void anExistingCustomer() {
           //load a customer
    }

    @When("the customer search for local chefs specializing in {word}")
    public void theCustomerSearchForLocalChefsSpecializingIn(String pastryitem) {
            //Chef Searching
        this.pastryitem = pastryitem;
    }

    @And("the date requested is {int}\\/{int}\\/{int}")
    public void theDateRequestedIs(int month, int day, int year) {

    }

    @And("the required delivery is {int}\\/{int}\\/{int}")
    public void theRequiredDeliveryIs(int month, int day, int year) {
    }

    @Then("a list of available chefs should be displayed")
    public void aListOfAvailableChefsShouldBeDisplayed() {

    }
}
