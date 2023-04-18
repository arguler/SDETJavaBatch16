package class4;

import java.util.Scanner;

public class charscanner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=input.next().charAt(0);
        System.out.println("you entered "+gender);
        }
}
