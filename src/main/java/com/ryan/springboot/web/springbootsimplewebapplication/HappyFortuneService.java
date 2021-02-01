package com.ryan.springboot.web.springbootsimplewebapplication;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private String[] fortunes = {"You'll have a good day!", "You'll have an ok day!", "You'll have a bad day!"};
    @Override
    public String getFortune() {
        return getRandomFortune(fortunes);
    }

    private static String getRandomFortune(String[] array) {
        int rnd = new Random().nextInt(array.length);
        System.out.println("Random Number: "+rnd);
        return array[rnd];
    }

}
