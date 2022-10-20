import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that asks the user’s name
        // and displays “Hello …….. !” on the screen.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        }
}
