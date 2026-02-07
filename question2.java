/*
    Question - Write a program in Java to add 2 numbers
        Solved By Chelsea Rice
*/
import java.util.Scanner;

public class question2 {
    public static void main (String[] args){

        enterAndAddNumbers();
    }


    public static void addNumbers(){
        int a = 5;
        int b = 6;

        System.out.println("5 + 6 = " + (a + b));
    }

    public static void enterAndAddNumbers(){
        Scanner myScan = new Scanner (System.in);
        System.out.print("Enter The X Value: ");

        int x = myScan.nextInt();

        System.out.print("Enter The Y Value: ");

        int y = myScan.nextInt();

        System.out.println(x + " + " + y + " = " + (x+y));

        myScan.close();
    }

}
