package day_02_practice;

public class C04_SwitchCase {
    public static void main(String[] args) {
         /* Example 1:
     Bir restoranda, müşteriler menüden yemeklerini seçerler.
     Restoran, müşterilerin seçtiği yemeği pişirmek için bir
     program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
     secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
     belirlendigi bir program yaziniz
               hammburger 200, pizza 500,   tavuk 700
      */
        String yemek = "pizza";

        switch (yemek) {
            case "hamburger":
                System.out.println("Hamburger menusus 200 tl");
                break;
            case "pizza":
                System.out.println("Pizza menusu 500");
                break;
            case "tavuk":
                System.out.println("Tavuk menu");
                break;
            default:
                System.out.println("Lütfen menuden bir yemek seciniz.");
        }
           /* Example 2:
             Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralam ucretine gore
             Toplam odenecek fiyati gostern kodu yaziniz
             SUV ==>500.0
             SEDAN ==> 400.0
             HATCBACK ==> 350.0
             geriye kalanlar ==>300.0 TL
             double toplamUcret = kiralamaUcreti * kiralanacakGunsayısı;
            */
        String aracTuru = "SUV";
        int kiralanacakGunSayisi=5;
        double kiralamaUcreti;

        switch (aracTuru){
            case "SUV":
                kiralamaUcreti=500.0;
                break;
            case "SEDAN":
                kiralamaUcreti=400.0;
                break;
            case "HATCBACK":
                kiralamaUcreti=350.0;
                break;
            default:
                kiralamaUcreti=300.0;
                break;
        }
        double toplamUcret = kiralamaUcreti * kiralanacakGunSayisi;
        System.out.println("toplamUcret =" + toplamUcret);

        /* Example 3:
         Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
         Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
         gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
         istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
         onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
         kontrol eden bir program yaziniz
         (elephant,  lion ,giraffe  )
        default  ==> belirtile hayvan bulunamadi
 */


    }//main
}
