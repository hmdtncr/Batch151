package day18constructorsstatickeyword;

import java.time.LocalDate;

/*
     1) "Stataic Block" lar "static variable" lara 'ilk değerlerini atamak' (initialize) için kullanılır.
     2) static bir variable a deger atamak i.in kod yazmanız gerekirse "static block" kullanınız.
     3) staatic b,r variable a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama static block icine
           yazilan kod main method icine yazilandan once calistirilir.
     4) bir classda birden fazla static block varsa ustteki once calistirilir
   */
public class StaticNonStaticBlocks01 {

    //"Static variable" lar "Static Black" kullanılmadan da "initialize" edilebilirler.
    public static double pi = 3.14;
      //"Static variable" lar "Static Black" kullanılarak da "initialize" edilebilirler.
    // Asağıdaki gibi static bir variable a deger atamak i.in kod yazmanız gerekirse "static block" kullanınız.
    public static double price;
    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }

    static{
        System.out.println("Hey I am a static block 2");
    }

    static{
        System.out.println("Hey I am a static block 1");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==3){
            price = 1000;
        }else{
            price = 1200;
        }
    }
}
