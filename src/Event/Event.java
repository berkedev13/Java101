import java.util.Scanner;
public class Event {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.print("Enter the heat: ");
        heat = input.nextInt();

        String activity = switch (heat) {
            case 0, 1, 2, 3, 4 -> "Kayak";
            case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 -> "Sinema";
            case 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 -> "Piknik";
            default -> "Yüzme";
        };

        System.out.println("Hava sıcaklığı " + heat + " derece olduğuna göre, önerimiz: " + activity);
    }

}
