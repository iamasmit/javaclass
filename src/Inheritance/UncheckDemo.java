package Inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckDemo {
    //java doesnot check for exceptions at compile time
    //so any exceptions occur, appear only at runtime
    //and if not handled by user the program will terminat
    /*
    * ArithmeticException
    * NumberFormatException
    * InputMismatchException
    * STringIndexOutofBoundsException
    * ArrayIndexOutofBoundsException
    * NullPinterException etc
    * */

    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        try {
            int result = a / b; // exception occurred ArithmeticException
            System.out.println("The result is " + result);

            String value = "100";
            int cost = Integer.parseInt(value);
            System.out.println("The cost is " + cost);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your grade :" ); //expected input : 4 3.5 3
            double grade = sc.nextDouble(); //InputMismatchException
            // user inputs a , b etc.. which cannot be converted into double value
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("Normal flow of execution..");
    }


}
