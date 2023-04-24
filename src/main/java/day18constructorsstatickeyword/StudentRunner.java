package day18constructorsstatickeyword;
public class StudentRunner {
    public static void main(String[] args) {
   // Static olan "numOfRegisteredStd" variable ini cagırmak içi saddece class ismini kullandık, object oluşturmadık.
        System.out.println(Student.numOfRegisteredStd);

    // Static olmayan "num" variable ini cağırmak için object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num);

    // Stataic olan "numOfRegisteredStd" variable ina object userinden de ulaşabilirisniz ama bu hatadır.
        System.out.println(s1.numOfRegisteredStd);

    }//main
}
