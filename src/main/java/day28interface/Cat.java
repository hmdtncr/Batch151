package day28interface;

public class Cat implements Mammal {
    @Override
    public void drink() {
    }
    @Override
    public void eat() {
    }

    public static void main(String[] args) {
        //İnterface'lerde variable cagırırken "interface" adını kullanarak cağırın
        // Bu hem "staatic variable" olmanın gereğidir, hemde okunurluluğu arttırır.
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(age);
    }//main
}
