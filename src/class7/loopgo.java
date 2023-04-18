package class7;

import java.util.Scanner;

public class loopgo {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Enter start, end and step numbers");
        int start = giris.nextInt();
        int end = giris.nextInt();
        int step = giris.nextInt();
        int number = start;
        while (number <= end) {
            System.out.print(number + " ");
            number = number + step;
        }
        System.out.println("Enter a new end number ");
        int num1= giris.nextInt();
        number=start;
           do{
            System.out.print(number+" ");
            number=number+step;
        } while (number<=num1);
    }
}