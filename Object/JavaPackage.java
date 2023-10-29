package Object;
import java.util.Scanner;

public class JavaPackage {
    /*
     * Packages in java are just a bunch of related classes (like a folder)
     * Packages are maintainable code.
     * There are built-in packages from java API or user defined like the folder i made (OBject)
     * You can import a package or a single class
     * 
     * Syntax: import package.name.Class
     *         import package.name*
     * 
     * Scanner class allows u to get user input
     */

     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Username");

        String userName = obj.nextLine();
        obj.close();
        System.out.println("Username is: " + userName);
     }
}

