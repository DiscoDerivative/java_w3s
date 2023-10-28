public class IfElse {
    public static void main(String[] args) {
        
        /*
         * If Statement: specify a block of java code to be executed if condition is true
         */

        if (1 > 0) {
            System.out.println("1 is greater than 0");
        }

        int time = 20;
        if (time < 12) {
            System.out.println("Good morning");
        }
        else if (time < 18) {
            System.out.println("Good afternoon.");
        }
        else {
            System.out.println("Good evening.");
        }

    /*
     * There is a shortcte to using if else, known as the ternary operator
     * It looks like this
     * var = condition ? expressionTrue : expressionFalse
     * 
     * It takes the condition, if its true it reads out the first expression, if not reads out the last
     */

     int num = 4;
     String result = (num > 5) ? "This number is larger than 5" : "This number is smaller than 5";
     System.out.println(result);
    }
}