package com.analog.step.definitions.producer;

import com.analog.pages.Producer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PhoneNumberStepDefinitions {

    Producer producer = new Producer();

    @Given("Producer generate phone number")
    public void producer_generate_phone_number() {
        producer.generatePhone();
    }

    @Then("check how many numbers include in phone number")
    public void check_how_many_numbers_include_in_phone_number() {
        producer.checkNumbersInPhone();

    }
    @Then("Producer see results if phone number is correct")
    public void producer_see_results_if_phone_number_is_correct() {
        producer.resultPhoneNUmber();
    }




}
