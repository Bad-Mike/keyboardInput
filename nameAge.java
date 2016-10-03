package scanner;

//it's impotant to import the java class, if you will use Keyboard input with Scanner
import java.util.Scanner;

/**
 * Created by mike on 03.10.16.
 */
public class nameAge {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);     //system.in specifies the keyboard for input

        System.out.print("Your name: ");
        String name = input.next();     //input name(text) from a user

        System.out.print("Your age: ");
        int age = input.nextInt();      //input age(number) from a user

        System.out.println();
        System.out.println("Name: " + name);    //output name
        System.out.println("Age: " + age);      //output age

    }
}
