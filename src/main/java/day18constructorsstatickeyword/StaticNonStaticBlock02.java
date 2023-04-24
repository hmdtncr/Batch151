package day18constructorsstatickeyword;

public class StaticNonStaticBlock02 {
    public StaticNonStaticBlock02(){
        System.out.println("Constructor 1");
    }
    public StaticNonStaticBlock02(int price){
        System.out.println("Constructor 1");
    }
    public StaticNonStaticBlock02(String name){
        System.out.println("Constructor 1");
    }
    public StaticNonStaticBlock02(boolean isOLd){
        System.out.println("Constructor 1");
    }
    { // non static block constructorlar da calıştırılması gereeken ortak kodları içerir.
      // non static block içine yazılan kodlar her constructor için çalışır.
      // birden fazla non-static block varsa ustteki önce calıştırılır.
        System.out.println("I am constructor");
    }

    public static void main(String[] args) {
        StaticNonStaticBlock02 obj1 = new StaticNonStaticBlock02();
        StaticNonStaticBlock02 obj2 = new StaticNonStaticBlock02(12);
        StaticNonStaticBlock02 obj3 = new StaticNonStaticBlock02("Shirt");
        StaticNonStaticBlock02 obj4 = new StaticNonStaticBlock02(false);
    }//main

}//class
