package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayı alıp 4 işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran kodu yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki sayı girini...");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);


    }


}
