import java.util.Scanner;
public class Con {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, counter_5 = 5, counter_4 = 4;
        System.out.print("Lütfen sayı giriniz: ");
        a = input.nextInt();
        System.out.println("1");
        while (counter_4 <= a || counter_5 <= a) {
            if (counter_4 <= a) {
                System.out.println(counter_4);
                counter_4 *= 4;
            }
            if (counter_5 <= a) {
                System.out.println(counter_5);
                counter_5 *= 5;
            }
        }
    }
}
