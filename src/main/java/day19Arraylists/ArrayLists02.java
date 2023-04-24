package day19Arraylists;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    /*
   Bir methodu öğrenirken asağıdaki 3 seyi iyi ogrenin
    1) method ne iş yapar?
    2) method nasıl kullanılır?
    3) method size neyi verir?

    primitiv int olur, primitiv int remove() method icinde kullanilinca Java onu index sanar.
    Java'ya 12 nin index olmadigini soylemek icin primitive int yerine wrapper class integer kullanmaliyiz.
     */
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");

     //ArrayList'de bir elemanın ilk görünümü nasıl silinir?
        cities.remove("Miami");
        System.out.println(cities); //[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList te bir eleman index kullanılarak nasıl silinir?
        cities.remove(2);
        System.out.println(cities); //[Giresun, Yozgat, Miami, Giresun] 'Miami yi sildiğimiz için onu atlıyor

      //ArrayList oluştururken en başa ArrayList yerine List de yazabilirsiniz. Sebebini Vollections konusunda göreceğiz.
      List<Integer> ages = new ArrayList<>();
      ages.add(23);
      ages.add(12);
      ages.add(7);
      ages.add(4);

    //Example 1 : "12" elemanını List'ten siliniz.
    ages.remove((Integer) 12);
        System.out.println(ages); // [23, 7, 4]

     // Bir ArrayLİst deki bir elemanın tüm görünümlerini nasıl sileriz?
     List<String> citiesToRemove = new ArrayList<>();
     citiesToRemove.add("Giresun");
     citiesToRemove.add("Yozgat");

     System.out.println(cities.removeAll(citiesToRemove)); // true,  silmek istediğini Listin içine koy
     System.out.println(cities); // [Miami]

     // Kısa  yoldan bir list oluşturmak için asağıdaki List.of() methodu kullanılabilir.
        List<Character> initials = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println(initials);// [a, k, c, d]

        List<Character> letters = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println(letters);

         // Equals () methodu;hem elemanlar aynı mı diye bakar hemde aynı elemanlar aynı index de mi diye balkar
        // İki ArrayList'in birbirine eşit olmadığını nasıl anlarız?

        boolean r1 = initials.equals(letters);
        System.out.println(r1);

        // indexOf('k') yazarsanız 'k' nin ilk gorunumunun index ini veirir.
        int r2 = initials.indexOf('k');
        System.out.println(r2); // 1

       //  lastindexOf('k') yazarsanız 'k' nin son gorunumunun index ini veirir.
        int r3 = initials.lastIndexOf('k');
        System.out.println(r3);

   // Example 2: Bir listteki tekrarsız elemanları console'a yazdıran kodu yazınız.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for(Double w : prices){
            if(prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.println(w + " "); // 3.75    4.0
            }
        }
        // Example 3: Bir tekrarlı eleman olup olmadığını gösteren kodu yazdırınız.
        List<Double> heights = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

            int counter = 0;
            for(Double w : heights){

            if(heights.indexOf(w) != heights.lastIndexOf(w)){
                counter++;
            }
        }
           if(counter ==0){
               System.out.println("All elemnets ara unique in the list");
           }else{
               System.out.println("At lest one element is not unique in the list");
           }

    }//main
}
