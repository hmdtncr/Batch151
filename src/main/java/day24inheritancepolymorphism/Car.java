package day24inheritancepolymorphism;

public class Car {
    // Ortak methodlar Parant'a konuldugu gibi ortak Variable'lar da parent'a eklenebilir
   // Super(): her constructor'ın ilk satırında bulunur. ve bizi parenttaki constructor'a taşır.

    /*
    1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
       asagiya(Child) dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      Isterseniz gorunur sekilde de yazabilirsiniz
    4) super () sizi parent class'daki constructor'a tasir.
    5) this () sizi aynı class içindeki constructor'lar arasında gezdirir.
    6) "this" içinde bulunduğunuz variableleri çağırmay yarar..
       "super" parent class'da ki variableleri çağırmaya yarar.
      parent'tan chil'a giderken HAS-A iliskisi vardir
    7)   Eger data type’lari arasinda IS-A ve HAS-A iliskisi varsa bu data type’lerine “COVARIANT” denir.
     */

    /*
    1) Polymorphism ==> Çoklu Şekil
       Yani bir meyhodun farklı şekillerde karşımıza çıkması
       Polymorphism (2 bölümden oluşur) = Overloading + Overriding
    2) Overriding parent class'daki methodu child class'ın ihtiyacına göre özelleştirerek kullanmka demektir
    3) Overriding de methodun body'si değiştirilir (Overloding de parametresini değiştiriyorduk)
    4)Overriding'de method signature'a dokunulmaz. Dokunursaniz Java kizar.
     */
    public void move(){
        System.out.println("Cars move...");
    }
    public void getBreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }
    public String model = "Car";
    public int price = 0;

    public Car(){
        System.out.println("Car Cobstructor 1");
    }
    public Car(int i){
        System.out.println("Car Cobstructor 2");
    }
}
