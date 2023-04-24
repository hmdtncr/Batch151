package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    //Kullanıcıdan ilk ismini ve soyismini alıp ikisini aynısatırda ekrana yazdırınız

    public static void main(String[] args) {

        //1.adım: Scanner classdan obje oluştur

        Scanner input = new Scanner (System.in);

        //2.adım: Kullanıcıya ne istediğimize dair mesaj
        System.out.println("ilk isminizi giriiniz...");
        String firstName = input.next();

        System.out.println("Soyisiminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName + lastName);

    }

}
