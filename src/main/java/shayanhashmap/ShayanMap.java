package shayanhashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ShayanMap {


    public static void generatePermutations(String word) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        permute(frequencyMap, "", word.length());
    }

    private static void permute(HashMap<Character, Integer> frequencyMap, String current, int remaining) {
        if (remaining == 0) {
            System.out.println(current);
            return;
        }

        for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (count > 0) {
                frequencyMap.put(c, count - 1);
                permute(frequencyMap, current + c, remaining - 1);
                frequencyMap.put(c, count);
            }
        }
    }
}
