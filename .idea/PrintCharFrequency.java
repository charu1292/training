    import java.util.*;

    public class PrintCharFrequency {

        public static void frequency(String s) {
            char[] A = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(A[i])) {
                    map.put(A[i], map.get(A[i]) + 1);
                } else {
                    map.put(A[i], 1);
                }
            }

            Map.Entry<Character, Integer> maxEntry = null;
            Map.Entry<Character, Integer> minEntry = null;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }

                if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0) {
                    minEntry = entry;
                }
            }

            assert maxEntry != null;
            Character maxKey = maxEntry.getKey();
            Integer maxValue = maxEntry.getValue();

            Character minKey = minEntry.getKey();
            Integer minValue = minEntry.getValue();

            System.out.println("Key with maximum value: " + maxKey + ", Value: " + maxValue);
            System.out.println("Key with minimum value: " + minKey + ", Value: " + minValue);
        }

        public static void main(String[] args) {
            String S = "grass is greener at other side";
            frequency(S);
        }
    }