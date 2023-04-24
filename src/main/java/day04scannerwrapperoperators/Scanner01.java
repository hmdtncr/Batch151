package day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
      //Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
      //rakamların toplamını yazdıran kodu yazınız.

      Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 5basamaklı bşr sayı giriniz..");
       int number = input.nextInt();
       //bir sayının son rakamını alabilmek için o sayıyı 10 a bölüp kalanı almalıyız.
        //%  ==> modulus oparator solunda bulunan sayının sagında bulunana sayıya bölümünden kalannı verir
        //dolayısıile %10 her zaman biz ebirler basamagında bulunan sayıyı verir.
        //bir tam sayıyı tam sayıya bölerseniz java sonucu tam sayı yapar.
        //java yuvarlama yapmaz ondalıklı kısmı iptal eder.
        //dolayısıyla bir tam sayıyı 10 abölersek birler basamağını silmiş oluruz.

        //son rakamı al
        int lastDigit = number%10;
        //sayı küçült
        number = number/10;

        //sondan ikinci rakamı al
        int lastSecondDigit = number %10;
        //sayı küçült
        number = number /10;

        //sondan üçüncü rakamı al
        int lastThirdDigit = number%10;
        //sayı küçült
        number = number/10;

        //sondan dördüncü rakamı al
        int lastFourtDigit =  number%10;
        //sayı küçült
        number = number/10;

        //sondan beşinci rakamı al
        int lastFifthDigit = number%10;
        //sayıyı küçült
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFifthDigit+lastFourtDigit);





    }

}
