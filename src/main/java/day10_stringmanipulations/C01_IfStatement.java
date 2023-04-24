package day10_stringmanipulations;

import day03scanner.Scanner01;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // if it rain; I will cancel the picnic

        // ex: verilen bir kaarakteri bük harf ise ekrana BÜYÜK harf  yazdıran kodu yazınız.

        char ch = 'A';

        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk Harf");

        }//if
     /*
      karşılastırm aoperatötleri;
      == eşit mi      != esit değilmi       >=büyük eşit       <=küçük eşit
     */
        //ex: verilen sayı çift sayı ise ekrana çift sayı yazınız.

        byte sayi = 24;
        if (sayi %2== 0){
            //kodun dinamik yazılması için variablenin isimi yazılır.
            // eğer direkt yazılıırsa hurd coding yani tek datalık kod olur
            System.out.println("çift sayi");
        }//if

        // verilen bir sayı 300 den küçük veya 1200 den büyük ise "harika sayı" yazan kodu yazdırınız.

        int sayi1 = 147;
        if (sayi1 <300 || sayi1 >1200){
            System.out.println("Harika sayi");
        }//if

        // kullanıcıdan alınana datanın tek sayımı çift sayımı olan kodu yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int num = input.nextInt();

   // 1.yo bağımsız if statement

        if (num %2 ==0){
            System.out.println("çift sayi");
        }//if çift

        if (num %2 !=0);{
            System.out.println("tek sayı");
        }//if çift

  // 2.yol if  else
        if (num %2 ==0){
            System.out.println("çift sayi");
        }else {
            System.out.println("tek sayı");
        }

        // VERİLEN BİR SAYININ NEGATİF Mİ POZİTİF Mİ NOTR MU OLDUĞUU SÖYLEYEN BİR SAYI


    }//main

}//class
