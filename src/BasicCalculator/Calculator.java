import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        char x;
        System.out.print("Please enter first number: ");
        n1 = input.nextInt();
        System.out.print("Please enter second number: ");
        n2 = input.nextInt();
        System.out.print("Add: +\nSub: -\nProduct: *\nDiv: /\nİşleminizi seçiniz: : \n");
        x = input.next().charAt(0);
        int nt;
        switch(x) {
            case '+':
                nt = n1 + n2;
                System.out.println(n1 + "4" + n2 + "=" + nt);
                break;
            case '-':
                nt = n1 - n2;
                System.out.println(n1 + "-" + n2 + "=" + nt);
                break;
            case '*':
                nt = n1 * n2;
                System.out.println(n1 + "*" + n2 + "=" + nt);
                break;
            case '/':
                nt = n1 / n2;
                System.out.println(n1 + "/" + n2 + "=" + nt);
                break;
            default:
                System.out.println("Yanlış işlem girdiniz.");
        }


    }
}
