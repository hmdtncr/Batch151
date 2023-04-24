package day15looparrays;

import java.util.Arrays;

public class Arrays02 {
    /*
    1)Application larda data ile bu dataları işleyen kodlar (logic) birbirinden ayrılır
    yani; logic dataya bağımlı olmamalıdır
    data ya bağımlı olarak yazılan kodlara 'hard code' denir
    'hard code' hatalı kod demektir

    Asağıdaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz
     */
    public static void main(String[] args) {
        // Array'leri kısa yoldan nasıl oluşturabiliriz
        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades)); //[67, 98, 100, 34, 76]

        //Example1: grades Array'ınde ki en küçük ve en büyük grade'in toplamını yazdıran kodu yazdırınız
        Arrays.sort(grades); //sort methodu küçükten büyüğe sıralıyor

        System.out.println(Arrays.toString(grades)); //[34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length-1]); //134

        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleriu console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

       for(String w : stdNames){
           if(w.length() <5)
               System.out.println(w);
       }
      //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isilerden onceki isimleri console'a yazdiriniz
        Arrays.sort(stdNames);

       for(String w: stdNames){
           if(w.startsWith("F")){
               break;
           }
           System.out.println(w);
       }
        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isilerden onceki isimleri v 'F' ile baslayanları console'a yazdiriniz
        Arrays.sort(stdNames);

        for(String w: stdNames){
            System.out.println(w);
            if(w.startsWith("F")){
                break;
            }

        }
    //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isiler hariç diğer isimleri console'a yazdiriniz

        Arrays.sort(stdNames); // sort() methodu numeric dataları küçükten büüyğe (ascening) dizer
                              // String leri ise alfabetik sırada dizer
                              // ascending + alphafedical ==>naturacal order

        for(String w: stdNames){

            if(w.startsWith("F")){
                continue;
            }else{
                System.out.println(w);
            }
        }



    }//main
}
