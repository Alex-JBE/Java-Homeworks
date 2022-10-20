import java.util.Scanner;

public class homework03 {
    //calculate the area of circle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input r");
        int a, r;
        a = 2;
        r = scanner.nextInt();
        double A = Math.PI * Math.pow(r, a);
        System.out.printf("The area of the circle is " + "%.2f", A);
    }
}
