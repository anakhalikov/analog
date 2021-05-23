package com.analog.pages;

import com.analog.utils.ConfigurationReader;
import com.github.javafaker.Faker;
import org.junit.Assert;

import java.util.*;

public class Producer{

    String numMessages;
    int numMesExpected;
    int numActual;
    int countMesActual;
    String numChars;
    int length;
    int[] phone;
    int count;
    boolean r5;

    Message message = new Message();
    Faker faker = new Faker();



    public Producer() {
    }

    public void generateMessage() {
        numMessages = ConfigurationReader.getProperty("numMessages");
        numMesExpected = Integer.parseInt(numMessages);

        if(numMesExpected <= 1000 && numMesExpected > 0) {
            message.genMes();
        } else {
            System.out.println("****** You entered invalid numbers of messages, please check again. Your Test is FAIL, out of default numbers!!!!");
        }
    }

    public void checkNumbersOfMessages() {
        numMessages = ConfigurationReader.getProperty("numMessages");
        numActual = Integer.parseInt(numMessages);
        countMesActual = 0;
            for (int i = 0; i < numActual; i++) {
                countMesActual++;
            }
        System.out.println("****** Number of entered messages is " + countMesActual);
    }


    public void resultNumOfMessages() {
        Assert.assertEquals(numMesExpected, countMesActual);
    }


    public void checkLengthMessage() {
        numChars = ConfigurationReader.getProperty("numChars");
        length = Integer.parseInt(numChars);

        System.out.println("****** Your message has "+ length + " chars");
    }

    public void resultOfCharInMessage() {
        Assert.assertTrue("****** Error!!!! Your message exceed numbers of chars", length <= 100);
    }

    public void checkIfMessagesAreUnique() {
        ArrayList<String> r3 = message.generateText();
        r5 = r3.containsAll(message.generateText());
        System.out.println("****** NOT THE SAME");
    }

        public void resultOfUniqueMessage() {
            if(r5){
                System.out.println("****** Message has duplicates");
            } else {
                System.out.println("****** Massage is unique");
            }
        }


        public void generatePhone() {
            phone = new int[]{faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9), faker.number().numberBetween(0, 9)};
            System.out.println("****** Phone number is " + phone[0] + phone[1]+phone[2]+phone[3]+phone[4]+phone[5]+phone[6]+phone[7]+phone[8] );
        }

        public void checkNumbersInPhone() {
           int count = 0;
           for(int i = 0; i <phone.length; i++) {
               count++;
           }
            System.out.println(count);
        }

        public void resultPhoneNUmber() {
            int phoneL = phone.length;
            if (phoneL >= count) {
                System.out.println("****** Phone number is correct");
            } else {
                System.out.println("****** Phone number is incorrect");
            }
        }

}









