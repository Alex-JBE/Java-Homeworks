public class Main2 {

    public static void main(String[] args) {
        task1(true, true);
        task1(true, false);
        task1(false, true);
        task1(false, false);

    }

    public static void task1(boolean isWeekend,boolean isRain) {
        boolean canWalk = isWeekend && !isRain;
        System.out.println(canWalk);

    }
}
