package com.analog.step.definitions.producer;

import com.analog.pages.Producer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProducerStepDefinitions {

    Producer producer = new Producer();

    @Given("Producer generates messages")
    public void producer_generates_messages() {
        producer.generateMessage();
    }

    @When("Producer check numbers of generated messages")
    public void producer_check_numbers_of_generated_messages() {
       producer.checkNumbersOfMessages();
    }

    @Then("Producer see results numbers")
    public void producer_see_results_numbers() {
        producer.resultNumOfMessages();
    }

    @When("Producer check number of characters in message")
    public void producer_check_number_of_characters_in_message() {
        producer.checkLengthMessage();
    }

    @Then("Producer see result of message")
    public void producer_see_result_of_message() {
        producer.resultOfCharInMessage();
    }

    @When("check if message are unique")
    public void checkIfMessageAreUnique() {
        producer.checkIfMessagesAreUnique();
    }

    @When("Producer see result if messages are unique")
    public void producer_see_result_if_messages_are_unique() {
        producer.resultOfUniqueMessage();
    }


}
