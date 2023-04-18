package class5;

import java.util.Scanner;

/* Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”,
any other day → output “Invalid day” */
public class homework1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Enter a number between 1-7");
        int day = giris.nextInt();
        if (0 < day && day < 6) {
            System.out.println("It is a weekday");
        } else if (5 < day && day < 8) {
            System.out.println("It is a weekend");
        }
        else {
            System.out.println("You have entered invalid number");
        }
    }
}
