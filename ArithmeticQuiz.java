/**************************************************************************************************************************************
 * @ArithmeticQuiz.java
 * @brief: I struggled with assignment the various operators with the random value from 0 to 2
 * @Avikar Khakh
 * @Date: 10/25/2022
 * @acknowledgement: Avikar Khakh
 **************************************************************************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class ArithmeticQuiz {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Arithmetic Quiz =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Enter the range of the integer operands, separated by space: ");
// asks user for interval
        int min = scnr.nextInt();
        int max = scnr.nextInt();
        int a = 1;

// for loop that continues till user gets a question wrong
        while (true) {
            int firstNumber = new Random().nextInt(min, max + 1);
            int secondNumber = new Random().nextInt(min, max + 1);
// assigns a random digit to the various questions
            int answer;
            int z = new Random().nextInt(3);

            if (z == 0)
            {
                System.out.println("Q" + a + ": What is " + firstNumber + " " + "+" + " " + secondNumber + " ?");
                answer = scnr.nextInt();
                if (answer == firstNumber + secondNumber)
                {
                    System.out.println("That's correct!");
                } // if question is wrong program ends and provides correct answer with how many questions you previously got correct
                else
                {
                    System.out.println("Oops...the correct answer is " + (firstNumber + secondNumber) );
                    System.out.println("You answered " + (a - 1) + " questions correctly!");
                    return;
                }
            }

             else if (z == 1)
            {
                System.out.println("Q" + a + ": What is " + firstNumber + " " + "-" + " " + secondNumber + " ?");
                answer = scnr.nextInt();
                if (answer == firstNumber - secondNumber)
                {
                    System.out.println("That's correct!");
                }
                else
                {
                    System.out.println("Oops...the correct answer is " + (firstNumber - secondNumber));
                    System.out.println("You answered " + (a - 1) + " questions correctly!");
                    return;
                }
            }

            else
            {
                System.out.println("Q" + a + ": What is " + firstNumber + " " + "*" + " " + secondNumber + " ?");
                answer = scnr.nextInt();
                if (answer == firstNumber * secondNumber)
                {
                    System.out.println("That's correct!");
                }
                else
                {
                    System.out.println("Oops...the correct answer is " + (firstNumber * secondNumber));
                    System.out.println("You answered " + (a - 1) + " questions correctly!");
                    return;
                }
            }
            a++;
        }
    }
}


