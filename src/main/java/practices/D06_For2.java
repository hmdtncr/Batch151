package practices;

import java.util.Scanner;

public class D06_For2 {
    public static void main(String[] args) {
        /*
         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız
        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaprak Satır Sayısını Giriniz.");
        int yaprakSatırSayısı = scan.nextInt();

        System.out.println("Gövde Satır Sayısını Giriniz");
        int govdeSatırSayısı = scan.nextInt();

        String yaprak = "";
        for(int i =0; i <yaprakSatırSayısı; i++){
           yaprak = yaprak + "^";
            System.out.println(yaprak);
        }

        for(int i =0; i <govdeSatırSayısı; i++){
            System.out.println("|||");
        }
    }//main
}
