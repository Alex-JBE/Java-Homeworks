public class Main2 {

    public static void main(String[] args) {
        System.out.println(searchUniqueChar2("leetcode"));
        System.out.println(searchUniqueChar2("loveleetcod"));
        System.out.println(searchUniqueChar2("aabb"));
    }

    private static int searchUniqueChar(String s) {
        int index = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c1 = s.charAt(i);
            int j;
            for (j = 0; j < length; j++) {
                // ����� ���������, ��� �� �� ��������� ������ ���
                // � �����
                if (i == j) {
                    continue;
                }
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    // ������ �1 �� ����������
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
                // ����� ���������, ��� �� �� ��������� ������ ���
                // � �����
                if (i == j) {
                    continue;
                }
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    // ������ �1 �� ����������
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

}

















