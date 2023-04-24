package day21DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        // Anlık zamanı nasıl alırız?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //21:04:42.791048900

        // Anlık zamanda bileşenler nasıl alınır?
       int hour = myCurrentTime.getHour();
        System.out.println(hour); // 21

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);  // 8

        int second = myCurrentTime.getSecond();
        System.out.println(second); // 4

       int nano = myCurrentTime.getNano();
        System.out.println(nano);  // 965023100

        // Gelecek ve Geçmiş zamana nasıl gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);  // 21:35:17.528394800

        // Zaman formatı nasıl değiştirilir?
        // Büyük "HH" 24'lük saat sistemin, küçük "hh" 1'lik saat sistemini gösterir
        // "hh.mm a" ifadesindeki boşluk " a" 12'lik saat sisteminde "AM" , "PM" yazılmasını saglar
        // "ss" saniyeyi gösterir
        // "mm" "minute" demektir. ""MM" "month" demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime); // 21.20

        // Date formatı nasıl değiştirilir?
        LocalDate myCurrentDate = LocalDate.of(2022, 8, 25);
        System.out.println(myCurrentDate); // 2022-08-25

        // Tarihi Ay/Gün/Yıl sekline ceviriniz.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate); // 08/25/2022

        // Tarihi Gün/Ay isminin ilk 3 harfi/Yıl seklinde ceviriniz.  25/Aug/2022
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        // Tarihi Gün/Ayın ismini tamamı cekline ceviriniz.
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3); // 25/Ağustos/2022

        //Baska bir zaman dilimindeki tarih ve zamanı nasıl alırız?

        // Tokyo'da ayın kaçı?
       LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); //2023-03-17

        // Taskent'te ayın kaçı?
        LocalDate dateInTaskent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTaskent); // 2023-03-16

        // Tokyo'da saat kaç?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo); //03:47:49.255722200


        //Berlin'de saat kaç?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin); //19:50:26.576662200







    }//main
}
