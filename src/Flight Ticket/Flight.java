import java.util.Scanner;
public class Flight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, km, option;
        System.out.print("Lütfen gidilecek KM'yi giriniz: ");
        km = input.nextInt();
        if (km <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }
        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();
        if (age <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }
        System.out.print("Tek yön için 1, Gidiş-Dönüş için 2 seçiniz: ");
        option = input.nextInt();
        if (!(option == 1 || option == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }
        double price;
        if (age < 12) {
            price = 0.1 * 0.5 * km;
            if (option == 2) {
                price *= 1.6;
            }
        } else if (age >= 12 && age <= 24) {
            price = 0.1 * 0.9 * km;
            if (option == 2) {
                price *= 1.6;
            }
        } else if (age > 65) {
            price = 0.1 * 0.7 * km;
            if (option == 2) {
                price *= 1.6;
            }
        } else {
            price = 0.1 * km;
            if (option == 2) {
                price *= 1.6;
            }
        }

        System.out.println("Toplam tutar: " + price + "TL");


    }
}
