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

    private static String permute(HashMap<Character, Integer> frequencyMap, String current, int remaining) {
        if (remaining == 0) {
            System.out.println(current);
            return current;
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
        return "";
    }

    public static boolean isSamePermutationX(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> frequencyMap1 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> frequencyMap2 = new HashMap<>();
        for (char c : word2.toCharArray()) {
            frequencyMap2.put(c, frequencyMap2.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap1);
        System.out.println(frequencyMap2);
        String compare = removeRepetitiveChars(word1);
        String compare2 = removeRepetitiveChars(word2);
        if (compare.length() != compare2.length()) {
            return false;
        }
        for (int i = 0; i < compare.length(); i++) {
            if (frequencyMap1.containsKey(compare.charAt(i)) != frequencyMap2.containsKey(compare.charAt(i)))
                return false;
            frequencyMap1.remove(compare.charAt(i));
            frequencyMap2.remove(compare.charAt(i));

        }

        return true;
    }

    public static String removeRepetitiveChars(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}

