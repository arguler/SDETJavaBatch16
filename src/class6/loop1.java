package class6;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner asknumber = new Scanner(System.in);
        System.out.println("Please enter any number greater than 1");
        int number = asknumber.nextInt();
        int num = 1;
        while (num <= number) {
            System.out.print(num + " ");
            num++;
        }
        num=1;
        System.out.println("Please enter second number");
        int num2=asknumber.nextInt();
        while (num<=num2){
            System.out.println(num);
            num++;
        }
    }
}