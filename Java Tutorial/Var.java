public class Var {
    public static void main(String[] args) {
        /*
         * In Java, there are different types of variables
         * String - stores text
         * int - Stores integers 
         * float - stores floating point numbers
         * char - stores single characters
         * boolean - stores values with two states (true or false)
         */

         String name = "Margaret";
         System.out.println(name);

         final int myNum = 15;
         System.out.println(myNum);

         final float decimal = 20.5f;
         final char letter = 'A';
         final boolean eaten = true;

         System.out.println(decimal);
         System.out.println(letter);
         System.out.println(eaten);

         System.out.println(name + " is not " + myNum);

         int x = 1, y = 2, z = 3;
         System.out.println(x + y + z);

         int a, b, c;
         a = b = c = 10;
         System.out.println(a + b + c);

         //Use descriptive identifiers
         //Make sure it starts with a lowercase letter
    }
}
