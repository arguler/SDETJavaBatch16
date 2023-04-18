package class5;

import java.io.InputStream;
import java.util.Scanner;

/* Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
 Based on operator provide the result to user.
 */
public class homework7 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers \n(Press enter after each numbers)");
        Scanner numentry=new Scanner(System.in);
        double num1= numentry.nextDouble(), num2=numentry.nextDouble();

        Scanner operandentry=new Scanner(System.in);
        System.out.println("Please select your operand +,-,*,/");
        String operand=operandentry.next();

        if (operand.equals("+")){
            System.out.println("Answer is "+(num1+num2));
        }
        if (operand.equals("-")){
            System.out.println("Answer is "+(num1-num2));
        }
        if (operand.equals("*")){
            System.out.println("Answer is "+(num1*num2));
        }
        if (operand.equals("/")){
            System.out.println("Answer is "+(num1/num2));
        }
     }
}

