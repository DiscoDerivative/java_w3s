public class For {
    public static void main(String[] args) {
        /*
         * When you know exactly how many times you want to loop through
         * A block of code, use the for loop
         */

         //Counting from 1 to 10
         for (int i = 0; i < 10; i++)
         {
            System.out.println(i + 1);
         }

         //Counting down from 5 to 0

         for (int i = 5; i > 0; i--)
         {
            System.out.println(i);
         }

         // Nested loop. Make a 3 by 4 grid

         for (int i = 0; i < 3; i++)
         {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("#");
            }
            System.err.print("\n");
         }
    }
}
