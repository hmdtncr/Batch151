package day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s = "Lear Java earn money";


        //Ex: s String "money" ile bitip bitmediğini kontrol ediniz

       boolean isend =  s.endsWith("money");
        System.out.println("isend = " + isend);
        // *****************  endWith **************************//
        /* endWith () metinin belirli bir datayla bititp bitmediğini bize verir
        True yada False şeklinde boolean bir değer dondurur.
         Icerisine tek karakterde coklu karakterde koyabilirsiniz
    
        //Ex : s String'inin "money" ile bitip bitmedigini kontrol ediniz


         */
       String s2 = "Learn money Java earn";
       boolean iceriyorMu = s2.contains("money");
        System.out.println("iceriyorMu = " + iceriyorMu);

        /*
       contains methodu cümlenin herhangi bir yerinde istenilen datayı bulursa True döndürür.
       ancak task ın bizden istediği money "k"elimesiyle bitip bitmediği olduğu için endWith () methodu kullanmalıyız
         */
       
        // ***********************  replae () ***************************//

        // Ex : s String'indeki "money" kelimesini "dollar" kelimesiyle yer degistirelim
       String s1 = s.replace("money","dollar");
        System.out.println("s1 = " + s1);

        String b1 = s.replace("earn","win");
        System.out.println("b1 = " + b1);

        String s4 = s.replace('a','*'); // bu daha uygundur
        String s5 = s.replace("a","*");
       // String s6 = s.replace('a','*');
        System.out.println("s4 = " + s4);
        
        
       String s6 = s.replace("L","***");
        System.out.println("s7 = " + s6);
        
        String s7 = s.replace("e"," ");
        System.out.println("s8 = " + s7);

        String s8 = s.replace("earn","");
        System.out.println("s8 = " + s8); //Doğru olan bu s8 = Lear Java  money
        
        String t = "Dolma Kalem";
        String t1 = t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);



    }//main
}//class
