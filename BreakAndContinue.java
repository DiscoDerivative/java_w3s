public class BreakAndContinue {
    public static void main(String[] args) {
        /*
         * Break statements can be to jump out of a loop
         */

         // This example stops if i equals 4.

         for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
         }

         // The continue statement breaks one iteration in the loop if a condition occurs
         // Then continues with the next iteration
         // This example skips the value of 4

         for (int i = 0; i < 10; i++)
         {
            if (i == 4) {
                continue;
            }
      //      System.out.println(i);
         }

         /*
          * They can also be used in while loops too.
          */

          //Lets count 10 numbers, if a number equals 0, skip and if a num equals 6 then leave.

          int i = 0;
          while (i < 10) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
          }
    }
}
