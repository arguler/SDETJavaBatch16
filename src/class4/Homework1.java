/*  1)Create a Java program and declare int variable that will hold a month.
      Based on the value of the variable your program should print the name of the month.
*/
package class4;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1-12 to print a month name");
        int month = scanner.nextInt();
        if (month == 1) {
            System.out.println("January");
        }
        if (month == 2) {
            System.out.println("February");
        }
        if (month == 3) {
            System.out.println("March");
        }
        if (month == 4) {
            System.out.println("April");
        }
        if (month == 5) {
            System.out.println("May");
        }
        if (month == 6) {
            System.out.println("June");
        }
        if (month == 7) {
            System.out.println("July");
        }
        if (month == 8) {
            System.out.println("August");
        }
        if (month == 9) {
            System.out.println("September");
        }
        if (month == 10) {
            System.out.println("October");
        }
        if (month == 11) {
            System.out.println("November");
        }
        if (month == 12) {
            System.out.println("December");
        }
    }
}
