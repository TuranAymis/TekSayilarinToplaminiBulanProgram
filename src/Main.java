import java.util.Scanner;

/*
Proje Konusu
#Java ile kullanıcı negatif bir değer girene kadar kullanıcıdan sayı girişini kabul eden ve girilen sayılardan tek sayıları toplayıp ekrana basan programı yazın.

Örnek Çıktı
Sayı Giriniz : 2
Sayı Giriniz : 3
Sayı Giriniz : 7
Sayı Giriniz : -15
Toplam : 12
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int result = 0;

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();
            if (number < 0){
                break;
            }
            if (number % 2 == 1){
                result += number;
            }

        }
        System.out.println(result);
    }
}