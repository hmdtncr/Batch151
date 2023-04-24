package day34Exceptions;

public class E03 {
    public static void main(String[] args) {
        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars("Money"));
        System.out.println(getNumOfChars(""));

        System.out.println(getNumOfChars(null));
    }//main
    // Bir String'deki eleman sayisini veren method olusturunuz
    public static int getNumOfChars(String s){
        int result = 0;

        try{
            result = s.length();
        }catch(NullPointerException e){//"NullPointerException" String class'da "null" ile uyumlu olmayan method'lar kullanildiginda atilir.
            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//Java'nin Exception icin urettigi teknik mesaji varsa verir.
        }
        return result;
    }

}
