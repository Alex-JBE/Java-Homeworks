import java.util.Arrays;
import java.util.Scanner;

public class homework02 {
    // calculate the area of rectangle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        int A = a * b;
        System.out.println("The area of the rectangle with sides a and b is " + A + " cm");
    }
}
