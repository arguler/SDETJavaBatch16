package class2;
/*      2)Create a Java program and name it Variables .In your program create different type of variables to store
        student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
        My name is  and my  last name is __  //  I am A/B student  //  I live in city and state__ And my phone number is …..            */
public class Variables {
    public static void main(String[] args) {
        String name="Ali Rıza", surname="Güler", grade="graduate", city="Balıkesir",
                state="Türkiye", phonenumber="+90 5051112233";
        System.out.println("My name is "+ name +" and my last name is "+ surname + ".");
        System.out.println("I have " + grade + " degree.");
        System.out.println("I live in "+ city + " and " + state +".");
        System.out.println("My phone number is " + phonenumber + " .");
    }
}
