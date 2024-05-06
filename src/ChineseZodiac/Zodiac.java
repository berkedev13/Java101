import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Lütfen doğum yılınızı girin: ");
        year = input.nextInt();
        year = year % 12;
        String animal = switch (year) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            default -> "Koyun";
        };
        System.out.println("Çin Zodyağı Burcunuz :" + animal);
    }
}
