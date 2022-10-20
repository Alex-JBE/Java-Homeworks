import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(3);
        int number = getNumber2(a);
        System.out.println(number);
        System.out.println(getArrayList(number));

    }

    private static int getNumber2(ArrayList<Integer> a) {
        int answer = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            answer = answer + a.get(i) * (int) Math.pow(10, a.size() - i - 1);
        }
        return answer;
    }


    private static ArrayList<Integer> getArrayList(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        String str = String.valueOf(n);
        for (int i =0; i < str.length(); i++) {
            Integer.parseInt("" + str.charAt(i));
            Integer integer =Integer.getInteger("" + str.charAt(i));
            answer.add(integer);
        }
        return answer;


    }
}
