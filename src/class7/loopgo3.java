package class7;

public class loopgo3 {
    public static void main(String[] args) {
        int num1=0, sum=0;
        for (int i = 1; i <=30 ; i++) {
            if (i%2==0){
                sum=sum+i;
                System.out.print(sum+" ");
            }
        }
        System.out.println("\n"+sum);
    }
}
