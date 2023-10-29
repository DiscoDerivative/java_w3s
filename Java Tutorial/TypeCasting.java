public class TypeCasting {
    public static void main(String[] args){
        /*
         * Type casting is when you assign a value of a primitive data type to other type
         * There are two types of casting 
         * Widening: automatically converts a smaller type to a larger type size
         * byte -> short -> char -> int -> long -> float -> double
         * Narrowing Casting:  Manually converting a larger type to a smaller size
         * double -> float -> long -> int -> char -> short -> byte
         */
        
         //Example of widening
         int myInt = 9;
         double myDouble = myInt;
         System.out.println(myInt);
         System.out.println(myDouble);

         //Example of narrowing

         double myDouble1 = 4.04d;
         int myInt1 = (int) myDouble1;

         System.out.println(myDouble1);
         System.out.println(myInt1);
    }
}
