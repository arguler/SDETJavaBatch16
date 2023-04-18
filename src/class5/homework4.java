package class5;

import java.util.Scanner;

/* Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in March, April, May → season =”Spring”
        if user is born in June, July, August →
        season =”Summer”  etc …
        At the end of the program we should see 1 output as “You were born is season __”.   */
public class homework4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Which month did you born? (write in small letters)");
        String month = giris.next();
        if (month.equals("december") || month.equals("january") || month.equals("february")) {
            System.out.println("You were born in season winter");
        } else if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("You were born in season spring");
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("You were born in season summer");
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("You were born in season autumn");
        } else {
            System.out.println("You wrote wrong");
        }
    }
}