/**************************************************************************************************************************************
 * @FizzBuzz.java
 * @brief: I struggled with creating the condition for the for loop but after that the program was self-explanatory
 * @Avikar Khakh
 * @Date: 10/5/2022
 * @acknowledgement: Avikar Khakh
 **************************************************************************************************************************************/
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Fizz Buzz =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Enter three integers, separated by space: ");

        // ask the user for 3 integers
        int x = scnr.nextInt();
        int y = scnr.nextInt();
        int n = scnr.nextInt();

        // for loop to test the various values with one another and combined with if statement to print out the correct things
        for (int i = 1; i <= n; i++)
        {
            if ( ((i % x) == 0) && ((i % y) == 0) ) // Is it a multiple of x & y?
                System.out.print("FizzBuzz ");
            else if ( (i % x) == 0) // Is it a multiple of x?
                System.out.print("Fizz ");
            else if ((i % y) == 0) // Is it a multiple of y?
                System.out.print("Buzz ");
            else
                System.out.print(i + " "); // Not a multiple of x or y
        }
    }
}
