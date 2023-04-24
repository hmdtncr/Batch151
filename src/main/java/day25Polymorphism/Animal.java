package day25Polymorphism;

public class Animal {
    /*
   1)Parent'taki method ile Child'da Override edilen method'un access modifier'lari ayni olabilir.
   2)Child'da Override edilen method'un access modifier'i Parent'taki method'un access modifier'indan dar olamaz.
   3)Parent'taki method'un access modifier'i Child'da Override edilen method'un access modifier'indan dar olabilir.
   4) Method' un return type' i "primitive" ise Overrriding yapildiginda return type degistirilemez.
   5) Method' un return type' i "void" ise Overrriding yapildiginda return type degistirilemez.
   6) Child'da Override edilen method'un "return type" ile Parent'daki methodun "return type"i arasında "IS_A" ilişkisi
      varsa "return type" değiştirilebilir.Aksi takdirde değiştirilemez.
    Mesela; Integer Wrapper Class iile Long Wrapper Class arasında "IS_A" ilikisi yoktur.
       o yuzden return type Integer oldugunda Long'a degistirilemez.
   7) Return Type Wrapper Class oldugunda, Overriding yaparken "return type" degistirilemez.
   8)"final method"lar Override edilemezler.
      "final method"larin body'si degistirilemez ama Override ederken method body'i degistiririz bu bir celiskdir.
      Bu yuzden Java "final method"larin Override edilmesine musaade etmez.
   9) "static method" lar Override edilemezler. Cunku "static method"lar tum child'lar icin ortak method'lardir
      Bir child'in ortak method'u degistirdiginde diger Child'lar bundan etkilenir. Bu etkilenme ummadik sonuclar ortaya cikarabilir.
      Bu yuzden Java "static method"larin Override edilmesine musaade etmez.
  10) "private mothod" lar Override edilemez.
     */
    public void move(){
        System.out.println("Animal move...");
    }
    protected int add(int a, int b){
        return a+b;
    }
    public Animal create(){
        return new Animal();
    }
    public Integer multiply(Integer a, Integer b ){
        return a*b;
    }
    public final double circleArea(double r){
        return 3.14*r*r;
    }
}
