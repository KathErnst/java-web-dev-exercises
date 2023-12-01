package review;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumericTypes2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        Double milesDriven = input.nextDouble();
        System.out.println("How many gallons of gas have you used? ");
        Double gallonsGas = input.nextDouble();
        input.close();
        Double milesPerGallon = milesDriven/gallonsGas;
        System.out.println("Your miles-per-gallon: " + milesPerGallon);
    }
}
