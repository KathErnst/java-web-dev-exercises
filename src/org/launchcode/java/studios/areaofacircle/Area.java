package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        Double radius = input.nextDouble();
        while (radius.isNaN() || radius<= 0) {
            System.err.println("Error! Please enter a valid radius: ");
            radius = input.nextDouble();
        }
            double area = Circle.getArea(radius);
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
