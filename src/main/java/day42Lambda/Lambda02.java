package day42Lambda;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(6,10)); // 40
        System.out.println(getMultipiclationInTheGivenRange(7,10));

    }//main
    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz
    public static int getSumInTheGivenRange( int starting, int ending){
       return IntStream.rangeClosed(starting, ending).sum();
    }
    // Example :2  7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.
    public static int getMultipiclationInTheGivenRange(int starting, int ending){
        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();
    }
}
