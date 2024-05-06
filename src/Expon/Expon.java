import java.util.Scanner;
public class Expon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        System.out.print("Üslü alınacak sayısı giriniz: ");
        n = input.nextInt();
        System.out.print("Üslü giriniz: ");
        k = input.nextInt();
        long temp = 1;
        for (int i = 1; i <= k; i++) {
            temp *= n;
        }
        System.out.println("Sonuç: " + temp);
    }
}
