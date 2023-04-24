package day20ArrayListsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
   /*
      1) String Class kullanmak tercih edilir cunku String Class method acisindan cok zengindir.
      2) List.of () kullanarak kisayoldan List olusturabilirsiniz ama;
         i) Bu List'lerin Elemanlari degistirilemez.
        ii) Bu List'lere yeni eleman eklenemez.
       iii) Bu List'lerden eleman silinemez.
    */
   // Example 1: Kullanıcının girdiği harf List'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    public static void main(String[] args) {
        //List<String> myList = List.of("A", "H", "J", "K", "M");
        //List.of() ile olusturulan list'ler degistirilemez(Immutable). Bu nedenle degistirilmesini istedigimiz
        //List'leri uzun yoldan olusturmaliyiz

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size = myList.size();

        Scanner input = new Scanner(System.in);
        int counter = 0;

        do {
            if(counter == size){
                System.out.println(myList);
                break;
            }
            System.out.println("Please enter a letter...");
            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {
                myList.set(myList.indexOf(letter), "Buldum!");
            } else {
                myList.add(letter);
            }
            counter++;

        }while(true);

    }//main
}
