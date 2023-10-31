package Exception;

public class Main {
    /*
     * You can throw exceptions (errors)
     */

     /*
      * Try and catch
      try lets you define a block of code to be tested
      catch lets you define a block of code to be executed if an error occurs in the try
      block
      */

      public static void main(String[] args) {
        
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[10]);
        }

        catch(Exception e) {
            System.out.println("Something went wrong");
        }

        finally {
            System.out.println("The 'try catch' is finished");

            checkAge(19);
        }

        /*
         * Throw keyword lets you make custom errors
         * Exception types to be used with throw...
         * ArithmeticException
         * FileNotFoundEception
         * ArrayIndexOutOfBoundsException
         * SecurityException etc.
         */

         // Throw an example if age is below 18 (print access denied)
         // If age is older than 18 print access granted
      }

        static void checkAge(int age) {
            if (age < 18) {
                throw new ArithmeticException("Access denied- you're not old enough");
            }
            else {
                System.out.println("Access granted - You are old enough");
            }
         }
}
