package EnterInformation;

public class Main {
    public static void main(String[] args) {

        // Created an object, person
        Information person = new Information();

        person.setName("Margaret");
        person.setAge(19);

        System.out.println("First name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
