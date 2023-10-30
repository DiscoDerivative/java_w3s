package EnterInformation;

public class Information {
    private String name;
    private int age;

    // Giving the name read access
    public String getName() {
        return name;
    }

    // Giving the name write access
    public void setName(String newName){
        this.name = newName;
    }

    // Giving the age read access
    public int getAge() {
        return age;
    }

    // Giving the name write access
    public void setAge(int newAge) {
        this.age = newAge;
    }
}
