public class ForEach {
    public static void main(String[] args) {
        /*
         * In java, for each is exclusively used to loop through elements in array
         * for (type variableName : arrayName) {
         * //code to be executes
         * }
         */

        //Lets loop through a cars array
        // Variable name can be substituted with i

        String[] cars = {"Volvo", "BMW", "FORD", "Madza"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
