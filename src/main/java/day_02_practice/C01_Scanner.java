package day_02_practice;

import java.util.Scanner;
import java.util.SortedMap;

public class C01_Scanner {
    public static void main(String[] args) {
     //Example 1: Kullanıcıdan aldığınız bir şekil ile aşağıdaki sekli oluşturan kodu yazınız.
         /*
                     A  // 2 space + ch + 2 space
                    A A // 1 space + ch + 1 space +ch +1 space
                  A A A // 1 ch + 1 space + 1ch + 1space + 1ch
            */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz...");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        //Example 2: Kullanıcıdan 2 sayı alıp 4 işlem yapan ve
        // işlemlerin sonuçlarını ekrana yazdıran basit bir hesap makinesi kodunu yazınız.
        System.out.println("Lütfen 2 sayi giriniz...");
        int sayi1=input.nextInt();
        int sayi2= input.nextInt();
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);

        //Example 3: Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk 2 ve son 2 rakamları toplamını bulan kodu yazınız
        // 1.Yol:
        System.out.println("Lütfen 5 basamaklı bir sayi giriniz...");
        int num = input.nextInt(); //12345
        
        int IlkIkiRakam = num/1000;
        System.out.println("IlkIkiRakam = " + IlkIkiRakam); //IlkIkiRakam = 12 (bunu istemiyoruz ıkı sayınıntoplamını istiyoruz)
        
        int IlkIkiToplam = (IlkIkiRakam%10)+(IlkIkiRakam/10);
        System.out.println("IlkIkiToplam = " + IlkIkiToplam);//IlkIkiToplam = 3

        int SonIkiRakam = num%100; 
        int SonIkiRkmToplam = (SonIkiRakam%10)+(SonIkiRakam/10);
        System.out.println("SonIkiRkmToplam = " + SonIkiRkmToplam);//SonIkiRkmToplam = 9

        int toplam=IlkIkiToplam+SonIkiRkmToplam;
        System.out.println("toplam = " + toplam);//toplam = 12

       // 2.Yol:
        System.out.println("Lütfen 5 basamaklı bir sayi giriniz...");
        int number = input.nextInt(); //12345

        int first =number%10;
        int second = number/10%10;
        int third = number%10;
        int fourth = number/10%10;
        int fifth = number/10%10;

    }//main
}
