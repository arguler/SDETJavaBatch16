package class5;
/* Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
 Based on operator provide the result to user.
 */
import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        Scanner numbersentry = new Scanner(System.in);
        System.out.println("Please enter two numbers. \n(Press enter after each numbers)");
        double num1 = numbersentry.nextDouble(), num2 = numbersentry.nextDouble();

        Scanner operandentry = new Scanner(System.in);
        System.out.println("Please select your operand +,-,*,/");
        String operand = operandentry.next();

        switch (operand) {
            case "+":
                System.out.println("The answer is " + (num1 + num2));
                break;
            case "-":
                System.out.println("The answer is " + (num1 - num2));
                break;
            case "*":
                System.out.println("The answer is " + (num1 * num2));
                break;
            case "/":
                System.out.println("The answer is " + (num1 / num2));
                break;
            default:
                System.out.println("This operand is invalid");
        }
    }
}
