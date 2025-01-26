package com.xyzcorp;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@ScenarioScoped
public class MarketingSteps {
    private Prospect prospect;

    @Inject
    private RequestService requestService;

    @Inject
    private EmailService emailService;

    @Inject
    private MessageService messageService;


    @Given("a prospect")
    public void aProspect() {
       this.prospect = new Prospect();
    }

    @When("they submit fill a form about their needs online")
    public void theySubmitFillAFormAboutTheirNeedsOnline() {
        requestService.submit(new ServiceRequest(prospect, "new service"));
    }

    @Then("we send an email acknowledging the receipt")
    public void weSendAnEmailAcknowledgingTheReceipt() {
         this.emailService.hasAcknowledgeBeenSentFor(prospect);
    }

    @Then("the prospect should be added to the {string} topic")
    public void theProspectShouldBeAddedToTheTopic(String topic) {
        this.messageService.contains(prospect);
    }
}
