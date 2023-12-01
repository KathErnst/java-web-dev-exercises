package review;

import java.util.Scanner;

public class NumericTypes {
    public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the length of the rectangle: ");
      Double length = input.nextDouble();
      System.out.println("Enter the width of the rectangle: ");
      Double width = input.nextDouble();
      Double area = length * width;
      System.out.println("The area of your rectangle is " + area);
      input.close();
    }
}
