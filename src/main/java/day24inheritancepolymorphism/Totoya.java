package day24inheritancepolymorphism;

public class Totoya extends Car {
    public void hybrid(){
        System.out.println("Toyota uses hybrid engine...");
    }
    public Totoya(){
        System.out.println("Toyota Constructor 1");
    }
    public Totoya(String s){
        super (5);
        System.out.println("Toyota Constructor 2");
    }
}
