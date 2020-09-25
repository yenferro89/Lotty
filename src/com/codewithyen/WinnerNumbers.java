package com.codewithyen;

import java.util.Random;

public class WinnerNumbers {
    //Instantiating an object that returns a random number
    private Random r = new Random();

    //Initializing two arrays to stored int numbers
    private int[] lotto_array = new int[6];
    private int[] fantasy5_array = new int[5];


    //Method that iterates trough the array and store random numbers within specific range in it.
    public int[] lottoNumWinners () {
        for (int i = 0; i < 6; i++)
            lotto_array[i] = r.nextInt(53);
        return lotto_array;
    }

    //Method that iterates trough the array and store random numbers within specific range in it.
    public  int[] fantasyWinners () {
        for (int i = 0; i < 5; i++)
            fantasy5_array[i] = r.nextInt(36);
        return fantasy5_array;
    }
}
