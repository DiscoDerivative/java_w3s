public class MathMethod {
    public static void main(String[] args) {
        /*
         * Java math class has methods used to perform mathematical tasks on numbers
         * Math.max(x, y) method can be used to find the highest value of x and y
         * Math.min(x, y) finds the lowest value of x and y
         */

         System.out.println(Math.max(1, 10));
         System.out.println(Math.min(1, 10));

         
        // To find the square root of a number use Math.sqrt(x)
     
         System.out.println(Math.sqrt(144));

         // To find the absoltute value of a number use Math.abs(x)

         System.out.println(Math.abs(-5));

         // To return a random numer use Math.random() 
         // By default it's only through 0-1 inclusive (decimal) but to gain more control do
         // Math.random() * (range + 1)

         int rollDice = (int)(Math.random() * 7);
         System.out.println(rollDice);
    }
}
