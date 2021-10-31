package Academy.devonline.java.basic.section_Cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random ( ).nextInt (10);

        while (true) {
            // read source data
            var userCase = new Scanner (System.in).nextInt ( );

            // processing
            if (number > userCase) {
                // display results
                System.out.println ("number > " + userCase + ". Try again:");
            } else if (number < userCase) {
                // display results
                System.out.println ("number < " + userCase + ". Try again:");
            } else {
                // display results
                System.out.println ("Congratulations, you guessed the number!");
                break;
            }
        }
    }
}