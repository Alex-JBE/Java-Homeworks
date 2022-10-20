import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        double value = 34.766674;
         String result = String.format("%.3f",value);
         System.out.print(result);//  34,767

        /*double value = 34.766674;
        System.out.printf("%.3f",value);

        double value = 34.766674;
        System.out.format("%.3f",value);

        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        String s = scanner.nextLine();
        System.out.println(s);*/

    }
}
