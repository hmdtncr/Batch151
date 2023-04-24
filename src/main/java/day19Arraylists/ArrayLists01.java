package day19Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayLists01 {
    /*
    1) Aynı data type inde ki çoklu dataları depolamak için Array kullanırız.
    2) Array'lerin bir negatif yanı var; içine koyacağınız eleman sayısını en basta belirlemek zorundasınız.
    3) Array'ler eleman syısında esnek değilllerdir. BU yuzden Java "ArrayList" adlı yeni bir yapı oluşturdu.
       bu yapı eleman sayısında esnektir. Hiç eleman koymazsanız eleman sayısısnı sıfır olarak ayarlarlar, 1000
       eleman koyarsanız eleman sayısını 1000 olarak ayarlar.
    4) "ArrayList" yerine sadece ""list" de diyebiliriz.
    5) Java ArrayList'leri oluşturduktan sonra Arrayl'leri iptal etmedi çünkü;
       i) Array'ler super hızlıdır.
       ii) Array'ler memory de çoook az yer kaplar.
    6) Array'lar "primitive dat" type'ları ve "reference" leri depolayabilir ama "ArrayList" ler "non-primitive"
       data typlarını depolar bu yüzden "ArrayList" ler Array lerden daha cok yer kaplar.
     */
    public static void main(String[] args) {

        //ArrayList nasıl oluşturukur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages); // []
  // add elemanı olduğu gibi yerleştirir.

        //ArrayList'e eleman nasıl eklenir?
     //1.Way:
        ages.add(12);
        ages.add(24);
        ages.add(9); // add methodu elemanlarını giriş sırasına göre List'e yerleştirir.
        System.out.println(ages); // [12, 24, 9]

     // 2.Way:
        ages.add(1,99);
        System.out.println(ages); //[12, 99, 24, 9]

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

     // 3.Way: AddAll methodu bir list'i diğer list'in içine yerleştirir.
       ages.addAll(price);
       System.out.println(ages); //[12, 99, 24, 9, 23, 33]

     // 4.Way:
     ages.addAll(3,price); // bir List'i baska bir Listin içinde istediğin index'e koyuyor
        System.out.println(ages); //[12, 99, 24, 23, 33, 9, 23, 33]

      // ArrayLİst de eleman sayısı nasıl bulunur?
        int numOfElement = ages.size();
        System.out.println(numOfElement); // 8

      // ArrayList de specific bir eleman nasıl alınır?
        int ell = ages.get(3); // get() methodu index kullnarak istediğimiz elemanı almaya yarar.
        System.out.println(ell); // 23

      // ArrayList de specific bir eleman nasıl değiştirilir? değiştirmek istediğiniz indexi yazıyoruz
       ages.set(6, 111);//index 6 daki değeri 111 değeri ile değiştirdi.
        System.out.println(ages); // [12, 99, 24, 23, 33, 9, 111, 33]

      // ArrayLİst de specific bir elemanın var olup olmadıgını bulmaya yarar.
       boolean r1 = ages.contains(99); // ör: 99 var mı diye bakıyoruz
        System.out.println(r1); // true

      // ArrayList'inde eleman var mı yok mı? yani bu list boş mu dolu mu?
        boolean r2 = ages.isEmpty();
        System.out.println(r2); // false,  boş değil yani bu list dolu

      // ArrayList'de ki tüm elemanları nasıl sileriz? List'de ki tüm elemanları siler.
        ages.clear();
        System.out.println(ages); //[]

       boolean r3 = ages.isEmpty(); //sildikten sonra tekrar bakıyoruz, bu list boş mu diye
        System.out.println(r3); // true

      //Example 1: Bİr List'in bos olup oladığını kontrol eden kodu yazınız.
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelına");
        names.add("Brad");

        // 1.Way:
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }
         //2.Way:
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }



    }//main
}//class




