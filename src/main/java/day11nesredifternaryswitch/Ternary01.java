package day11nesredifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
/*
Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdirinz

 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter two integers.....");
        int first = input.nextInt();
        int second = input.nextInt();

        //1. yol: use if else
         if(first<second){System.out.println(first);} else {System.out.println(second);}

         //2. yol: use ternary
        int result = first<second ? first : second;
        System.out.println(result);



    }//main
}//class
