package day14Loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
       //kullanıcı username ve paswordu girsin,
        //3 kereden fazla yanlış girerse "your account was blocked" mesajı alsın
        // 3 kereye kadar yanlış gireerse "ınvalid username or password,try again" mesajı alsın
        //dogru girerse "welcome to your acccount" mesajı alsın
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";

        do{
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Please enter your username");
            String userName = input.next();

            System.out.println("Please enter your password");
            String passWord = input.next();

            counter++;

            if(userName.equals(validUserName) && passWord.equals(validPassWord)){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Invalid username or password");
                System.out.println((3-counter) + " right left");
            }
        }while(true);


    }//main
}
