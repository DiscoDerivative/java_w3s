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
            System.out.println(i);
         }

         /*
          * They can also be used in while loops too.
          */
    }
}
