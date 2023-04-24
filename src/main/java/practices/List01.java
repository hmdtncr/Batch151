package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
   /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
  */

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        for (int i=0 ; i<list.size(); i++){ //0 dan listin uzunluguna kadar donguye aldık

            if (list.get(i)>10){ //Listin i. indexindeki elemanı getirdik 10 dan büyük mü kontrol ettik
                list.set(i,list.get(i)*2); // buyukse i. indexteki elemanı 2 katyla set ettik
            }
        }
        System.out.println(list);
    }//main
}
