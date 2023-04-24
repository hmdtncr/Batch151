package day15looparrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1) Array java nın aynı data tipinde  coklu data depolamak için oluşturduğu bi ryapıdır
        2) Arrayler primitve data tipleri veya referenceler ile çalışır
         */

     // Array nasıl oluşturulur
     String stdNames[]= new String[5];

     //Array nasıl yazdırılır
        System.out.println(Arrays.toString(stdNames)); // null, null ==> nullar Stringin default değerleridir

      //Array'a nasıl eleman eklenir
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));//Ajda, null,null,null

        //Arraty'deki specific bir elemanı nasıl alabiliriz
        System.out.println(stdNames[3]); //Cuneyt

        //Example1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

        //1.way:

        for(int i=0; i<stdNames.length; i++ ){ //length Stringler de parantezli (method), Arraylerde parantezsiz(method değil) kullanılır
            System.out.println(stdNames[i]+ "*");
        }
       //2.way: for-each-loop ==> Enhanced (zenginleştirilmiş) loop- mümkünse hep for-each loop kullanın

        for(String w: stdNames){
            System.out.println(w + "*");
        }
      //Example2: bir integer Array oluşturunuz, 5 eleman ekleyiniz, elemanların toplamını bulup consola yazdırınzı
        int ages [] = new int[5];
        System.out.println(Arrays.toString(ages)); //[0, 0, 0,]

        ages[0] = 12;
        ages[1] =23;
        ages[2] =9;
        ages[3]= 38;
        ages[4]= 27;
        System.out.println(Arrays.toString(ages)); //[12, 23, 9, 38, 27]

        int sum = 0;

        for(int w:ages){
            sum = sum + w;
        }
        System.out.println(sum); //109

        //Example 3:Bir char Arrays olusturunu, 3 eleman ekleyiniz, elemanlarin carpimini bulup console yazdiriniz
        char initials[] = new char[3];
        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';

        int carpim =1;

        for(char w : initials){
            carpim = carpim * w;

        }
        System.out.println(carpim); //384800

    }//main
}
