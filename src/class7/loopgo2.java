package class7;

import java.util.Scanner;

public class loopgo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();
        do {
            System.out.println("Try again");
            System.out.println("Please enter a number");
            num1 = scanner.nextInt();
        }
        while (num1 != -1);
        System.out.println("Hello world");
    }
}