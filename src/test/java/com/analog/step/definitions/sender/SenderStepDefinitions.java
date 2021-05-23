package com.analog.step.definitions.sender;

import com.analog.pages.Producer;
import com.analog.pages.Sender;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class SenderStepDefinitions {

    Sender sender = new Sender();
    Producer producer = new Producer();

    @Given("Sender pickups generates messages")
    public void sender_pickups_generates_messages() {
        sender.senderPickupMessage();
    }

    @When("Sender generated")
    public void sender_generated() {
        sender.generateSender();
    }

    @Then("Sender check if message was sent")
    public void sender_check_if_message_was_sent() {
        sender.senderCheckIfSent();
    }




}
