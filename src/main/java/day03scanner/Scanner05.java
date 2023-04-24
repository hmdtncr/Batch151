package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //Kullanıcıdan bir diktörtgenin iki kenar uzunluğunu alınız.
        //1) alanını hesaplayınız (kısa kenar * uzun kenar)
        //2) cevresini hesaplayını (2* kısa kenar + 2* uzun kenar)

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen kısan bir kenar uzunluğu giriniz.....");
        System.out.println("Lütfen uzun bir kenar uzunluğu griniz...");

        double kısaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();

        double alan = kısaKenar*uzunKenar; //tavsiye dilen

        System.out.println("Alan = "+(kısaKenar * uzunKenar));
        System.out.println("Cevre =" +(2*kısaKenar + 2*uzunKenar));

    }

}
