package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("MUS", "Van", "Gumushane", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));
        bykHrfLenghtArtanDistinct(iller);
        System.out.println();

        bykHrfSonHarfArtanDistinct(iller);
        System.out.println();

        bykHrfLenghtArtanDistinctLenghtAlfabetikSira(iller);
        System.out.println();

        System.out.println(krktrSysBesFzlOlanlariSil(iller));
        System.out.println();

        System.out.println(hIleBaslayanOrRIleBitenElSil(iller));


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLenghtArtanDistinct(List<String> iller) {
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));


    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHarfArtanDistinct(List<String> iller) {
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));
    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfLenghtArtanDistinctLenghtAlfabetikSira(List<String> iller) {
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);// Lambda expresiion'da==>  forEach(t->System.out.print(t+" ")) seklinde yazilirken
        // Method Referance() ==> forEach(System.out::println); seklinde yazilir
    }

    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz
    //Note:Bazi durumlarda stream methodu aradigimiz methodlari vermez bu nedenle akisa sunmadan "iller." dedikten sonra removeIf() kullandik
    //  Note 2: removeIf() methodu silme islemi bir sarta bagli ise kullaniriz
    public static List<String> krktrSysBesFzlOlanlariSil(List<String> iller) {
        System.out.print("4) ");
        iller.removeIf(t -> t.length() > 5);

        return iller;
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanOrRIleBitenElSil(List<String> iller) {
        iller.removeIf(t -> t.startsWith("H") || t.endsWith("r"));

        return iller;

    }
}

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.




