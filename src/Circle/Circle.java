import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter radius of the circle: ");
        double radius = input.nextDouble();
        System.out.print("Please enter central angle of the circle: ");
        double angle = input.nextDouble();
        final double pi = 3.14;

        double area = pi * radius * radius * angle / 360;
        System.out.println("Area of the circle: " + area);



    }
}
