
//Lynsi Nickerson
//My project that integrates all of the java skills I have learned in my COP 
//2006 class.
//sysout ctrl+space
/* Java built-in data types:
 * byte: 8-bit signed two's complement integer; min value of -128 and max of 127
 * (inclusive); useful for saving memory in large arrays and can be used in 
 * place of int where their limits help to clarify code.
 * 
 * short: 16-bit signed two's complement integer; min value of -32,768 and max
 * of 32,767(inclusive); useful for saving memory in large arrays.
 * 
 * int: can be used to represent an unsigned 32-bit integer with a min value of
 * 0 and a max of (2^32)-1.
 * 
 * long: can be used to represent an unsigned 64-bit long with a min value of 0
 * and a max of (2^64)-1. Useful when you need a range of values wider than 
 * those provided by int.
 * 
 * float: single-precision 32-bit IEEE 754 floating point; should never be used
 * for precise values, such as currency.
 * 
 * double: double-precision 64-bit IEEE 754 floating point; default choice for
 * representing decimals; should never be used for precise values, such as
 * currency.
 * 
 * boolean: has the two possible values true and false; used for simple flags 
 * that track true/false conditions.
 * 
 * char: single 16-bit Unicode character; min value of '\u0000' (0) and a max 
 * of '\uffff' (65,535 inclusive).
 */
//variable: a location in memory.

import java.util.Scanner;
import java.util.InputMismatchException;

//this is a public class named 'Main'
public class Main {

    // this is a method header, which contains the parameter in parentheses()
    public static void main(String[] args) {
        // this is a call, which contains the argument in parentheses()
        System.out.println("Welcome to my Integration Project!");

        // demonstration of integer division

        // these are variables with the int data type
        int num1 = 10;
        int num2 = 5;
        int num3 = 4;
        int num4 = num1 - num2;

        System.out.println("In Java, a variable of the type int divided by "
                + "another int will always equal another int");
        System.out.println("Because of this, dividing " + num1 + " by " + num2
                + " equals " + num1 / num2 + " and dividing " + num1 + " by "
                + num3 + " also equals " + num1 / num3);

        // subtraction of two integers

        System.out.println("You can also subtract two integers:");
        System.out.println(
                "Subtracting " + num2 + " from " + num1 + " equals " + num4);

        // determine if a number is even or odd

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer to see if it is even or odd: ");

        try {
            int inputNumber = scan.nextInt();

            if (inputNumber % 2 == 0) {

                System.out.println("Your number is even");
            }

            else {

                System.out.println("Your number is odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: input must be an integer");
        }

        // calculating total meal price including tax and tip percentages

        System.out.println("Calculate your total meal price by inputing"
                + " your meal cost, tip percent, and tax percent:");

        System.out.println("Enter your meal cost: ");
        double meal_cost = scan.nextDouble();
        System.out.println("Enter your tip percent: ");
        double tip_percent = scan.nextDouble();
        System.out.println("Enter your tax percent: ");
        double tax_percent = scan.nextDouble();

        if (tip_percent % 1 != 0 || tax_percent % 1 != 0) {
            System.out.println("Error: tax percent and tip percent must "
                    + "be whole numbers");
        } else {
            double meal_tip = (meal_cost * tip_percent) / 100;
            double meal_tax = (meal_cost * tax_percent) / 100;
            double totalCost = meal_cost + meal_tip + meal_tax;
            int roundedMealCost = (int) Math.round(totalCost);

            System.out.println(
                    "The total meal cost is " + roundedMealCost + " dollars.");
        }

        // switch an integer to its corresponding month name

        System.out.println("Enter an integer to return its corresponding"
                + " month name: ");

        try {

            int month = scan.nextInt();

            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid Month");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: input must be an integer");
        }

        // using various string methods to manipulate two strings

        System.out.println("Enter two strings: ");

        String A = scan.next();
        String B = scan.next();
        scan.close();

        // sum lengths of A and B.
        int Alength = A.length();
        int Blength = B.length();

        System.out.println("Sum the lengths of String A and String B: ");
        System.out.println(Alength + Blength);

        // Write Yes if A is lexographically larger that B, or No if it's not
        System.out.println("If string A is lexographically larger than"
                + " String B, 'Yes' will be printed.  If String A is"
                + " lexographically smaller than or equal to String B, 'No'"
                + " will be printed: ");
        
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter in A and B 
        System.out.println("Capitalize the first letter in each String: ");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)
                + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
