import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(searchUniqueChar3("leetcode"));
        System.out.println(searchUniqueChar3("loveleetcod"));
        System.out.println(searchUniqueChar3("aabb"));
    }

    private static int searchUniqueChar(String s) {
        int index = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i);
            int j;
            for (j = 0; j < length; j++) {
                // Нужно проверить, что мы не проверяем символ сам
                // с собой
                if (i == j) {
                    continue;
                }
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    // Символ с1 не уникальный
                    break;
                }
            }
            if (j == length) {
                return i;
            }
        }
        return index;
    }

    private static int searchUniqueChar2(String s) {
        int index = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < length; j++) {
                // Нужно проверить, что мы не проверяем символ сам
                // с собой
                if (i == j) {
                    continue;
                }
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    // Символ с1 не уникальный
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return index;
    }

    private static int searchUniqueChar3(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}

