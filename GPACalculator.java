/**************************************************************************************************************************************
 * @GPACalculator.java
 * @brief: I struggled with assigning the letter grades to the number values in order to calculate the gpa
 * @Avikar Khakh
 * @Date: 9/21/2022
 * @acknowledgement: Avikar Khakh
 **************************************************************************************************************************************/

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        // user input
        Scanner scnr = new Scanner(System.in);

        // heading and asks user initial questions
        System.out.println("GPA Calculator =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("How many courses did you take (choose from [3, 4]): ");
        int numCourses = scnr.nextInt();

        // asks user all the individual questions for course credit and letter grade along with assigning values to separate variables
        System.out.println("For course 1, how many credits did you receive: ");
        double credits1 = scnr.nextInt();
        System.out.println("For course 1, what letter grade did you receive: ");
        String letterGrade1 = scnr.next();

        // includes an if statement after each time it asks for course credit or course letter grade to make sure the user is inputting the correct inputs
        if ( !letterGrade1.equals("A") && !letterGrade1.equals("A-") && !letterGrade1.equals("B") && !letterGrade1.equals("B-") && !letterGrade1.equals("C") && !letterGrade1.equals("C-") && !letterGrade1.equals("D") ) {
            System.out.printf("You must input one of the following letter grades: A, A-, B, B-, C, C-, D.\nPlease try again!");
            return;
        }

        System.out.println("For course 2, how many credits did you receive: ");
        double credits2 = scnr.nextInt();
        System.out.println("For course 2, what letter grade did you receive: ");
        String letterGrade2 = scnr.next();

        if ( !letterGrade2.equals("A") && !letterGrade2.equals("A-") && !letterGrade2.equals("B") && !letterGrade2.equals("B-") && !letterGrade2.equals("C") && !letterGrade2.equals("C-") && !letterGrade2.equals("D") ) {
            System.out.printf("You must input one of the following letter grades: A, A-, B, B-, C, C-, D.\nPlease try again!");
            return;
        }

        System.out.println("For course 3, how many credits did you receive: ");
        double credits3 = scnr.nextInt();
        System.out.println("For course 3, what letter grade did you receive: ");
        String letterGrade3 = scnr.next();

        if ( !letterGrade3.equals("A") && !letterGrade3.equals("A-") && !letterGrade3.equals("B") && !letterGrade3.equals("B-") && !letterGrade3.equals("C") && !letterGrade3.equals("C-") && !letterGrade3.equals("D") ) {
            System.out.printf("You must input one of the following letter grades: A, A-, B, B-, C, C-, D.\nPlease try again!");
            return;
        }
// includes an extra if statement just in case the user implements 4 courses
        double credits4 = 0;
        String letterGrade4 = " ";
        if (numCourses == 4){
            System.out.println("For course 4, how many credits did you receive: ");
            credits4 = scnr.nextInt();
            System.out.println("For course 4, what letter grade did you receive: ");
            letterGrade4 = scnr.next();
        }

        if ( !letterGrade4.equals("A") && !letterGrade4.equals("A-") && !letterGrade4.equals("B") && !letterGrade4.equals("B-") && !letterGrade4.equals("C") && !letterGrade4.equals("C-") && !letterGrade4.equals("D") ) {
            System.out.printf("You must input one of the following letter grades: A, A-, B, B-, C, C-, D.\nPlease try again!");
            return;
        }

// declare and initialize new variables for the letter grades
        double gradeValue = 0;
        double gradeValue2 = 0;
        double gradeValue3 = 0;
        double gradeValue4 = 0;
        // if statements for the letter grades
        if (letterGrade1.equals("A")){
            gradeValue += 4.00;
        } else if (letterGrade1.equals("A-")){
            gradeValue += 3.70;
        } else if (letterGrade1.equals("B")) {
            gradeValue += 3.00;
        } else if (letterGrade1.equals("B-")){
            gradeValue += 2.70;
        } else if (letterGrade1.equals("C")) {
            gradeValue += 2.0;
        } else if (letterGrade1.equals("C-")) {
            gradeValue += 1.70;
        } else if (letterGrade1.equals("D")) {
            gradeValue += 1.0;
        }

        if (letterGrade2.equals("A")){
            gradeValue2 += 4.00;
        } else if (letterGrade2.equals("A-")){
            gradeValue2 += 3.70;
        } else if (letterGrade2.equals("B")) {
            gradeValue2 += 3.00;
        } else if (letterGrade2.equals("B-")){
            gradeValue2 += 2.70;
        } else if (letterGrade2.equals("C")) {
            gradeValue2 += 2.0;
        } else if (letterGrade2.equals("C-")) {
            gradeValue2 += 1.70;
        } else if (letterGrade2.equals("D")) {
            gradeValue2 += 1.0;
        }

        if (letterGrade3.equals("A")){
            gradeValue3 += 4.00;
        } else if (letterGrade3.equals("A-")){
            gradeValue3 += 3.70;
        } else if (letterGrade3.equals("B")) {
            gradeValue3 += 3.00;
        } else if (letterGrade3.equals("B-")){
            gradeValue3 += 2.70;
        } else if (letterGrade3.equals("C")) {
            gradeValue3 += 2.0;
        } else if (letterGrade3.equals("C-")) {
            gradeValue3 += 1.70;
        } else if (letterGrade3.equals("D")) {
            gradeValue3 += 1.0;
        }

        if (letterGrade4.equals("A")){
            gradeValue4 += 4.00;
        } else if (letterGrade4.equals("A-")){
            gradeValue4 += 3.70;
        } else if (letterGrade4.equals("B")) {
            gradeValue4 += 3.00;
        } else if (letterGrade4.equals("B-")){
            gradeValue4 += 2.70;
        } else if (letterGrade4.equals("C")) {
            gradeValue4 += 2.0;
        } else if (letterGrade4.equals("C-")) {
            gradeValue4 += 1.70;
        } else if (letterGrade4.equals("D")) {
            gradeValue4 += 1.0;
        }
// calculate gpaNumerator and then divide by credits and print
        double gpaNum = (credits1 * gradeValue) + (credits2 * gradeValue2) + (credits3 * gradeValue3) + (credits4 * gradeValue4);

        double GPA = gpaNum / (credits1 + credits2 + credits3 + credits4);

        System.out.printf("Your GPA is: %.2f", GPA);


    }
}
