package day17multidimensinolarraypassbyvalue;

public class PassByValue01 {
    /*
    Method oluşturmak için asağıdaki 5 adımı takip ediniz
    1)Access Modifier
    2) Return Type
    3) Method ismi
    4)Method Parantezi
    5) Methodun body'si

    NOTE: "main methodun" içindeki tüm methodlar static olmalıdır
    Bir methodu static yapmak icin access modifier ile return type in arasina
    static yazmak yeterlidir

    Pass by value:
    1)Java Pass by value kullanır
    2)java methodların orjinal degeri değiştirmesine müsade etmez
    3)java methodlara deger yollarken orjinal degerin kopyasını oluşturur ve o kopyayı hethoda yollar
       Method kopya değer uzerinde değişiklik yapar, böylece orjinal değer korunmuş olur.
    4)java esnek bir dildir. istersek yazdigimiz kod ile orijinal degerin
degismesini de temin edebiliriz

    pass by Reference:
    1)Pass by Reference da methoda reference yollanır
    2)Reference adres demektir. Adres yollanınca method adresi kullanarak orjinal değere ulaşır ve
    orginal değeri değiştirir. Bu yuzden "C#" gibi Pass by Reference kullanan yazilim dillerinde method
    variable nin orijinal  degerini degistirir.
     */
    public static void main(String[] args) {
        int shirtPrice =200;

        System.out.println(discount("student", shirtPrice));
        System.out.println(shirtPrice);


    }//main
    //Discount Method u oluşturunuz
    public static int discount(String type, int price){
        switch (type){
            case "student":
                price = price -20;
                break;
            case "veteran" :
                price=price - 20 ;
                break;
            case "senior":
                price=price - 20 ;
                break;
            default:
                price=price;

        }
        return price;

        }

    }

