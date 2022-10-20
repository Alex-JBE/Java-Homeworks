import java.util.HashMap;
import java.util.Map;

// Second level: Given two integer arrays nums1 and nums2,
// return an array of their intersection.
// Each element in the result must appear as many times
// as it shows in both arrays and you may return
// the result in any order.

 // Example 1:
 // Input: nums1 = [1,2,2,1], nums2 = [2,2]
 // Output: [2,2]

 // Example 2:
 //  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 //  Output: [4,9]
 //  Explanation: [9,4] is also accepted.

public class Main {

    public static void main(String[] args) {
        int[] array1 = {4,9,5};
        int[] array2 = {9,4,9,8,4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {

            map.put(array1[i], map.getOrDefault(array1[i], 0) + 1);
        }
        for (int i = 0; i < array2.length; i++) {
            if (map.containsKey(array2[i]) && map.get(array2[i]) > 0) {
                System.out.println(array2[i]);
                map.put(array2[i], map.get(array2[i]) - 1);
            }
        }
    }
}

