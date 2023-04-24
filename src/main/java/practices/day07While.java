package practices;

import java.util.Scanner;

public class day07While {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
       // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz..");
        int rakam = scan.nextInt();

        int num = 1;
        int faktoryel = 1;
        while (num<=rakam){
           faktoryel = faktoryel*num;
           num++;
        }
        System.out.println(rakam+ " !=" + faktoryel);
    }
}
