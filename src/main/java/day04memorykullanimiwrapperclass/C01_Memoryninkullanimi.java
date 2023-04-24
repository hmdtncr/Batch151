package day04memorykullanimiwrapperclass;

public class C01_Memoryninkullanimi {

    /* Jvanın ürrettiği ve kullandığı herşeye JAVA denir.
    Javada 2tip hafıza var,
    1) STACK MEMORY  (small memeory)
      primitive data typlarını ve non-primitive data typelarının referanslarını (adreslerini) barındırır.

    2) HEAP MEMORY (Huge memory)
      non*primitive data typlarını barındırıyor.

      Java da Heap memory'de oluşturulan tüm datalar için bir referans (adres) bilgisi oluşturulur.
   Referans bilgileri stack memory de yer alır.

   Herhangi bir sebeple Heap Memorydeki datanin referance'silinirse "Garbage Collector " Memory'i temizler.

 Javada sonucta bir urundur.
    Oracle firmasinin bir urunudur.Developerlar sadece data
    barindiran primitve data typelarinin non primitive ler gibi
    method 'da barindirmasini istemislerdir.Bunu uzerine Java
    primitive data type'larina method ekleyerek; ozel bir class olusturmustur.
    Bunada wrapper(sarmalamak,durum) class denir.


        Primitive               Non-Primitive
         byte         ==>          Byte
         short        ==>          Short
         int          ==>          Integer  *****
         long         ==>          Long
         float        ==>          Float
         double       ==>          Double
         boolean      ==>          Boolean
         char         ==>          Character  *****

     */

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        //byte data typenin en büyük ve en küçük değerini ekrana yazdırın.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMin+ intMax =" + (intMax + byteMin));


        //**************** Primtive Data Type'larini Wrapper Classlara Nasil Ceviririz ****************
      float primitiveFloat = 12.33f;
      Float wrapperFloat = primitiveFloat; //Autoboxing denir Java otomatik yaapr.

      //******Wrapperclaslari Primitive data typlarina cevirme*****
      Character wrapperChar = 'a';
      char primitiveChar = wrapperChar; // Unboxing

        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1+str2);
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));

        // valueOf() ==> String bir datayi Integer'a donusturur

        /*
        Javada "+" sembolu iki int icin atematikteki gibi toplama islemi yapar
        iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
        Buna "Concatination" denir
        Java metematik bilir islem onceligine gore calisir
          i)Uslu Sayilar
          ii)Parantez ici
          iii)carpma/bolme
          iv) toplama/cikarma

         */

        String harf = "A";
        int sayı = 7;
        //harf + sayı ==> A7

        /*  8+3+"K"  yani 11K oluyor buna conconat oluyor

        "K"+3*5/2;
         */

        String a ="K";
        int b=3, c=5, d=2;
        System.out.println(a+b*c/d);

    }//main
}//class
