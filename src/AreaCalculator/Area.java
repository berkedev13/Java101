package AreaCalculator;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        int firstSide, secondSide, thirdSide;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first side length: ");
        firstSide = input.nextInt();
        System.out.print("Please enter second side length: ");
        secondSide = input.nextInt();
        System.out.print("Please enter third side length: ");
        thirdSide = input.nextInt();

        int perimeter = firstSide + secondSide + thirdSide;
        int u = perimeter / 2;
        double area = Math.sqrt(u * (u - firstSide) * (u - secondSide) * (u - thirdSide));
        System.out.println("This triangle area is " + area);


    }
}
