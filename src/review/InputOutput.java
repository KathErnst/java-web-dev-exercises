package review;

import java.util.Scanner;

public class InputOutput {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what's your name? ");
        String name = input.nextLine();
        System.out.println("Well, hi there, " + name + "!");
        input.close();
    }
}
