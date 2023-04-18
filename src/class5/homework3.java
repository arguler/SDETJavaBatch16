package class5;

import java.util.Scanner;

/* Write a program that will ask user to input inputs the current time (use 24 hour format).
        Based on the given time define:
        if hour is between 1-11 --> Morning
        if hour between 12-15 --> Afternoon
        if hour between 16-20 --> Evening
        if hour between 21-24 --> Night */
public class homework3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Enter the time");
        int time = giris.nextInt();
        if (0 < time && time < 12) {
            System.out.println("It is Morning");
        } else if (11 < time && time < 16) {
            System.out.println("It is Afternoon");
        } else if (15 < time && time < 21) {
            System.out.println("It is a Evening");
        } else if (20 < time && time < 25) {
            System.out.println("It is a large number");
        }
        else {
            System.out.println("It is not a valid time value");
        }
    }

}
