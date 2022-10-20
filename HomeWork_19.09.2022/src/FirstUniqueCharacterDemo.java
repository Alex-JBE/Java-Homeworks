import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueCharacterDemo {

    public static void main (String[] args) {
        String input1 = "leetcode";
        String input2 = "loveleetcode";
        String input3 = "aabb";

        Map<Character, CharacterCount> charMap = new LinkedHashMap<>();

        for (int i = 0; i < input1.length(); i++) {

            char c = input1.charAt(i);

            CharacterCount current = new CharacterCount(c, i, 1); // records are immutable
            CharacterCount previous = charMap.put(c, current);
            if(previous != null) {
                current = current.merge(previous); // combine records (add 1 to count and keep lower index)
                charMap.replace(c, current);
            }
        }

        Entry<Character, CharacterCount> lowestIndex = charMap.entrySet().stream()
                .filter(recordsWithOneEntry -> recordsWithOneEntry.getValue().count() == 1)
                .min(Map.Entry.comparingByValue(Comparator.comparingInt(CharacterCount::index))).orElse(null); // This will return either the CharacterCount record or null if none are found with a count of 1.

        System.out.println(lowestIndex);

    }

    public static record CharacterCount(char character, int index, int count) {
        public boolean isIndexGreater(int index) {
            return this.index > index;
        }

        public CharacterCount merge(CharacterCount cc) {
            int index = (isIndexGreater(cc.index()) ? cc.index : this.index);
            int count = this.count() > cc.count ? this.count() + 1 : cc.count() + 1;
            char c = this.character();
            return new CharacterCount(c, index, count);
        }
    }
}