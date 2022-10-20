import java.util.Scanner;

public class homework01 {

    public static void main(String[] args) {
        /*
        Write a program that obtains two
        integers from user and displays (for 500 and 125):
        number1=500   number2=125
        500+125=625
        500-125=375
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int number1 = scanner.nextInt();
        System.out.println("Input second number");
        int number2 = scanner.nextInt();
        System.out.println("number1 = " + number1 + "  " + "number2 = " + number2);
        int add = number1 + number2;
        int dif = number1 - number2;
        System.out.println(number1 + "+" + number2 + "=" + add);
        System.out.println(number1 + "-" + number2 + "=" + dif);
    }
}