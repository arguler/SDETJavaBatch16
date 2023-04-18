package class5;

import java.util.Scanner;

/*      Ask user to enter a number and then define if number is small,
        medium or large Small number is value between 1 and 10
        Medium number is value between 11 and 100
        Large number is value between 101 and 1000 */
public class homework2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = giris.nextInt();
        if (0 < number && number < 11) {
            System.out.println("It is a small number");
        } else if (10 < number && number < 101) {
            System.out.println("It is a medium number");
        } else if (100 < number && number < 1001) {
            System.out.println("It is a large number");
        } else {
            System.out.println("I can't categorize this number");
        }
    }
}