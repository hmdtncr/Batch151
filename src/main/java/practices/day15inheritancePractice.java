package practices;

import java.util.Scanner;

public class day15inheritancePractice {
    // bir fabrikada gerekli olan departmanları;
    // Personel, Muhasebe, Memur, Isci, Surekliİsci, Ustabasi olarak farklı classlara ayırınız
    // Muhasebe departmanı, Personel departmanına baglı olacak
    // Memur ve Isci departmanları, Muhasebe departmanına baglı olacak
    // Surekliİsci ve UstaBasi departmanları, İsci departmanına baglı olacak

    // Memur, Surekliİsci ve UstaBası departmanlarından obje olusturarak,
    // variable'lara kendi departmanlarına gore deger atayınız ve yazdırınız
    public static void main(String[] args) {

        // a,  i,  e
        String r = "Java is easy to Learn";
       int r1 = r.indexOf('a');
        System.out.println(r1);
       int r2 = r.indexOf('e');
       int r3= r.indexOf('i');
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r1 + r2 + r3);

        String t = "Ah Java vah Java sen ne guzel seysın Java";
        int t1 = t.indexOf("Java");
        System.out.println(t1);

        String y = "Java is easy to Learn";
        int y1 = y.lastIndexOf('a');
        int y2 = y.lastIndexOf('i');
        int y3 = y.lastIndexOf('e');
        System.out.println(y1 + y2 + y3);

        String a = "aac";
       char i = a.charAt(0);
       if(a.indexOf(i) == a.lastIndexOf(i)){
           System.out.println(i);
       }
       char i1 = a.charAt(1);
       if (a.indexOf(i1) == a.lastIndexOf(i1)){
           System.out.println(i1);
       }
       char i2 = a.charAt(2);
       if (a.indexOf(i2) == a.lastIndexOf(i2)){
           System.out.println(i2);
       }

       int num = 65;
       if(num>0){
           System.out.println("Sayi Pozitif");
       }else{
           System.out.println("Sayı Negatif");
       }

       int sayi = -123;
       if(sayi<99 && sayi>1000){
           System.out.println("Verilen sayi rakamdır");
       }else {
           System.out.println("Rakam değildir");
       }
        System.out.println();

       int rkm = -147;
       if(rkm<300 || rkm>1200){
           System.out.println("Harıka Rakam");
       }
       Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir rakam girirniz..");
        int veri = input.nextInt();
        if(veri %2 == 0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Tek sayı");
        }
    }//main
}
