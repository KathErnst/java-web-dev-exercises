package org.launchcode.java.countingcharactersstudio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        System.out.println("Please enter a quote: ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        char[] splitQuote = quote.toLowerCase().toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] letters = alphabet.toCharArray();
        int alphabetCount = 0;

        HashMap<Character, Integer> count = new HashMap<>();
        for (char quoteLetter : splitQuote) {
            for (char alphabetLetter : letters) {
                if (quoteLetter == alphabetLetter) {
                    alphabetCount ++;
                    count.put(alphabetLetter, alphabetCount);
                }

            }

        }
        for (Map.Entry<Character, Integer> alpha : count.entrySet()) {
            System.out.println(alpha.getKey() + ": " + alpha.getValue());
        }
    }
}
