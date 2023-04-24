package practices;

import java.util.Scanner;

public class D06_For3 {
    public static void main(String[] args) {
        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz
         */

        Scanner scan = new Scanner(System.in);

        int toplam =0;

        for(int i=0; i <5 ; i++){
            System.out.println("Bir Sayı Giriniz.");
            int sayi = scan.nextInt();

            if(sayi>=5 && sayi<=10){
                System.out.println("Girdiğiniz Sayı 5 ile 10 arasında olduğundan işleme alınmayacaktır.");
            }else{
                toplam = toplam + sayi;
            }
        }
        System.out.println(toplam);

    }//main
}
