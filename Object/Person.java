package Object;

public class Person {
    /*
     * Encapsulation is to make sure that sensitive data is 
     * hidden from users
     * To do this, declare class attributes as private
     * Provide public get and set emthods to access and update the value
     * Of a private variable
     */
    
     /*
      * Get and Set
      Private variables can only be access within the same class
      (Outside class has no access)
      Only possible to access with get and set
      Get method returns the variable value and set method sets the value
      Syntax: get(identifier) or set(identifier)
      */
        private String name;

        public String getName() {
            return name; // returns value of var name
        }

        public void setName(String newName) {
            this.name = newName; //takes a parameter and assigns it to name variable
        }
    }

