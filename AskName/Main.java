package AskName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner askName = new Scanner(System.in);
        System.out.print("Enter name: ");
        
        String username = askName.nextLine();
        askName.close();
        System.out.println("Hello, " + username + '!');
    }
}
