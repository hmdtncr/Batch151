package day34Exceptions;

public class E01 {
    /*
      1)"Exception" beklenmedik problem demektir
      2)"Exception"i hallebilmek icin iki temel yol vardir
         i)"Exception"a uygun cozumler uretebilirsiniz "Exception Handling" denir
        ii)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz.  Buna da "Throw Exception" denir.
      3) Exception'a uygun cozumler uretmede "try-catch" kullanilir.
           "try block"da yapilmasi gereken islemi Java'dan yapmasi istenir.
        Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
      4) "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
   // Method'lar aksiyon olabilmesi icin eylem seklinde olmali
 */
    public static void main(String[] args) {

        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));

    }

    //1.Way: Exception'i handle etmede ilk yol
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b){
        int result = 0;

        try{
            result = a/b;
            System.out.println("I am here");
        }catch(ArithmeticException e){ // "ArithmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("There is an issue in division");
        }
        return result;
    }

}
