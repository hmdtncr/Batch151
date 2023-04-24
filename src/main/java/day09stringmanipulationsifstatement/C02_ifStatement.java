package day09stringmanipulationsifstatement;

public class C02_ifStatement {
    public static void main(String[] args) {

          // INTERWIEW QUESTIONS USA QA

        //Bir Stringdeki tekrarsız karakterleri ekrana yazdırınız
        //  String y = "abbccdc"

        String y = "aac"; // soru çözümü uzamasın diye kısa aldık soruyu
        char ch = y.charAt(0);
        if (y.indexOf(ch) == y.lastIndexOf(ch)) {
            System.out.println(ch);

        }//if body iki curly braces arası

       char ch1 = y.charAt(1);
       if (y.indexOf(ch1)== y.lastIndexOf(ch1)){
           System.out.println(ch1);

       }//if body

        char ch2 = y.charAt(2);
       if(y.indexOf(ch2)== y.lastIndexOf(ch2)) {
           System.out.println(ch2);

       }//if body

        // Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif " yazdiran kodu yaziniz4
        int num = 65;
       if (num > 0) {

           System.out.println("Sayi Pozitif");
       }//if body

        // Ex : Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz
        int rakam = 13;
        //Rakamlar 0 1 2 3 4 5 6 7 8 9

        if (rakam>-1 && rakam<10){
            System.out.println("Verilen data rakamdır");
        }// if body

        System.out.println("*********** **************");

      // Ex : Sayi 3 basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yaziniz

        int sayi = -100; // ekrana "Verilen Data 3 Basamaklidir"



    }//main
}//class
