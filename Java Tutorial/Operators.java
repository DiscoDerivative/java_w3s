public class Operators {
    public static void main(String[] args) {
        int x = 100 + 50;
        System.out.println(x);

        /*
         * Java divides operators in following groups
         * Arithmetic operators
         * Assignment operators
         * Comparison operators
         * Logical operators
         * Bitwise operators
         */

         /*
          * Arithmetic operators are used to perform common mathemetical opperations
          + addition -> x + y
          - subtraction -> x - y
          * multiplcation -> x * y
          / division -> x / y
          % modulus -> returns the division remainder
          ++ increment -> increases value by 1 ++x
          -- decrement -> decreases the value of a variable by 1
          */

          /*
           * Assignment operators are used to assign values to variables
           * The equal sign is the assignment operator (=)
           */

           int age = 19;
           System.out.println(age);

           /*
            * There are arithmetic assignment operators as well.
              For example x+=3 is the same as x = x + 3
              Some new ones are from the assignment bitwise operators
              |= bitwise or -> if either of the bits is 1, it returns 1 else 0
              ^= bitwise XOR -> if both bits are different, it returns 1 else 0
              &= bitwise and -> if both bits are 1, it returns 1 else it shows 0
              >>= shifts the bits of a number left or write (multiple or divide by )
              <<= 
            */

            //Shifts by 2^n spots where n equals the number you shift by

            int one = 1;
            System.out.println(one <<= 4);

            /*
             * Comparison Operators
             * Allows you to compare to values or variables
             * They return true or false (1 or 0)
             * == - equal to
             * != - not equal
             * > - greater than
             * < - less than
             * >= - greater or equal than
             * <= - less or equal than
             */

             /*
              * Logical operators
              && - logical and
              || - logical or
              ! - logical not
              */




    }
}
