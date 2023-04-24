package day07stringmanipulations;

public class C02_StringMnipulations {

    public static void main(String[] args) {

           // ****************** replaceALL () ************** //
        // Bir grup datayı değiştirmel için kullanılır
        // Bir grup data: Regular Expression (Regex) kullanılır
       /* En Cok Kullanilan Regexler:
        1) Tum Rakamlar ==> [0-9]
        2) Tum Kucuk Harfler ==> [a-z]
        3) Tum Buyuk Harfler ==> [A-Z]
        4) Tum Harfler ==> [a-zA-Z]
        5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
        6) Tum Sesli Harfler ==> [aeiouAEIOU]
        7) Tum Noktalama Isaretleri ==> \\p{Punct}
 
 
    Tüm harfler, Tüm rakamalr vs HARİCİNDE demek için şapka işareti kullanılıyor ^ 
        */
        
        String s = "Mehmet 20 yasında QA_Developer kursunda $ dolar kazanmıstır ...";

       String s1 = s.replaceAll("[0-9]", "*");
        System.out.println("s1 = " + s1);
        
        String s2 = s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println("s2 = " + s2);

        //Ex : s String'indeki  ki tum spaceler disindeki karakterleri  "*" ceviriniz.
        String s3 = s.replaceAll("[^ ]", "+");
        System.out.println("s3 = " + s3);



      String s4 = s.replaceAll("[^a-z]","*");
        System.out.println("s4 = " + s4);

        String s5 = s.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println("s5 = " + s5);




    }//main

}//class
