package DataStructure;

import java.util.HashMap;
import java.util.HashSet;

public class Main2 {

    public static void main(String[] args) {
    // Hash map stores things in keysand values

    //Example: HASH MAP OF CAPITAL CITIES
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add countries and values (country, city)
    capitalCities.put("England", "London");
    capitalCities.put("Canada", "Ottawa");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);

    // to access a value in the hashmap, get the key
    // example getting ottawa
    capitalCities.get("Canada");

    // removing an item, remove the key
    capitalCities.remove("USA");
    
    // removing all items, use clear
    capitalCities.clear();

    // finding hash map size, use size

    capitalCities.size();

    // use for each to loop through hash map

    HashMap<String, Integer> studentID = new HashMap<String, Integer>();
    studentID.put("Margaret", 2221);
    studentID.put("John", 2222);

    // use keyset if you only want the keys and values if you only want the values

    System.out.println("Student Information\n");
    for(String i : studentID.keySet()) {
        System.out.println("Name: " + i + "\nStudent ID: " + studentID.get(i) + '\n');
    }

    // Hash Maps: collection of unique items

    HashSet<String> cars = new HashSet<String>();
    cars.add("Honda Civic");
    cars.add("BMW");
    cars.add("Honda Civic"); // Only prints it out once since it has to be unique
    System.out.println(cars);

    // Check if an item exists

    System.out.println(cars.contains("Honda Civic"));

    cars.remove("BMW");
    cars.clear();
    cars.size();

    for (String i : cars) {
        System.out.println(i);
    }
    }

}
