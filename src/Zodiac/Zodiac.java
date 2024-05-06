import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month;
        int day;
        System.out.print("Doğum gününüzü giriniz: ");
        day = input.nextInt();
        input.nextLine();
        System.out.print("Doğum ayınızı giriniz: ");
        month = input.nextLine();
        if (month.equals("Nisan")) {
            if (day <= 20) {
                System.out.println("Koç");
            } else {
                System.out.println("Boğa");
            }
        } else if (month.equals("Mayıs")) {
            if (day <= 21) {
                System.out.println("Boğa");
            } else {
                System.out.println("İkizler");
            }
        } else if (month.equals("Haziran")) {
            if (day <= 22) {
                System.out.println("İkizler");
            } else {
                System.out.println("Yengeç");
            }
        } else if (month.equals("Temmuz")) {
            if (day <= 22) {
                System.out.println("Yengeç");
            } else {
                System.out.println("Aslan");
            }
        } else if (month.equals("Ağustos")) {
            if (day <= 22) {
                System.out.println("Aslan");
            } else {
                System.out.println("Başak");
            }
        } else if (month.equals("Eylül")) {
            if (day <= 22) {
                System.out.println("Başak");
            } else {
                System.out.println("Terazi");
            }
        } else if (month.equals("Ekim")) {
            if (day <= 22) {
                System.out.println("Terazi");
            } else {
                System.out.println("Akrep");
            }
        } else if (month.equals("Kasım")) {
            if (day <= 21) {
                System.out.println("Akrep");
            } else {
                System.out.println("Yay");
            }
        } else if (month.equals("Aralık")) {
            if (day <= 21) {
                System.out.println("Yay");
            } else {
                System.out.println("Oğlak");
            }
        } else if (month.equals("Ocak")) {
            if (day <= 21) {
                System.out.println("Oğlak");
            } else {
                System.out.println("Kova");
            }
        } else if (month.equals("Şubat")) {
            if (day <= 19) {
                System.out.println("Kova");
            } else {
                System.out.println("Balık");
            }
        } else if (month.equals("Mart")) {
            if (day <= 20) {
                System.out.println("Balık");
            } else {
                System.out.println("Koç");
            }
        }

    }
}
