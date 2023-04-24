package day_01_practice;

import java.util.Scanner;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {
      // 12345 sayısının rakamları toplamını bulunuz
/*

        int x = 12345;

        int birler = x%10; // 5

        int onlar = (x/10)%10; // 4

        int yuzler = (x/100)%10; // 3

        int binler = (x/1000)%10; // 2

        int onbinler = x/10000; //1
        System.out.println(birler + onlar + yuzler + binler + onbinler);
*/

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        System.out.println("Lütfen bir sayı giriniz.");

        /*
        if(sayi<0){
            System.out.println("Sayi pozitif deği");
        }else {
            System.out.println("Sayi pozitif");
        }
        */

     String result =sayi<0 ? "Pozitif" : "Değil";
        System.out.println(result);
    }//main

}//class
