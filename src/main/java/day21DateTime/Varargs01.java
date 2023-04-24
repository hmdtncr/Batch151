package day21DateTime;
public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add(5,2,4,3));
        getInitials("Ali Can" , "Kemal Han" , "Tuncay Cinar" , "Ibrahim Catal");





    }//main
    // Example 1: Toplama işlemi yapan bir method oluştur.

    // Asagıdaki gibi farklı methodlar oluşturarak is yapamayız.
    // Çünkü kullanıcı farklı sayıdaki sayıları toplamak isteyebilir, her ihtimal için bir mrthod oluşturmak mumkun değildir.
   /* public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add (int a, int b, int c, int d){
        return a+b+c+d;
    }

    */
    // Java farklı sayıdaki parametrelerin hepsini kabul eden bir yapı oluşturdu.
    // Bu yapıya Varargs denir.
    // Varargs' lar arkada "Array" yapısını kullanır.

    /*
    1)Bir method parantezinde bir'den fazla "Varargs" kullanilamaz.
    2)Bir method parantezinde bir'den fazla parametre kullanilacaksa "Varargs" en sonda olmalidir.
 */
    public static int add(int... a){ // bu yapıya Varargs denir
        int sum = 0;
        for (int w : a){
            sum = sum + w;
        }
        return sum;
    }
    // Example 2: Verilen isimlerin ilk harflerini colcole'a yazdıran methodu oluşturunuz.
    // Ali Can ==> AC                        Kemal Han ==> KH

    public static void  getInitials(String... s){
        String  initials = "";
        for(String w : s){
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }

    }

}//class
