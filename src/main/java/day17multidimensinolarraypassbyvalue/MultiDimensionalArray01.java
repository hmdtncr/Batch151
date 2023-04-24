package day17multidimensinolarraypassbyvalue;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
/*
   1) Bir Arrayin elemanları da Array olursa bu tarz arraylere "Multidimensional Array" denir.
 */
      //"Multidimensional Array" nasıl olusturulur?
        String names [][] = new  String[3][2];

      names [1][0] = "P";
      names [2][1] = "Z";
      names [0][0] = "A";
      names [0][1] = "K";
      names [1][1] = "M";
      names [2][0] = "C";

      //Multidimensional Array"leri console'a yazdirmak icin "toString()"method'u degil "deepToString()"methodunu kullaniniz.
        System.out.println(Arrays.deepToString(names)); //[[A, K], [P, M], [C, Z]]

        //Multidimensional Array içinden specific bir eleman nasıl yazdırılır.
        System.out.println(names[1][1]);//M

        //Multidimensional Array içindeki bir arrayı yazdırmak
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P,M]

        //Kısa yoldan Multidimensiınal Array nasıl oluşturulur*
        String students[][] = { {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"},{"Ceyhan", "Kayahan"}};

       //Example 1: Yukarıdak Students Arrayınde toplam kaç isim olduğunu bulunuz.
        int sum =0;

        for(String [] w : students){
            sum = sum + w.length;
        }
        System.out.println(sum);

     // Example 2: Yukarıdaki students arrayın içinde "m" olan isimleri console yazdırınz.
        for(String[] w : students){
            for(String k: w){
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }
      //EXample 3: Bir integer multidimantions array oluşturunuz,tüm elemanların çarpımını hesaplayınız.
        int nums[][] = { {5,4}, {2,3,3}, {7}};
        int result = 1;

        for (int[] w : nums){
            for (int k : w){
                result = result*k;
            }
        }
        System.out.println(result);
       //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e cevirniz
        int numbers[][] = { {5, 4}, {2, 3, 2}, {7}}; // ==>{5, 4, 2, 3, 2, 7}

        //1.Step:İki boyutlu array de kac eleman oldugunu bulan kodu yazmalıyız
        //int toplamElemanSayısı = 0;
      int toplamElemanSayisi = 0;
      for( int[] w : numbers){
          toplamElemanSayisi = toplamElemanSayisi + w.length;
      }
      //2.Step: Tek boyutlu array ı iki boyutlu array ın eleman sayısını kullanarak olusturmalıyız
        int newArr[] = new int[toplamElemanSayisi];

      //3.Step: Ikı boyutlu array deki elemanları tek boyutlu array e transfer etmeliyim
        int idx =0;

        for(int[] w : numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2, 7]

     // Example 5: Bir integer multidimentional array'daki en küçük ve en büyük elemanın toplamını bulunuz.
        int ages [][] = { {15, 4}, {12, 43, 21}, {7}};

        int small = ages[0][0];

        for(int[] w : ages){
            for(int k : w){
                small = Math.min(small, k);
            }
        }
        System.out.println(small);



    }//main
}
