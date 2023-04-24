package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //kullanıcının coklu data'yi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.
   /*
   1)Kullanıcıdan data almak için Scanner object oluştur
   2)Coklu datayı yerleştirmek için bir array oluşturmalıyım
   3)Array oluşturabilmek için kullanıcıdan array e kaç tane eleman koyacagını almalıyım
   4)Loop oluşturup eleman ekleme islemini tekrar tekrar yapabilmeliyim
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];

        for(int i=0; i<stdNames.length; i++){
            System.out.println("Enter the" + (i*1) + ". student name");
            System.out.println("To stop adding press 'q'");
            String name = input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));



    }//main
}
