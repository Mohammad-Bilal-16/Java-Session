package Conditional;

public class OddEven {
    public static void main(String[] args) {

        int num = 10;  // unary -> i++ | Binary = | tarnery -> ? :

        if(num % 3 != 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
