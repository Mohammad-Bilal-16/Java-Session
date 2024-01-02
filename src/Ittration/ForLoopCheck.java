package Ittration;


public class ForLoopCheck {
    public static void main(String[] args) {

        //TODO: -> For LOOP's
        /**
         * 1. What is loop?
         * 2. Why loop?
         */

        // 1, 2 ,3 ,4 ...........
       // System.out.println(1+ " " +3);

        /**
         * 1. Initilization -> Decleration as Assigning value
         */

    /*    for(1. Initilization  ; 2. Condition_Checking ;   4. Incremet / Decrement /update)
        {
            3. Entering to Loop
        }*/

        //1 less than 10 print 1 to 10

        //1 loop 1. i --> 1  | 2.( 1 <= 5 -> true) |  3. entered in loop --> (1st) print | 4. i = 1 + 1 --> 2 | i --> 2
        //2 loop 2. i --> 2  | 2.( 2 <= 5 -> true) |  3. entered in loop --> (2nd) print | 4. i = 2 + 1 --> 3 | i --> 3
        //3 loop 3. i --> 3  | 2.( 3 <= 5 -> true) |  3. entered in loop --> (3rd) print | 4. i = 3 + 1 --> 4 | i --> 4
        //4 loop 4. i --> 4  | 2.( 4 <= 5 -> true) |  3. entered in loop --> (4rd) print | 4. i = 4 + 1 --> 5 | i --> 5
        //5 loop 5. i --> 5  | 2.( 5 <= 5 -> true) |  3. entered in loop --> (5rd) print | 4. i = 5 + 1 --> 6 | i --> 6
        //5 loop 6. i --> 6  | 2.( 6 <= 5 -> false) |  loop terminated here!!!


        for(int i = 1 ; i <= 5 ; i++)
        {
            System.out.print(i + ", " );
        }
        //1 to 100;

    }

}
