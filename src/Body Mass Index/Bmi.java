import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height: ");
        double height = input.nextDouble();
        System.out.print("Please enter your mass: ");
        double mass = input.nextDouble();
        System.out.println("Your body mass index is " + (mass / (height * height)));
    }
}
