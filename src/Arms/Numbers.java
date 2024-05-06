import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = 10, number, temp, total = 0;
        System.out.print("Numara giriniz: ");
        number = input.nextInt();
        while (number > 0) {
            temp = number % c;
            total += (temp / (c/10)) ;
            number -= (temp);
            c *= 10;
        }
        System.out.println("Toplam: " + total);
    }
}
