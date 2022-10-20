import java.util.Scanner;

public class homework04 {

    public static void main(String[] args) {
        // Calculate the amount of excess calories
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input d2");
        int d2 = scanner.nextInt();
        int a, d1, r1, r2;
        a = 2;
        d1 = 24;
        r1 = d1 / a;
        r2 = d2 / a;
        double A1, A2, dif, K;
        A1 = Math.PI * Math.pow(r1, a); // The area of circle with a diameter of 24 cm
        A2 = Math.PI * Math.pow(r2, a); // Area of circle with a diameter entered from the keyboard
        dif = A2 - A1;
        K = dif * 40; // Calculating the number of calories
        System.out.printf("The amount of excess calories is " + "%.2f", K);

    }
}
