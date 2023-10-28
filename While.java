public class While {
    public static void main(String[] args) {
        /*
         * While loop loops through a block of code as long as a condition is true
         */

        //Lets loop some meows three times

        int i = 0;
        while(i < 3) {
            System.out.println("meow");
            i++;
        }

        /*
         * Do/while is a variant of while loop. The do/while will loop once regardless of condition, 
         * then it repeats as long as condition is true
         */

         int pizzaSlices = 8;
         System.out.println("Wow, there are 8 slices of pizza!");

         do {
            System.out.println("*MUNCH*. A mysterious voice says there are " + pizzaSlices + " left");
            pizzaSlices--;
         }while(pizzaSlices > 0);
    }
}
