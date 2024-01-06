package Conditional;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;

public class TarnarySample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);






/*        int num = 10;

        String s = (num % 3 == 0) ? "Even" : "odd";

        System.out.println(s);*/

        // &&  , || , ^ , !!

       // A && B -> False
                int A = 1;
                int B = 2;
                int C = 3;

        /**   AND
         *  A   B   A&&B
         *  1   0 -> 0 false
         *  0   1 -> 0 false
         *  0   0 -> 0 false
         *  1   1 -> 1 true
         */
  /*      if(A < B && B > C){
                   System.out.println("Enter AND Here");
               }else{
                   System.out.println("Logical AND Volition of TRUTH Table");
               }*/

        /**  OR
         *  A   B   A&&B
         *  1   0 -> 1 true
         *  0   1 -> 1 true
         *  0   0 -> 0 false
         *  1   1 -> 1 true
         */

     /*   if(A > B || B > C){
            System.out.println("Enter OR Here");
        }else{
            System.out.println("Logical OR Volition of TRUTH Table");
        }*/

        /**  XOR
         *  A   B   A&&B
         *  1   0 -> 1 true
         *  0   1 -> 1 true
         *  0   0 -> 0 false
         *  1   1 -> 1 false
         */

        if(A > B ^ B < C){
            System.out.println("Enter XOR Here");
        }else{
            System.out.println("Logical XOR Volition of TRUTH Table");
        }

        // NOT
        /**  XOR
         *  A   B
         *  1   0
         *  0   1
         */


        if(!(A > B)){
            System.out.println("TRUE");
        }else {
            System.out.println("False");
        }



    }
}
