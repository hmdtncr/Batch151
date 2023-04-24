package day03javaders.daymethodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

// Kullanicidan alacaginiz 4 basamakli sayinin ilk ve sonrakaminin toplamini
//ekrana yazdiran programi yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz....");
        int sayı = input.nextInt(); //8649

        int sonRakam = sayı%10; //son rakamı elde edicez
        int ilkRakam = sayı/1000; //ilk rakamı elde edicez
        System.out.println("ilkRakam+ sonRakam =" +(ilkRakam+sonRakam));






    }//main


}//class
