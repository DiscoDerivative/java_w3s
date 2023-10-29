public class Boolean {
    public static void main(String[] args) {
        /*
         * A boolean expression returns a boolean value
         * Using a comparison operator can do that
         */

         System.out.println(5 < 6);

         // Real Life Example: Find out of someone is old enough to volt

         int age = 19;
         int votingAge = 18;
         
         if (age >= votingAge)
         {
            System.out.println("You are old enough to vote.");
         }
         else 
         {
            System.out.println("You are not old enough to vote.");
         }
    }
}
