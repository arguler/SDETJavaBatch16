package class5;

import java.util.Scanner;

/* Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine
the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F */
public class homework5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Please enter your quiz, mid term,\n and final scores respectively.");
        double num1 = giris.nextInt(), num2 = giris.nextInt(), num3 = giris.nextInt();
        double average = (num1 + num2 + num3)/3;
        System.out.println("Your average score is: "+average);
        if (89.5<=average) {
            System.out.println("You are in grade A");
        } else if (69.5<=average && 89.5>=average) {
            System.out.println("You are in grade B");
        }else if (49.5<=average && 69.5>=average) {
            System.out.println("You are in grade C");
        }else if (49.5>=average) {
            System.out.println("You are in grade F");
        }
    }
}