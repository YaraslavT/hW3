public class Main {
    public static void main(String[] args) {
        int salary = 65535;
        int total = 0;
        int i = 0;

        String s = "";
        String S = "";

        while (i < 10) {
            i++;
            s += i + " ";

        }
        System.out.println(s);

        for (int I = 10; I > 0; I--) {
            S += I + " ";
        }
        System.out.println(S);


    }
}