package class7;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner intask = new Scanner(System.in);
        System.out.print("In: ");
        int x = intask.nextInt();
        for (int i=x-1; i>= 0; i--){
            System.out.print(i + " ");
        }
    }
}