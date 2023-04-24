package day33Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {

    String s = "Hello Henry";
        System.out.println(getTheNumOfOccurrrenceOfLetters(s)); // { =1, r=1, e=2, H=2, y=1, l=2, n=1, o=1}
    }//main
    // Example 1: Verilen bir String de hangi harfin kaç defa kullanıldığını veren method oluşturunuz.
    //            "Hello Henry" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
    public static TreeMap<String, Integer> getTheNumOfOccurrrenceOfLetters(String s){
        // String'deki harf dışı lkarakterleri sil
        s.replaceAll("[^A-Za-z]", "");
        // Görünüm sayılarını depolamak için Map oluştur.
        TreeMap<String, Integer> numOfOccurence = new TreeMap<>();

        // Harfleri al
        String letters[] = s.split("");

        // for-each loop
        for(String w: letters){
            Integer numOfOcc = numOfOccurence.get(w);
            if(numOfOcc==null){
                numOfOccurence.put(w,1);
            }else{
                numOfOccurence.put(w, numOfOcc+1);
            }
        }
        return numOfOccurence;
    }
}
