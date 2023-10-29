package Method;

public class Recursion {
    public static void main(String[] args) {
        /*
         * Recursion is the technique where you make a function call itself
         * It simplifies problems (yay)
         */

         /*
          * Example. Adding two numbers is easy, but adding a range of numbers is a bit more complex
          recursion is used to add a range of numbers by breaking it down into the task of adding two numbers
          */

          // Use recursion to add all of the numbers up to 10
    }

    //Add all numbers up to k
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        }
        else {
            return 0;
        }
    }

    // Recursive functions do need a halting condition so it doesnt ininitely keep calling itself

    // Use recursion to add all numbers between 5 and 10

    static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        }

        else {
            return end;
        }
    }
}

