import java.util.Scanner;
public class PassGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chem, music, total = 0;
        System.out.print("Enter math note: ");
        math = input.nextInt();
        if (math <= 100 && math >= 0) {
            total += math;
        }
        System.out.print("Enter physics note: ");
        physics = input.nextInt();
        if (physics <= 100 && physics >= 0) {
            total += physics;
        }
        System.out.print("Enter turkish note: ");
        turkish = input.nextInt();
        if (turkish <= 100 && turkish >= 0) {
            total += turkish;
        }
        System.out.print("Enter chem note: ");
        chem = input.nextInt();
        if (chem <= 100 && chem >= 0) {
            total += chem;
        }
        System.out.print("Enter music note: ");
        music = input.nextInt();
        if (music <= 100 && music >= 0) {
            total += music;
        }
        if (total / 5 >= 55) {
            System.out.println("Average grade: " + total / 5);
            System.out.println("You are passed.");
        } else {
            System.out.println("Average grade: " + total / 5);
            System.out.println("You are not passed.");
        }

    }
}
