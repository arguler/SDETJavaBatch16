package class8;
/* Print numbers from 1 to 50 except those that are divisible by 3 */
public class homework {
    public static void main(String[] args) {
        int num1=1;
        while (num1<51){
            if(num1%3!=0){
                System.out.print(num1+"  ");
            }
            num1++;
        }

    }
}
