package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //Kullanıcıdan adresini alınız ve ekrana yzadırınız
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen adresinizi giriniz....");
        //'next' methodu kullanıcıdan tek kelimeli Stringi almak için kullanılır
        //'next line' kullanıcıdan çok kelimeyi almak için kullanılır

        String address = input.nextLine();

        System.out.println(address);




    }


}
