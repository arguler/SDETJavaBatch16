/* 3)You are DMV representative and you need to ask customer their age.
        If they are 18 and older you will issue a driver license to them, otherwise you
        will offer them to get a learners permit.
*/
package class4;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner ageentry = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = ageentry.nextInt();
        if (age > 18) {
            System.out.println("You can get your driver's license.");
        } else {
            System.out.println("You must get a learners permit.");
        }
    }
}
