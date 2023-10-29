package Method;
// Calls itself until it gets home based on location and house

public class WalkingHome {
    public static void main(String[] args) {
        System.out.println(goHome(10, 10));
    }

static int goHome (int currentLocation, int house) {
    if (currentLocation == house) {
        System.out.println("You are home. At Position ");
        return 10;
    }
    // It keeps going up by 1 until it gets home

    System.out.println("Walked 1 step.");
    return goHome(currentLocation + 1, house);
}
}

