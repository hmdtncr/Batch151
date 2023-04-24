package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        // "Pwd12?Ab" ==> P12?A
        String s ="Pwd12?Ab";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a'&& ch<='z'){
                continue;
            }else{
                System.out.print(ch);
            }
        }
//break ile loop un farki break loop u kirar continue sizi tekrar koda atar
// break switch statement da ya da loop da kullaniriz
//switchde break bellidurumlarda kodu durdurmak icin kullaniriz
//case 1 biit is yapmak istemezsek break yazariz
//looplar da break loop u kirmak icin kullanriiz
//continue ise loop yaparken bazi elemanlar isleme sokmama da kullaniliri. mesele yukari ornekte kucuk harf kullanmak istemiyoruz
// kucuk harfleri isleme sokmamak icin continue
        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.
        System.out.println();

        //Bir String'i tersten çeviren kodu yazdırınız
        //"Java" ==> "avaJ"
        String t = "Java";
        String ters = "";

        for(int i=t.length()-1; i>=0; i--) {

            ters = ters + t.substring(i, i+1);

            }
           System.out.println(ters);

        //2.Way:
        String u = "Java";
        String ters2 = "";

        for(int i=u.length()-1; i>=0;i--){
            ters2 = ters2 + u.substring(i);
        }
        System.out.println(ters2);

        //Bir tamsayının rakamlarının toplamını veren kodu yazınız
        // 578 ==> 5+7+8 = 20
        int sum = 0;
        for(int i=578; i>0; i=i/10){
            sum = sum + i%10;
        }
        System.out.println(sum);
    }//main
}
