package day28interface;

public interface Animal {
    void eat();
    void drink ();
    /*
    1) İnterface'lerdeki tüm Variable'ler otomatik olarak "Final" dır.
       Bu yuzden İnterface içindeki Variable'yi oluşturduğunuzda mutlaka değer ataması yapmalısınız.
       Final Variable'ların değerleri değiştirilemez.
    2) İnterface'lerdeki tüm variable'lar otomatik olarak public" dir.
    3)  İnterfacelerdeki tum variablelar otomatik(default) olarak "static"dir.
     */
    int age =4;

}
