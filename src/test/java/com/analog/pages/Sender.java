package com.analog.pages;

import com.analog.utils.ConfigurationReader;
import com.github.javafaker.Faker;

import java.util.ArrayList;

public class Sender {

    Message message = new Message();
    Faker faker = new Faker();

    public void generateSender() {
        String numSender = ConfigurationReader.getProperty("numSender");
        int senderInt = Integer.parseInt(numSender);

        for (int i = 0; i < senderInt; i++) {
            String name = faker.name().fullName();
            int idFake = faker.number().numberBetween(0, 100);
            System.out.println("****** Sender is generated, fullName is " + name + " " + idFake);
        }
    }

    public void senderPickupMessage() {
        message.genMes();
    }

    public void senderCheckIfSent() {
        ArrayList<Boolean> ch = message.generateSendStatus();
        int countT = 0;
        int countF = 0;
        for (Boolean aBoolean : ch) {
            if (aBoolean) {
                countT++;
            } else {
                countF++;
            }
        }
        System.out.println(countT + " " + countF);
        if(countT > countF){
            System.out.println("****** Your message is sent" );
        } else {
            System.out.println("****** Your Sent FAIL!");
        }
        }

    }




