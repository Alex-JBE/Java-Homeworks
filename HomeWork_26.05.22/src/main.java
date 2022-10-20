public class main {
    ////Написать метод вычисляющий выражение a * (b + (c / d))
    // и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    public static void main(String[] args) {
        int result = term(2,3,40,20);
        System.out.println(result);

    }
    private static int term(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return result;

    }
}