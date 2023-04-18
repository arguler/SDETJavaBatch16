package class5;

public class review1 {
    public static void main(String[] args) {
        /*
        create a variable money store the value 20000 inside that variable
        write if-else if money is greater than 10000 program should check another
        condition for example it should check what day is today if the day is
        Sunday it should say lets go shopping
         */
        int money = 4000;
        String day = "Monday";
        if (money > 10000) {
            if (day.equals("Monday")) {
                System.out.println("Let's go shopping");
            } else {
                System.out.println("Lets wait for Sunday");
            }
        } else {
            System.out.println("Let's save more");
        }
    }
}
