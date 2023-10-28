public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

    /*A string in java is actuall an object. it contains methods that can be used to 
    perform certain operations on strings. The length of the string can be found using
    the length() method
     */

     String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     System.out.println("The length of the string is: " + txt.length());

     /*
      * You can change a string to upper case and to lower case using the
        toUpperCase() and toLowerCose() methods
      */

     String hello = "Hello World";
     System.out.println(hello.toUpperCase());
     System.out.println(hello.toLowerCase());

     /*
      * To find index of where a string begins, use indexOf() method
      */

      String findLocate = "Please locate where 'locate' occurs!";
      System.out.println(findLocate.indexOf("locate"));

      /*
       * String concatenation
       * The + operator can be used between strings to combine them
       * This is called concatenation
       */

       String firstName = "John";
       String lastName = "Doe";
       System.out.println(firstName + " " + lastName);

        // You can also use the concat() method to concatenate two strings

       System.out.println(firstName.concat(lastName));

       /*
        * Adding numbers and strings
        Java uses the + operator for both addition and concatenation
        Numbers are added. Strings are concatenated
        */

        // Adding two numbers defined by a numerical data type produces a number
        int a = 1;
        int b = 1;
        int c = a + b; // c will be 2
        System.out.println(c);

        // Adding two numbers defined by string concatenates both numbers into a string
        /* 
        String x = "10";
        String y = "20";
        String z = x + y; // z will be 1020

        // Adding a string and a number concatenates them and produces a string

        String number = 5;
        String num = 10;

        String result = number + num; // produces "510"
        */

        /*
         * Special Characters
         * When using quotes, you need to use a backslash
         * Example "She said, \"Hello\"."
         */

         String quote = "She said, \"Hello\".";
         System.out.println(quote);
    }
}
