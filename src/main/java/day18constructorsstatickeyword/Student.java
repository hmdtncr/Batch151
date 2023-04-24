package day18constructorsstatickeyword;

public class Student {
    /*
    1) "Static class member" lar (variable + method + constructor + code blocks) tüm object'ler tarafından paylaşılır.
    2) "Static class member" larda ki değişiklikler tüm object'ler tarafından otomatik olarak görülür.
    3) "Static class member" lar gükteki ay'ın dunyya ya baglı olduğu gibi class a baglıdırlar.
       Bu yüzden "Static variable" lara "class variable" de denir.
    4) "Static class member" ların nasıl çalıştıgını anlamak için çizin yapıp "static" olanları "cllassa" olmayanları "object" e bağlayarak dusunmek bu konuu kolaylaştırır.
    5) "Static class member" ları cağırmak için object olusturmak gerekmez ve tavsiye edilmez.
     */
    public static int numOfRegisteredStd = 0;
    public int num = 0;
    public Student() {
       numOfRegisteredStd++;
       num++;
    }
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(numOfRegisteredStd); //3
        System.out.println(s1.num); //1




    }//main
}//class
