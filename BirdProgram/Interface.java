package BirdProgram;

public class Interface {

     // Prints a statement that verifies it's a mammal.
     interface Mammal {
        public void description();
     }

     // A statement signaling that it's currently flying
     interface WingedAnimal {
        public void flying();
     }

     // Description of a bird via interfaces
    class Bird implements Mammal, WingedAnimal {
        public void description() {
            System.out.println("This animal is a mammal.");
        }

        public void flying() {
            System.out.println("Flapping my wings!");
        }
    }
}

    class Main {
        public static void main(String[] args) {
            Bird monkParakeet = new Bird();
            monkParakeet.description();
            monkParakeet.flying();
        }
    }

