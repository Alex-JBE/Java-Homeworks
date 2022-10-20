import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        //Write a program that asks the user’s name
        //and displays “Your name start with char …..” on the screen.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scanner.nextLine();

        System.out.println("Your name start with char " + name.charAt(0));
    }
}
