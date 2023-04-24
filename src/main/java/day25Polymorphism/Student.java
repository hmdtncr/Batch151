package day25Polymorphism;

public class Student {
    public String stdName = "Tom Hanks";
    public int age = 23;
    // Encapsulation nedir? Data saklamaktir.(Data hiding)
    //Datayi nasil saklarsin? Access Modifier'ini "private" yaparak.
    //  i) get mothodları hep "public" olur.
    //  ii) get methodun "return type"i okuduğu variable in return type i ile aynı
    //  iii) get mothod bir boolean variable için oluşturulduysa ismi "is" ile başlar
    //  "get"ve "set" methodlari class'a dokunmaz objeleri degistirir
  private   String stdId = "AC2023102T";
  private double gpa = 3.87;
  private boolean successful = false;
  //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
  //Nasil okuruz ? "get method" olusturarak Encapsulation edilmis data'nin degerini okuyabiliriz
    public String getStdId() {
        return stdId;
    }
    public double getGpa() {
        return gpa;
    }
    // Encapsulation yapılan variable in type i boolean ise get method ismi "is" ile başlar.
    public boolean isSuccessful() {
        return successful;
    }
    //Encapsulation yaptigimiz data'yi istersek diger class'lardan  nasil degistirebiliriz?
    //Nasil degistirebiliriz?//"set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz
    //i)set method'lar hep "public" olur.ii)set method'un "return type"i hep void olur.
    //iii)set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    // set method kullanarak var olan object uzerinde degisiklikler yaparak o objeyi yeni bir objeymis gibi kullanabiliriz
    // NOTE::
    public void setGpa(double gpa){
        this.gpa =gpa;
    }
    public void setSuccessful(boolean successful){
        this.successful = successful;
    }
}
