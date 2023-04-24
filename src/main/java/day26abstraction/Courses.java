package day26abstraction;
// Body'si olmayan method'a "abstract" method deniliyor.
/*
  1) Bazen "parent class" daki methodun body'si hiçbir child class tarafından kullanılmaz.
     Bu durumda parent'taki methoda body yazmak hiç kullanılmadığı için mantıklı değildir.
     Bizde o method a body yazmayız.
  2) Body'si yazılmayan methoda "abstract mwthod" denilir.
     Abstract inglizcede vucutsuz veya soyut anlamındadır.
  3) Methodun body'sini yazmayınca Java hata verir, bizde "abstract" keyword'ünü kullanarak Javaya bu methodun bodysi olmayacak deriz.
  4) Abstrat keyword'ünü kullanınca elde ettiğimiz abstract method normal classlara konulamaz, oyuzden classs'ı da "abstract" yaparız.
  5) Parent'taki method abstract ise bütün child classlar methodu overrride etmek zorundadır.
     Bu yuzden tüm childlar için mecburi olmasını istediğimiz fonksiyonları abstract yapmak mantıklı bir seçimdir.
  6) Body'si olam methodlar abstract classların içine yazılabilir.
     Body'si olan methodlara (Concrete Method) denir. Ama abstract methodlar concrete class'ların içine yazılamazlar.
  7) Abstract keyword varsa body'si olamaz. Body'si varsa abstract olamaz.
  8) Abstract classlardan obje uretilemez. ve bodysi olmadığı için eksik method da denilebilir.
       Abstract classların içinde abstract methodlar olur abstract methodlar bodysi olmadıgı için eksik methodlar olarak düşünülebiir
      Yani abstract class içinde eksik bir yapı barındırır siz abstract classdan obje üretirseniz abstract classın eksikliği objeye yansır
      Java bunu istemez çünkü eksik obje eksik iş yapar.
      Yanlış çalışmasına sebep olur
      Java aplicationu korumak için abstract classlardan obje üretilmesini engellemiştir
  9) "Abstract Class" ların constructor !ı vardır ama object oluşturamazlar.
 */
   /*
     "Final Keywordu" acıklar msıısnız?
     "final keyword"   i) variable'larda   ii) methodlarda   iii) classlarda kullanılır

     i) variable'larda kullanıldığında  a) o variable akesinlikle değer ataması yapılmalıdır.
                                        b) ilk atanan değer değiştirilemez.

      ii) methodlarda kullanıldığında   a) o methodun bodysi değiştirilemez
                                        b) method override edilemez.

      iii) classlarda kullanılır   A- O class'in child class'i olamaz. Ama final class'in kendigis child olabilir.

 10)
    */
public abstract class Courses {
    public abstract void math();
    public void art(){
        System.out.println("Learn art.");
    }

}
