import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        // Дана длина ребра куба;
        // Найти объем куба и площадь его боковой поверхности.
        // Формула объема куба: v = a3,
        // где V - объем куба, a - длина ребра куба.
        // Пощадь его боковой поверхности: s = 4 x a x a.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        double a = scanner.nextInt();
        double v = Math.pow(a, 3);
        double s = 4 * a * a;
        System.out.println("v = " + Math.pow(a, 3));
        System.out.println("s = " + s);

    }
}
