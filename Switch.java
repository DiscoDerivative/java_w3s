public class Switch {
    public static void main(String[] args) {
        /*
         * Instead of writing many if else statements you can use the switch statement
         * 
         */

         // Let's say Happy (day) based on the days of the week

         String day = "Monday";

         switch(day) {
            case "Monday":
                System.out.println("Happy" + " " + day);
                break;
            case "Tuesday":
                System.out.println("Happy" + " " + day);
                break;
            case "Wednesday":
                System.out.println("Happy" + " " + day);
                break;
            case "Thursday":
                System.out.println("Happy" + " " + day);
                break;
            case "Friday":
                System.out.println("Happy" + " " + day);
                break;
            case "Saturday":
                System.out.println("Happy" + " " + day);
                break;
            case "Sunday":
                System.out.println("Happy" + " " + day);
                break;
            default: 
                System.out.println("Hey!");
         }

        
    }
}
