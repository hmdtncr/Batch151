package day03scanner;

public class Runner {

    public static void main(String[] args) {
        //Object nasıl oluşturulur
        //Class ismi +  object ismi + atama op. +"new" + Constructar
               Car         myCar        =         new       Car();
        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

    Student tomHanks = new Student();
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.adsress = " + tomHanks.adsress);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        tomHanks.feed();
        tomHanks.study();

        //Sepete koyarsak aşağıdaki gibi oluyor.
        byte grade = tomHanks.grade;
        System.out.println("grade = " + grade);

    }
}
