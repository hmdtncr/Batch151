package day14Loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
       //while-loop
        int i=1;
        while (i < 1) { //while loop da loop bodysinin hiç calışmaması mümkündür.
            System.out.println( "while loop");
            i++;
        }
   //do-while-loop
        int k=1;
        do{
            System.out.println("do-while-loop");
            k++;
        }while (k<1);

        //kullanıcı bir sayı girsin, sayı 100 den küçük ise kullanıcı 'kazandınız' mesajı alsın
        //diğer durumlarda 'kaybettiniz' mesajı alsın

        Scanner input = new Scanner(System.in);

        do{ //do-while-loop da loop bodysi en az bir kere çalışıs
            System.out.println("please enter a intger");
            int n= input.nextInt();

            if(n<100){
                System.out.println("won!.");
            }else{
                System.out.println("lost!.");
                break;
            }
        }while(true);

        //kullanıcıdan alınan bircumlenın büyük harfle başlayıp nokta ile bittiğini kontrol eden kodu yazınız.
        //cümle doğruysa dogru desin,
        do{
            System.out.println("please enter a word");
            String s =input.next();


            if(s.endsWith(".")&& (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("your sentence is corret grammatically");
            }else{
                System.out.println("your sentence has grammatical mistake");
                break;
            }
        }while(true);




    }//main
}
