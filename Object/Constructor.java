package Object;
public class Constructor {
    int x;
    String modelName;
    /*
     * A constructor in Java is a special method used to intialize objects
     * The constructor is called when an object of a class is made
     * It can be used to set default values of class attributes
     * Syntax: public file()
     */

     public Constructor(int y, String name) {
        x = y;
        modelName = name;
     }

     public static void main(String[] args) {
        Constructor obj = new Constructor(10 , "Honda Civic");
        System.out.println(obj.x);
        System.err.println(obj.modelName);
     }

     /*
      * All objects have constructors by default. Its just that this is the first time we set a value to it
        They also can take parameters
      */
}
