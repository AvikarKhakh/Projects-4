import java.util.Scanner;

public class IntegerSorter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
// sets up output and asks user first question
        System.out.println("Integer Sorter =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Enter three integers, separated by space (e.g., 3 4 5):");
// declares the integer variables
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
// if statement for the program to look at the values and say if it is sorted or a or d
        if (num1 >= num2 && num2 >= num3) {
            System.out.println("The integers were in descending order.");
        } else if (num1 <= num2 && num2 <= num3) {
            System.out.println("The integers were in ascending order.");
        } else {
            System.out.println("The integers were not sorted.");
        }
// asks user how they want to sort their numbers

        System.out.println("How do you want them to be sorted?");
        String preference = scnr.next();

// if the user inputs anything besides these values it will let them know
        if (!"ascending".equals(preference) && !"a".equals(preference) && !"descending".equals(preference) && !"d".equals(preference))
        {
            System.out.println("Your input must be ‘ascending’, ‘a’, ‘descending’, or ‘d’.");
        }

        // first if statement considering the user asked for an ascending order

        if ( preference.equals("ascending") || preference.equals("a") ) {
            if (num1 >= num2)
                if (num2 >= num3)
                {
                    System.out.print("The integers sorted in ascending order are: " + num3 + " " + num2 + " " + num1);
                }
                else if (num3 >= num1)
                {
                    System.out.print("The integers sorted in ascending order are: " + num2 + " " + num1 + " " + num3);
                }
                else if (num1 > num3)
                {
                    System.out.print("The integers sorted in ascending order are: " + num2 + " " + num3 + " " + num1);
                }
            if (num2 > num1)            // if the value 2 is greater than 1 there is a second nested if statement
                if (num3 >= num2)
                {
                    System.out.print("The integers sorted in ascending order are: " + num1 + " " + num2 + " " + num3);
                }
                else if (num3 >= num1)
                {
                    System.out.print("The integers sorted in ascending order are: " + num1 + " " + num3 + " " + num2);
                }
                else if (num1 > num3)
                {
                    System.out.print("The integers sorted in ascending order are: " + num3 + " " + num1 + " " + num2);
                }
        }

        // if the user asks for a descending order, same exact code just backwards output

        if ( preference.equals("descending") || preference.equals("d") ) {
            if (num1 >= num2)
                if (num2 >= num3)
                {
                    System.out.print("The integers sorted in descending order are: " + num1 + " " + num2 + " " + num3);
                }
                else if (num3 >= num1)
                {
                    System.out.print("The integers sorted in descending order are: " + num3 + " " + num1 + " " + num2);
                }
                else if (num1 > num3)
                {
                    System.out.print("The integers sorted in descending order are: " + num1 + " " + num3 + " " + num2);
                }
            if (num2 > num1)
                if (num3 >= num2)
                {
                    System.out.print("The integers sorted in descending order are: " + num3 + " " + num2 + " " + num1);
                }
                else if (num3 >= num1)
                {
                    System.out.print("The integers sorted in descending order are: " + num2 + " " + num3 + " " + num1);
                }
                else if (num1 > num3)
                {
                    System.out.print("The integers sorted in descending order are: " + num2 + " " + num1 + " " + num3);
                }
        }
    }
}








