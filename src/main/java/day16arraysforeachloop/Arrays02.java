package day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        // + - * / işlemleri yapabilen bir hesap makinesi yapınız
        //kullanıcı "q" ya basmadığı sürece işlem secip yapabilsin
        /*
        1)kullanıcıdan data alabilmek için Scanner object oluştur
        2)kullanıcıdan yapacağı işlemi almalıyız
        3)kullanıcıdan iki tane sayı almalıyız
        4)tekrar tekrar işlem yapabilmek için loop kullanmalıyız
         */
        Scanner input = new Scanner(System.in);

        System.out.println("To stop calculation press 'q'");
        char opr = ' ';

        do{
            System.out.println("Please enter the operation among +, -, *, /, %");
            opr = input.next().toLowerCase().charAt(0);

            if(opr=='q'){
                System.out.println("See you again");
                break;
            }
            boolean r = opr=='+' || opr=='-' || opr=='*' || opr=='/' || opr=='%';

            if(!r){
                System.out.println("Undefined operation");
                break;
            }

            System.out.println("Enter the first number");
            int n1 = input.nextInt();
            System.out.println("Enter the second number");
            int n2 = input.nextInt();

            switch(opr){
                case '+':
                    System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                    break;
                case '-':
                    System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
                    break;
                case '*':
                    System.out.println(n1 + "x" + n2 + "=" + (n1*n2));
                    break;
                case '/':
                    System.out.println(n1 + ":" + n2 + "=" + (n1/n2));
                    break;
                case '%':
                    System.out.println(n1 + "%" + n2 + "=" + (n1*n2)/100);
                    break;
            }

        }while(true);

    }//main
}
