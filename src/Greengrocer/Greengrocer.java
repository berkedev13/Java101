import java.util.Scanner;
public class Greengrocer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;
        System.out.print("How many kilos of pears: ");
        int pearKG = input.nextInt();
        System.out.print("How many kilos of apple: ");
        int appleKG = input.nextInt();
        System.out.print("How many kilos of tomato: ");
        int tomatoKG = input.nextInt();
        System.out.print("How many kilos of banana: ");
        int bananaKG = input.nextInt();
        System.out.print("How many kilos of eggplant: ");
        int eggplantKG = input.nextInt();

        System.out.println("Total Amount: " + ((pearKG * pear) + (appleKG * apple) + (tomatoKG * tomato) + (bananaKG * banana) + (eggplantKG * eggplant)));


    }
}
