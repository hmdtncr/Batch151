package day03scanner;

//Javanın util kütüphanesinden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
       //1.adım: Scanner class dan bir obje oluştur
        Scanner input = new Scanner(System.in);

        //objenin ismi input yaptık çünkü bu obje kullanıcıdan alınan datayı benim kodlarımın içine koyacak

        //2.adım: kullanıcıya ne istediğinize dair mesaj verin
        System.out.println("Lütfen yasınızı giriniz...");

        // 3. adım: uygun methodu kullanarak kullanıcının verdği datayı memorye yerleştiriniz
       byte age = input.nextByte();
        System.out.println(age);

    }

}
