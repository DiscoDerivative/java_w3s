package Method;


public class Methods {

    static void myMethod(String fname, int age) {
        System.out.println("My first name is " + fname + ". I am " + age);
    }

    static int square(int num1) {
        return num1 * num1;
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough.");
        }
        else {
            System.out.println("Access granted.");
        }
    }

    static int addingNumbers(int x, int y) {
        return x + y;
    }

    static double addingNumbers(double x, double y) {
        return x + y;
    }

    public static void main(String[] args)
    {
        /*
         * A method is a block of code that only runs when called.
         * You can pass data, known as parameters into amethod
         * They are used to perform certain actions, and are also called functions
         * Use methods to resude code. When you do this u can call it as many times as you want
         */

          /*
           * Creating a method
           * Methods must be declared within a class.
           * Syntax is static void myMethod() {}
           */

           myMethod("Margaret", 19);
           myMethod("Leo", 11);
           myMethod("Stacy", 26);

           /*
            * Method Parameters
            They act as variables that you can place within the parenthesis to be used in the method code block
            */
            System.out.println(square(5));

            // Better to store return values in variables so its neat
            int sum = add(5, 2);    
            System.out.println(sum);

            // Its common to use if else statements in methods

            checkAge(19);

            // Method Overloading
            /*
             * You can create two or more methods with the same name instead of creating two different methods
             */

            System.out.println(addingNumbers(1, 3));
            System.out.println(addingNumbers(2.5, 2.5));

    }
}
