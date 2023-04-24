package day27interface;
/*
              INTERFACE'NIN İÇİNDEKİ METHODLAR
  1) "İnterface" içine "concrete method" kullanılamaz.
  2) "İnterface" içineki methodların abstract olduğunuz Java bilir,
      bu yuzden "İnterface" içindeki "abstract methodlarda" abstract keyword kullanmaya gerek yoktur.
  3) "İnterface" içindeki abstract methodların tamamamı "public"dir.
      Bu yuzden "interface" içinde abstract method oluştururken "access modifier" azmaya gerek yoktur.
  4) Bir "interface" i bir class ın parenti yapmak istediğinizde" "extends" keyword yerine "implements" keyword kullanınız.
  5) "Concrate child" classlar "parent interface" deki abstract methodları Override etmek zorundadırlar.
  6) "interface" ler bir applicationda "Concrete Child Class" ların yapmak zorunda oldukları
      fonksiyonları barındırırlar.
        Bu yuzden "interface" "to-do list" de denir.
  7) Birden fazla "parent" "İnterface" içinde aynı iaimli abstract method oluşturabilirsiniz.
    Abstract methodların body'si olmadıgı için child classlar aynı isimli methodlardan herhangi birini override ederek kullanabilirler.
  8) Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda bu
     method'larin "return type"lari ayni olmak zorundadir.
  9) "interface" içine "concrete method" konuamaz, ama bazı ozel durumlarda "concrete method"
     koymamız gerekirse "default" keyword'unu aşağıdaki gibi kullanaraka interface icine concrete method koyabiliriz.
       i) "default" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
       koyabiliriz. default void ceo () { System.out.println("Uses gas less...");}
  10) "default" veya "static" keyword'unu olusturdugunuz concrete methodla'in "concrete child class" lar tarafindan
      kullanilma zorunlulugu yoktur.
 11)"default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
     ulasilabilir.
     "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
     olusturmaya gerke yoktur, "interface" ismi yeterlidir.
  12) "interface" lerden "object" olusturulamaz. "interface" lerin "constuructor" i yoktur.
 */
public interface Engine {

    void start();
    void payment();
    default void eco(){
        System.out.println("Uses gas less...");
    }
    static void stop(){
        System.out.println("Stops securely...");
    }
}
