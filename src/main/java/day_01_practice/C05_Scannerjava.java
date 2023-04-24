package day_01_practice;

import java.util.Scanner;

public class C05_Scannerjava {
    public static void main(String[] args) {
        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
        Scanner scan = new Scanner(System.in);

        System.out.println("adınızı giriniz..");
        String ad = scan.nextLine();

        System.out.println("soyadınızı giriniz");
        String soyad = scan.nextLine();

        System.out.println("yasınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("boyunuzu giriniz");
        int boy = scan.nextInt();

        System.out.println("kilonuzu giriniz");
        int kilo = scan.nextInt();

        System.out.println("Adi:"+ad+'\n'+"soyad:"+soyad+'\n'+"yas:"+yas+'\n'+"boy:"+boy+'\n'+"kilo:"+kilo);


    }
}
