package day04scannerwrapperoperators;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive     : char    -   boolean - byte - short - int     - long - float - double
        //Wrapper Class :Character -  Boolean - Byte - Short - Integer - Long - Float - Double

        //Wrapper Class'lar non-primitive'dir. o yuzden memory'de cok yer kaplarlar
        //o yuzden sart degilse wrapper class kullanmayi tercih etmeyiz
        //boyle bir imkanin varligindan da haberdar olmaliyiz

        // "n" yazıp "nokta" koyarsanız hiç method göremezsiniz.çünkü primitiveler method içermez
        int n = 12;
        // "m" yazıp "nokta" koyarsanız hiç method görebilirsiniz.çünkü wrapper claslar method içerir.
        Integer m = 12;

        byte p = 13;
        Byte r = 13;

        //ornek 1: short data typın minımum ve maximum değerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //ornek 2: int data typının minimuum değeri ile byte data typenınn maximum değerinin toplamını buunuz.

        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);  //-2147483521

        //ornek 3: Primitve int i wrapper integer a ceviriniz
        int num = 13;
        Integer wrapperNum = num;
        //primitive yani method bulunmayan bir kutudaki degeri alarak icinde
        // bazi methodlar bulunan wrapper kutuya atama yaparsak bu isleme
        //autoboxing denir

        //ii) Wapper Byte ı primitive byt a ceviriiz
        Byte k = 33;
        byte primitiveK= k;
        //wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak
        //primitive yani method bulunmayan bir kutuya atama yaparsak bu isleme
        //un boxing denir

        //örnek 4: Primitive char ı Wrapper Character e ceviriniz.
        char initial = 'T';  //bu primitive
        Character initialWrapper = initial;  //wrapperladık - autoboxing yaptık
        //ii) Wrapper  Boolean ı primitive boolean a ceviriniz

        Boolean isOld = true;   //wrapper olan bir datayı aldım- method vardı kutudan cıkardık
        boolean isOldpr = isOld; //unboxing yaptık



    }





}
