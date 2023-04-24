package day21DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-03-16T22:03:39.997088300 (ortasındaki "T" tarihten sonra time baslıyor demek.

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formatedLdt = dtf1.format(ldt);
        System.out.println(formatedLdt); // 3/16/2023 - 10:08 ÖS






    }//main
}
