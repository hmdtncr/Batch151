package day18constructorsstatickeyword;

public class MethodOverLoading {
    /*
      1) Bir method aynı isism ve farklı parametreler ile oluşturulursa buna "Method Overloading" denir.
      2) "Method Overloading" Java da iyi organizasyon içindir.
      3) method overloading yaparken parametre 3 sekilde degistirilir
        * parametrelerin sayilari degistirilebilir
        *parametrelerin data type lerini degistirebilirsiniz(int i double yaptik asagida)
        * parametrelerin data type leri farkli ise yerleri degistirilir((double a, int b )( int a, double b )
      4) Method Overloding bir class ın icinde oluşur bu yuzden "private" methodlar da overload edılebilir.
     */
    public static void main(String[] args) {
    }//main
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a, int b){
        return a+b;
    }
    public static double add(int a, double b){
        return a+b;
    }
}
