package day14Loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        // 3 den 8 e kadar tüm tam sayıları concola yazdıran kodu yazınız.

        //1. way:
        for (int i = 3; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2. way:
        int i = 3;
        while (i < 9) {
            System.out.print(i + " ");
            i++;
        }
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

        //1.Way:
        for(int k=21; k<181; k++){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }
        System.out.println();

            //2.way:



        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";
          int m=0;
          while (m<s.length()){
              String ch = s.substring(m,m+1);
              if(m%2==0){
                  System.out.print(ch.toUpperCase());
              }else{
                  System.out.print(ch);
              }
              m++; // bu kısmı unutmayın yoksa "sonsuz looop" olusur. applıcationnun donmasına sebep olur
          }
        System.out.println();
      //size verilen tam sayının rakamlarının toplamını consola yazdıran kodu yazınız.
        int r =578;
          int sum = 0;
          while (r>0){
              sum = sum + r%10;
              r=r/10;
          }
        System.out.println(sum);

          //kullanıcıdan aldığınız sayı için carpım tablosu oluşturan kodu yazınız
        //3x1=E 3x2=6 3x3=9 ...... 3x10=30
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number...");
        int n = input.nextInt();

        int u =1;
        while (u<11){
            System.out.println(n + "x" +u + "=" +(n*u));
            u++;
        }
       //kullsnıcıdan aldığınız String deki sessiz harfleri konsolo yazdırınız.
       //Alabama ==> lbm
        System.out.println("please enter a word....");
        String y = input.next();

        int z =0;
        while (z<y.length()){
            char ch = y.charAt(z);
            boolean x= ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
               if(!x){
                   System.out.print(ch);
            }
            z++;

        }




        }//main
    }
