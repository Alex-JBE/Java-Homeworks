import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // Даны два действительных числа.
        // Найти среднее арифметическое этих чисел.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1");
        double num1 = scanner.nextInt();
        System.out.println("Input number2");
        double num2 = scanner.nextInt();
        double avg = (num1 + num2) / 2;
        System.out.println("avg = " + avg);

        }

    }

