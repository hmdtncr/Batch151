package day24inheritancepolymorphism;

public class Volvo extends Car{
    public void secure(){
        System.out.println("Volvo is the most secure car in teh world...");
    }
    @Override // Bu bir "annotation" dır. @Override annotation'u Override kurallarını kontrol eder
    public void move() {
        System.out.println("Volvo moves...");
    }
}
