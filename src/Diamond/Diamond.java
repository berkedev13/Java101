import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, counter = 1;
        System.out.print("Lütfen tek sayı giriniz: ");
        x = input.nextInt();
        if (x % 2 == 0) {
            x++;
        }
        for (int i = 0; i < x/2; i++) {
            for (int j = 0; j < (x-counter)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < counter; j++) {
                System.out.print("*");
            }
            System.out.println();
            counter += 2;
        }
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
        counter -= 2;
        for (int i = 0; i < x/2; i++) {
            for (int j = 0; j < (x-counter)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < counter; j++) {
                System.out.print("*");
            }
            System.out.println();
            counter -= 2;
        }
    }
}
