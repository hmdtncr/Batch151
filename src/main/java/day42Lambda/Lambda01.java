package day42Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        System.out.println(sortWithLastCharDistinctUpperInList(names)); //[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]

        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names)); // [alexander, michael, alex, alex, mary, jim, tom]

        System.out.println(isLengthMoreThanTwo(names)); // true

        System.out.println(noLengthLessThanThree(names)); // true

        System.out.println(atLeastOneisLengthLessThanFour(names)); // true
    }//main
    // Example 1: List elemanlarını son harflerine göre natural order'da tekrarsız olarak büyük harfle bir List'in içinde return ediniz
    //           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, JIM, TOM, ALEXANDER, ALEX, MARY]
    public static List<String>sortWithLastCharDistinctUpperInList (List<String> names) {

        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList());
        //Normalde distinct elemanlari depolamak icin "Set" kullanilir.
        // ama Lambda'daki collect(Collectors.toSet()); methodu elemanlari
        //rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
        //Bu yuzden mecburen collect(Collectors.toList()); kullandik
        //Sonucu bir List icinde gormek isterseniz collect(Collectors.toList()) methodu kullanilir.
    }
    //Example 2: List elemanlarini character sayiarina gore ters sirada kucuk harfle bir list'in icinde return ediniz.
    //         Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun

    public static List<String>sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){
       return names.stream().
               map(String::toLowerCase).
               sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
               collect(Collectors.toList());
    }
    // Example 3: List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean isLengthMoreThanTwo(List<String> names){
        return names.stream().allMatch(t->t.length()>2);
        //allMatch() methodu tum elemanlarda verilen sarta gore karsilastirma yapar.Tamami ortusuyorsa true bir tane bile sart uymuyorsadegilse false verir
    }
    // Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLengthLessThanThree (List<String> names){
        return names.stream().noneMatch(t->t.length()<3);
    }
    // Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean atLeastOneisLengthLessThanFour(List<String> name){
        return  name.stream().anyMatch(t->t.length()<4);
    }
    /* Match
         allMatch() ==> tum elemanlar sarti saglarsa true dondurur
         anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
         noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
    */
    }


