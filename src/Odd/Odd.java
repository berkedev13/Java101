import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;
        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        }while (number % 2 == 0);
        System.out.println("Toplam: " + total);
    }

}
