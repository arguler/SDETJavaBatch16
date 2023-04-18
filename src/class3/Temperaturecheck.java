package class3;

public class Temperaturecheck {
    public static void main(String[] args) {
        int temperature=27;
        if (temperature<=0){
            System.out.println("Water will freeze with temperature"+temperature+"C");
        }
        else{
            System.out.println("Water will not freeze with temperature "+temperature+" C");
        }
    }
}
