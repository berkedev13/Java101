import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        int first, second, third, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        first = input.nextInt();
        System.out.print("Enter second number: ");
        second = input.nextInt();
        if (first < second) {
            temp = first;
            first = second;
            second = temp;
        }
        System.out.print("Enter third number: ");
        third = input.nextInt();
        if (second < third) {
            temp = second;
            second = third;
            third = temp;
        }
        if (first < second) {
            temp = first;
            first = second;
            second = temp;
        }
        System.out.println(first + ">" + second + ">" + third);


    }
}
