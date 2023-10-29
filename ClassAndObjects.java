public class ClassAndObjects {

    static void myMethod() {
         System.out.println("Hello, World");
    }

    // Public methods need to be called using an object 
    // Static methods dont need an object to be called

    public void myPublicMethod() {
        System.out.println("Static method");
    }

    static void myStaticMethod() {
        System.out.println("Public method");
    }


    // Variables are attributes of a class or fields
        int x = 5;
        public static void main(String[] args) {

            /*
             * Classes are like a template for making objects
             * You can make many objects from one class
             */

        ClassAndObjects object = new ClassAndObjects();
        System.out.println(object.x);

        /*
         * You can create an object of a class and access it in another class. This is
         * better for organization of classes (one class hass all the attributes and methods
         * while the other holds the main() method the code thats executed)
         * 
         * The name of the java file should match the class name
         */

         object.x = 10;
         System.out.println(object.x);


         // Class methods
         myMethod();
         myStaticMethod();
         object.myPublicMethod();
    }
}

