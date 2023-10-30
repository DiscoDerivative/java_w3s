package PracticeEnums;

public class Main {

    enum Level {
        LOW,
        HIGH
    }

    public static void main(String[] args) {
        Level var = Level.HIGH;
        switch(var) {
            case LOW:
             System.out.println("Low Level");
             break;
            case HIGH:
             System.out.println("High Level");
             break;
            default: System.out.println("Unknown Level");
        }
    

        for (Level i : Level.values()) {
            System.out.println(i);
        }
    }
}
