package DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    /*
     * Array list is a resizable array. So it's a modifiable array.
     */
    public static void main(String[] args) {
        
    // Adding Items
     ArrayList<String> cars = new ArrayList<String>();
     cars.add("Honda");
     cars.add("BMW");
     cars.add("Audi");
    
     ArrayList<String> birds = new ArrayList<String>();
     birds.add("Monk Parakeet");
     birds.add("Robin");
     birds.add("Blue Jay");

     System.out.println(cars);
     System.out.println(birds);

     // Access

     cars.get(0);
     System.out.println(cars.get(0));

     cars.set(0, "Hyundai");
     System.out.println(cars.get(0));
     
     cars.remove(0);
     System.out.println(cars);

     cars.clear();
     System.out.println(cars);

     // Loop

     for(int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
     }

     for (String i : cars) {
        System.out.println(i);
     }

     // Array List

     ArrayList<Integer> numbers = new ArrayList<Integer>();
     numbers.add(5);
     numbers.add(2);
     numbers.add(28);

     for (int i : numbers) {
        System.out.println(i);
     }

     // Sorting
     Collections.sort(numbers);
     for (int i : numbers) {
        System.out.println(i);
     }

     // Linked List 

     LinkedList<Integer> familyAges = new LinkedList<Integer>();

     familyAges.add(19);
     familyAges.add(24);
     familyAges.add(59);
     familyAges.add(46);
     familyAges.add(6);
     System.out.println(familyAges);

     //Linked List Methods

     familyAges.addFirst(0);
     familyAges.addLast(0);
     familyAges.removeFirst();
     familyAges.removeLast();
     familyAges.getFirst();
     familyAges.getLast();

    }

}
