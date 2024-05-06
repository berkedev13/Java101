import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double total = 0;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        for (int i = 1; i <= number ; i++) {
            total += (1.0/i);
        }
        System.out.println("Harmonik sayı: " + total);
    }
}
