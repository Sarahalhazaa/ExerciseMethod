import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

////Q1-----------------------------------------------------------
//        System.out.println("Enter First Number:");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter second Number:");
//        int num2 = scanner.nextInt();
//        System.out.println("Enter third Number:");
//        int num3 = scanner.nextInt();
//
//        smallest(num1,num2,num3);
////Q2-----------------------------------------------------------
//        System.out.println("Enter Number:");
//        int num = scanner.nextInt();
//
//        check(num);
//
////Q3-----------------------------------------------------------

System.out.printf("1. A password must have at least ten characters.%n 2.A password consists of only letters and digits. %n 3.A password must contain at least two digits. %n Enter a password (You are agreeing to the above Terms and Conditions.):");
        String password= scanner.nextLine();

        if ( checkPassword(password)){
            System.out.println("Password is valid:"+ password);
        }else  System.out.println("Password is not valid:"+ password);

}
    public static void smallest( int num1, int num2, int num3){

        int min=num1;
        if (num2<min) {
            min = num2;
        }if (num3<min) {
            min=num3;
        }
        System.out.println("The smallest value is :"+min);

    }

    public static void check( int num){

        if(num==0){
            System.out.println("zero");}
        else if (num>0) {
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }
    }

    public static boolean checkPassword( String password){

        if (password.length()<10){
         System.out.println(" A password must have at least eight characters");
         return false;
        }

         if (!Pattern.matches("[a-zA-Z-0-9]+",password)){
        System.out.println(" A password consists of only letters and digits.");
             return false;
         }

        int count=0;
        for (int i=0 ; i< password.length();i++){

         if (Character.isDigit(password.toString().charAt(i))){
             count++;
         }}

          if (count<2){
              System.out.println(" A password must contain at least two digits.");
              return false;
          }

        return true;
    }




}