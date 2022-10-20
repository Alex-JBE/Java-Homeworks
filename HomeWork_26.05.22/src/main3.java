import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        task6();
        /*Напишите метод, присваивающий переменной a
        случайное значение из диапазона с плавающей точкой,
        и выведи округлённое до 3 знаков после запятой.*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Input any floating point number");
        double a = scanner.nextDouble();
        System.out.printf("%.3f", a);*/
    }

    private static void task6() {
        /*double a = Math.random();*/

        double a = 100 * Math.random(); // от 0 до 100
        System.out.println(String.format("%.3f", a));
    }
}
