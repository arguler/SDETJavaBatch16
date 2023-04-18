/* 4) Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is
        the city  is .....
*/
package class4;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        Scanner cityentry = new Scanner(System.in);
        System.out.println("Which city do you live?");
        String city = cityentry.next();
        Scanner tempentry = new Scanner(System.in);
        System.out.println("What is the temperature there?");
        double temp = tempentry.nextDouble();
        temp=((temp-32)/1.8);
        System.out.println("The temperature is the " + city +
                " is " + temp + " celcius.");
    }
}
