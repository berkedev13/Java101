import java.util.Scanner;
public class AverageGrade {
    public static void main(String[] args) {
        double math, physics, turkish, history, chem, music, average;
        Scanner g = new Scanner(System.in);
        System.out.print("Please enter your math grade: ");
        math = g.nextDouble();
        System.out.print("Please enter your physics grade: ");
        physics = g.nextDouble();
        System.out.print("Please enter your turkish grade: ");
        turkish = g.nextDouble();
        System.out.print("Please enter your history grade: ");
        history = g.nextDouble();
        System.out.print("Please enter your chemistry grade: ");
        chem = g.nextDouble();
        System.out.print("Please enter your music grade: ");
        music = g.nextDouble();

        average = (music + chem + history + turkish + physics + math) / 6.0;

        System.out.println(average);

        if (average >= 60) {
            System.out.println("You passed!");
        }
        else {
            System.out.println("You did not passed!");
        }
    }
}
