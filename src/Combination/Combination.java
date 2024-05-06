import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n_user, r_user, n = 1, r = 1, n_r = 1;
        System.out.print("Kümenin eleman sayısını giriniz: ");
        n_user = input.nextInt();
        System.out.print("Alt kümenin eleman sayısını giriniz: ");
        r_user = input.nextInt();
        for (int i = 1; i <= n_user; i++) {
            n *= i;
        }
        for (int i = 1; i <= r_user; i++) {
            r *= i;
        }
        for (int i = 1; i <= (n_user - r_user); i++) {
            n_r *= i;
        }
        System.out.println("C(n,r): " + (n / (r * n_r)));
    }
}
