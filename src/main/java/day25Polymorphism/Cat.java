package day25Polymorphism;

public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("Cats move...");
    }

    @Override
    protected int add(int a, int b) {
        return a+b+1;
    }
   //From child to parent = is a
   //From parent to child = has a
    @Override
    public Cat create() {
        return new Cat();
    }
    public Integer multiply(Integer a,Integer b){
        return  2*a*b;
    }

}
