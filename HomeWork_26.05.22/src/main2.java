import java.util.Scanner;

public class main2 {
    /*Напишите метод, которому в качестве параметра передаётся строка,
    обозначающая имя. Метод должен вернуть приветственное сообщение:
    «Hello, переданное_имя!».
    Выведи приветствие в консоль.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello " + fname + " " + lname + "!");
    }
}
