package com.xyzcorp;

import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ScenarioScoped
public class BakingFeatureSteps {

    @Given("a customer")
    public void aCustomer() {
    }

    @When("the customer search for local chefs specializing in {string}")
    public void theCustomerSearchForLocalChefsSpecializingIn(String item) {
    }

    @Then("a list of available chefs should be displayed")
    public void aListOfAvailableChefsShouldBeDisplayed() {
    }

    @Then("no chefs should be displayed")
    public void noChefsShouldBeDisplayed() {
    }

    @Then("the customer should be told that we cannot fulfill that order")
    public void theCustomerShouldBeToldThatWeCannotFulfillThatOrder() {
    }

    @Then("the customer should be told no deliveries will be made on a holiday")
    public void theCustomerShouldBeToldNoDeliveriesWillBeMadeOnAHoliday() {
    }

    @Then("the customer should be told no chefs will specialize in that.")
    public void theCustomerShouldBeToldNoChefsWillSpecializeInThat() {
    }


    @And("the date requested is {int}\\/{int}\\/{int}")
    public void theDateRequestedIs(int arg0, int arg1, int arg2) {
    }

    @And("the required delivery is {int}\\/{int}\\/{int}")
    public void theRequiredDeliveryIs(int arg0, int arg1, int arg2) {
    }
}
