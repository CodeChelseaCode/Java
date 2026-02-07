/*
    Question - Write a Program to Swap Two Numbers
        Solved By Chelsea Rice
*/
import java.util.Scanner;

public class question3{
    public static void main(String[] args){
        enterAndSwapNums();
    }

    public static void swapNums(){
        int x = 2;
        int z = 3;
        
        System.out.println("This is before switching. X = " + x + " Z = " + z);
        int temp = x;
        x = z;
        z = temp;

        System.out.println("This is after switching. X = " + x + " Z = " + z);

    }

    public static void enterAndSwapNums(){
        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter a X value: ");
        int x = myScan.nextInt();

        System.out.print("Enter a Z value: ");
        int z = myScan.nextInt();

        System.out.println("This is before switching. X = " + x + " Z = " + z);

        int temp = x;
        x = z;
        z = temp;

        System.out.println("This is after switching. X = " + x + " Z = " + z);

        myScan.close();
    }
}