package ScannerDemo;

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Int value");
        int i = scan.nextInt();
        System.out.println();

        System.out.println("Enter the String value for S");
        String s = scan.nextLine();
        System.out.println();

        System.out.println("Enter the String value for S1");
        String s1 = scan.next();

        System.out.println("Enter the float value for f");
        float f = scan.nextFloat();

        System.out.println("Enter the double value for d");
        double d = scan.nextDouble();

        System.out.println("Enter the LONG value for l");
        Long l = scan.nextLong();

        System.out.println("Data of LONG -> " + l);
        System.out.println("Data of float -> " + d);
        System.out.println("Data of float -> " + f);
        System.out.println("Data of i -> " +  i);
        System.out.println("Data of s -> " +  s);
        System.out.println("Data of s1 -> " +  s1);

    }
}
