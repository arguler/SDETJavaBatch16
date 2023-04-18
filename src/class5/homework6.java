package class5;
/* Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        Allow user to enter grade (A, B, or C etc...) and then provide
        explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation. */

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner countryentry = new Scanner(System.in);
        System.out.println("Please enter your country");
        String country = countryentry.next();
        switch (country) {
            case "Türkiye":
                System.out.println("Türkçe");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Portugal":
                System.out.println("Portuguese");
                break;
            case "France":
                System.out.println("French");
                break;
            case "Germany":
                System.out.println("German");
                break;
            default:
                System.out.println("This country is not in list");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade.");
        String grade = scan.next();
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Bad");
                break;
            default:
                System.out.println("This is not valid grade. Please write A-D");
        }
    }
}
