package Conditional;

public class TarnarySample {
    public static void main(String[] args) {

        int num = 10;

        String s = (num % 3 == 0) ? "Even" : "odd";

        System.out.println(s);
    }
}
