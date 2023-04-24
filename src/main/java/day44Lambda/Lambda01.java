package day44Lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Notlar :
           1) lines methoduna dosya yolunu yazmak için Paths classından get methodunu kullanmalıyız.
           2) foreach() methodu ile satır satır okuma yaptık.
           3) Files classındaki lines methodu datayı Stream olarak verir. Bu sebeple stream'deki bütün
              methodları burada kullanabiliriz.
 */
public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //Example 1 : Verilen text file icindeki text'i console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).forEach(t-> System.out.println(t));


        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).map(String :: toUpperCase).forEach(System.out::println);


        //Example 3 : Verilen text file icindeki text'i "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz
       boolean r1 = Files.lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);


        //Example 4 : Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").
                        split(" ")).
                flatMap(Arrays::stream).       //flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik
                distinct().
                collect(Collectors.toList());
        System.out.println(words);


        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.




    }//main
}
