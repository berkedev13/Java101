import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter distance traveled: ");
        double distance = input.nextDouble();

        double taxiFee = 10;

        final double feePerKM = 2.2;

        taxiFee += (feePerKM * distance);

        if (taxiFee < 20) {
            System.out.println("Taxi fee is 20");
        }
        else {
            System.out.println("Taxi fee is " + taxiFee);
        }


    }
}
