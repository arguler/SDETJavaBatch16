package replit;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
            Scanner comp=new Scanner(System.in);
            System.out.println("Please enter two strings");
            String word1=comp.next(), word2=comp.next();;
            int num1=comp.nextInt(), num2=comp.nextInt();
            if (word1.equals(word2) && num1==num2){
                System.out.println("AND");}

    }
}


