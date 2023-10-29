package Object;

public class Encap {
    public static void main(String[] args) {

        Person name = new Person();

        // Old way
     //   name.name = "John"; throws error cause its private

        // New way
        name.setName("John");
        System.out.println(name.getName());
    }
}
