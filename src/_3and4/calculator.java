import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, counter = 0, total = 0;
        /* Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program */
        System.out.print("Sayıyı girin: ");
        number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 12 == 0) {
                total += i;
                counter++;
            }
        }
        System.out.println("Ortalama: " + (total / counter));
    }
}
