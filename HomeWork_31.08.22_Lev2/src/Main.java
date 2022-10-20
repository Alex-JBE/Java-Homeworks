import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        shift1(list, 7);
//        System.out.println(list);
        System.out.println(shift2(list, 7));
    }

    private static void shift1(ArrayList<Integer> list, int k) {
        k = k % list.size();
        for (int i = 0; i < k; i++) {
            int last = list.get(list.size() - 1);
            list.add(0, last);
            list.remove(list.size() - 1);
        }
    }

    private static ArrayList<Integer> shift2(ArrayList<Integer> list, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int j = -k;
        while (j < 0) {
            j += list.size();
        }
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get((i + j) % list.size()));
            list.add(4);
            list.add(4);
            int count = 1;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) != list.get(i + 1)) {
                    list.set(count, list.get(i + 1));
                    count++;
                }
            }
            return result;
            System.out.println(list);
            System.out.println(count);
            System.out.println(list.subList(0, count));
        }

    }
}