//********************************************************************************
// PantherID:  6183577
// CLASS: COP 2210 – Fall 2020
// ASSIGNMENT # 1
// DATE: 09/16/2020
//
// I hereby swear and affirm that this work is solely my own, and not the work
// or the derivative of the work of someone else.
//********************************************************************************

package com.codewithyen;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        WinnerNumbers Numbers = new WinnerNumbers();

        // Formatted output string
        String message = "Lotto winning numbers: " + Arrays.toString(Numbers.lottoNumWinners()) +
                "\nFantasy 5 winning numbers: " + Arrays.toString(Numbers.fantasyWinners());

        // Output panel message
        JOptionPane.showMessageDialog(null, "Welcome to the Lotty App.\n" +message);

    }
}
