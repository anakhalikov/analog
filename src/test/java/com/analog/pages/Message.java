package com.analog.pages;

import com.analog.utils.ConfigurationReader;
import com.github.javafaker.Faker;

import java.util.*;

public class Message {

   String text;
   boolean randomRes;
   Map<ArrayList<String>, ArrayList<Boolean>> messageSend;
   int charsNumInt;
   ArrayList<String> as;
   ArrayList<Boolean> ab;
   Random r;
   String numOfChars;
   String numOfMessages;
   int numIntMess;

    Faker faker = new Faker();


    public ArrayList<String> generateText(){

        numOfChars = ConfigurationReader.getProperty("numChars");
        charsNumInt = Integer.parseInt(numOfChars);

        for (int i = 0; i < charsNumInt; i++) {
            text = faker.lorem().characters(charsNumInt);
            as = new ArrayList<>();
            as.add(text);
        }
        return as;
    }

    public ArrayList<Boolean> generateSendStatus(){
        numOfMessages = ConfigurationReader.getProperty("numMessages");
        numIntMess = Integer.parseInt(numOfMessages);
        r = new Random();
        ab = new ArrayList<>();

        for (int i = 0; i < numIntMess; i++) {
            randomRes = r.nextBoolean();
            ab.addAll(Collections.singleton(randomRes));
        }
        return ab;
    }

    public Map<ArrayList<String>, ArrayList<Boolean>> genMes(){
        String numMessages = ConfigurationReader.getProperty("numMessages");
        int numMesExpected = Integer.parseInt(numMessages);

        messageSend = new HashMap<>();

        for (int i = 0; i < numMesExpected; i++) {
            generateText().add(text);
            generateSendStatus().add(randomRes);
            messageSend.put(as, ab);
            System.out.println(text + " " +randomRes);
        }
        return messageSend;
        }

}







