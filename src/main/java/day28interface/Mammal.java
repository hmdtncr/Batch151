package day28interface;
/*
  1) Class --> Class : extends
     İnterface --> İnterface : extends
     Class --> İnterface: implements
     İnterface --> Class : olamaz....
     Aynı ise "Extends" farklı ise "implement" kullan
     "İnterface" i Class'ın parentı yapma.

   Abstract Class ile İnterface arasındaki farklar
    1) Abstract Classlar hem "Abstract" hem "Concrete" methodlar içerebilir fakat İnterface'ler sadece "Abstract" method içerir.
       Ama İnterface'lerde istersek "default" ve "static" keywordlerini kullanark "concrete" method uretebiliriz.
   *2) Abstract Class'lar multuple inheritance'i desteklemez ama interface'ler destekler.
    3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final olmak zorundadir.
  * 4)"interface" Class'in child'i olamaz ama "abstract class" class'in child'i olabilir.
    5) Abstract class'lar da constructer vardir ama object uretemez, interface'lerde constructer yoktur bu yuzden object uretemez
 */
public interface Mammal extends Animal {
    String feedBaby = "Milk";
    int age =6;
}
