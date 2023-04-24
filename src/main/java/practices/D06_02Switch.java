package practices;

import java.security.interfaces.RSAPrivateCrtKey;
import java.util.Scanner;
public class D06_02Switch {
    public static void main(String[] args) {
         /*
  Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.
     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen 1-4 arası bir işlem numarası giriniz." + "\n" +
                "işlem 1: Bakiye Sorgulama" + "\n" +
                "işlem 2: Para Çekme" + "\n" +
                "işlem 3: Para Yatırma" + "\n" +
                "işlem 4: işlemi Sonlandır");
        int islemNo = scan.nextInt();

        int bakiye = 1000;
        switch (islemNo){
            case 1: // bakiye sorgulama
                System.out.println("Bakiyeniz: " + bakiye + "TL");
                break;
            case 2: // para çekme
                System.out.println("Lütfen Cekmek İstediğiniz Tutarı Giriniz.");
                int cekilecekPara = scan.nextInt();

                if(cekilecekPara<=bakiye){
                    bakiye = bakiye-cekilecekPara;
                    System.out.println("Para çekme işleminden sonraki bakiyeniz: " + bakiye + "TL");
                }else{
                    System.out.println("Bakiyeniz Yetersiz.");
                }
                break;
            case 3: // Para yatırma
                System.out.println("Yatırmak İstediğiniz Tutarı Giriniz.");
                int yatirilacakTutar = scan.nextInt();
                if(yatirilacakTutar<=2000){
                    bakiye = bakiye+yatirilacakTutar;
                    System.out.println("Para Yatırma Islemi Sonrası Tutarınız: " + bakiye + "TL");
                }else{
                    System.out.println("ATM' de günlük Para Yatırma Limiti 2000 TL");
                }
                break;
            case 4:
                System.out.println("TECHPRO BANK'ı Kullandığınız için Teşekkür Ederiz");
                break;
            default:
                System.out.println("Geçerli Bir İslem Numarası Giriniz");
        }




    }//main
}
