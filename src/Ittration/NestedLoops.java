package Ittration;

public class NestedLoops {
    public static void main(String[] args) {
        //1 loop 1. i --> 0  | 2.( 1 <= 3 -> true) |  3. entered in loop --> (1st)  | 4. i = 1 + 1 --> 2 | i --> 2
        for(int i = 0 ; i <= 3 ; i++)
        {
            System.out.println(i + " i <-- ");

            for(int j = 1 ; j <= 3 ; j++)
            {
                System.out.println(i + " i ----- j " + j);
            }
        }
    }
}
