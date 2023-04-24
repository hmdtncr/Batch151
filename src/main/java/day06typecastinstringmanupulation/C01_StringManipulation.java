package day06typecastinstringmanupulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        
        String a = "Tek Rakibim Dünkü Ben .";
        //*************** toUpperCase() ****************//
       String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);

        //aUpper = TEK RAKİBİM DÜNKÜ BEN
        //**************** toLowerCase ************//
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);
        //aLowe = tek rakibim dünkü ben.


        //*************** toLowerCase()  **************//

        //*********** charAt() **************//
        System.out.println("ilk karakter: "+ (a.charAt(0)));
        System.out.println(a.charAt(10)); //m

        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(21);
        System.out.println("" + firstChar+ " " +lastSecondChar);


        
        
    }//main

}//class
