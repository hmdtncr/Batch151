package practices;

import java.util.ArrayList;
import java.util.List;

public class Lambda01Practice {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)


    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
     public static void elemanlariYazdir2(List<Integer> nums) {
         nums.stream().forEach(t -> System.out.println(t + " "));
     }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
     public static void ciftElYazdir(List<Integer> nums){
        for (Integer w : nums){

        }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz


    //9)Liste ogelerinden max degeri veren bir method olusturunuz


    //10)Liste ogelerinden minumum degeri veren method olusturunuz






}
}
