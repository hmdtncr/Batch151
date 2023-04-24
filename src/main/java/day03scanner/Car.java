package day03scanner;

public class Car {

    //Variable'lar oluşturalım
    public String model ="COROLLA" ;
    public int fiyat = 20000;

    //Method'lar oluşturalım
    // return type void olduğunda method içinde return keyword kullanılmaz
   public void hareket () {
       System.out.println("Corolla hızlı hareket eder...");
   }

   public void dur () {
       System.out.println("Corolla güvenli bir şekilde dururu");
   }

}
