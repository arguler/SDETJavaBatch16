package class8;

public class array3 {
    public static void main(String[] args) {
        boolean[] flags = {true, false, true, false, false, true};
        int count = 0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i] == false) {
                count++;
                System.out.println(flags[i]);
            }
        }
        System.out.println(count);
    }
}
