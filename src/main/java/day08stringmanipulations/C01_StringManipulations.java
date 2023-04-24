package day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //******************** replaceFrist () *****************************
        /*
              replaceFirst () : replace ile aynı işi yapmakla birlikte 
               ilk gördüğü datayı değiştirir.
      */

        String str = "Bizimle Java Ogrenmek Cok Kolay";

        //ex: 
        String str1 =  str.replaceFirst("i","e");
        System.out.println("str1 = " + str1);

        String str2 = str.replace("i","e");
        System.out.println("str2 = " + str2);
     
        
        String str3 = str.replaceAll("i","e");
        System.out.println("str3 = " + str3);

        // ********************** trim *****************//
        /* trim ()  Bir String'de bastaki ve
        sondaki space karakterlerini siler .
        Ortadaki space karakterlerine dokunmaz
     */
        // ex:isim String'indeki varsa bas ve sondaki space'leri siliniz
        String isim = "Mehmet Fatih Yildirim";
        System.out.print("*************************");
        System.out.print(isim);
        System.out.print("***************************");
        String trimIsim = isim.trim();
        System.out.print("trimIsim = " + trimIsim);
        System.out.print("******************************");


    }//main
}//class
