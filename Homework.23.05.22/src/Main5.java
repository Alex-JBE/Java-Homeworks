import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        // Даны два катета треугольника.
        // Найти гипотенузу используя теорему Пифагора.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1");
        int num1 = scanner.nextInt();
        System.out.println("Input number2");
        int num2 = scanner.nextInt();
        double avg = ((double) num1 + (double) num2) / 2;
        System.out.println("avg = " + avg);

        System.out.println("Hyp = " + Math.sqrt(num1 * num1 + num2 * num2));
        System.out.println("Hyp = " + Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2)));
    }

}