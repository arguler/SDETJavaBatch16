package class2;
public class VariableValues {
    public static void main(String[] args) {
        byte age=12;                          byte AGE=22;
        int birthyear=1978;                   int birthday=1983;
        short apples=67;                      short peanut=23;
        long moneyinthebank=1000000000000l;   long moneyinthewallet=1000000l;
        boolean areyoumarried=true;           boolean areyouhappy=false;
        char yesorno='n';                     char nooryes='y';
        float decimal=10.1F;                  float height=3.45F;
        double pi=3.14569;                    double sigma=45.58964;
        System.out.println(age +" \t" + AGE);                       System.out.println(birthyear +" \t" + birthday);
        System.out.println(apples +" \t" + peanut);                 System.out.println(moneyinthebank +" \t" + moneyinthewallet );
        System.out.println(areyoumarried +" \t" +  areyouhappy);    System.out.println(yesorno +" \t" + nooryes);
        System.out.println(decimal +" \t" + height);                System.out.println(pi +" \t" + sigma + "\n");

        age=25; birthday=2010; apples=76; moneyinthebank=0; areyouhappy=true; nooryes='h'; decimal=4.5F; sigma=8.965;
        System.out.println(age);            System.out.println(birthday);
        System.out.println(apples);         System.out.println(moneyinthebank);
        System.out.println(areyouhappy);    System.out.println(nooryes);
        System.out.println(decimal);        System.out.println(sigma);
    }
}
