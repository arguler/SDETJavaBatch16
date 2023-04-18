/* 2) You are a loan specialist and you need to ask user what is the amount of loan
        is needed. If loan is less or equal to 200,000 then you would lend the money
        otherwise you would reject the client.
*/
package class4;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Enter the amount of loan you need?");
        int loan = giris.nextInt();
        if (loan > 0 && loan <= 200000) {
            System.out.println("You can withdraw your loan.");
        } else {
            System.out.println("Your loan request has been rejected.");
        }
    }
}
