package class3;

public class posnegevenoddchecker {
    public static void main(String[] args) {
        int num1 = -8, num2 = 11;
        if (num1 < 0) {
            System.out.println(num1);
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
        System.out.println(num2);
        if (num2 % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
