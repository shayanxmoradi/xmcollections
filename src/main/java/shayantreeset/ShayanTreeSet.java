package shayantreeset;

import java.util.Random;
import java.util.TreeSet;

public class ShayanTreeSet {
    private TreeSet<Character> treeSet1 = new TreeSet<>();
    private TreeSet<Character> treeSet2 = new TreeSet<>();

    public ShayanTreeSet() {
        while (treeSet1.size() < 10) {
            treeSet1.add(generateRandomCharacter());
        }
        while (treeSet2.size() < 10) {
            treeSet2.add(generateRandomCharacter());
        }


    }
    public TreeSet<Character> findCommonChars(TreeSet<Character> treeSet1, TreeSet<Character> treeSet2)  {
        TreeSet<Character> commonChars = new TreeSet<>();
        for (Character character : treeSet1) {
            if (treeSet2.contains(character)) {
                commonChars.add(character);
            }
        }
        return commonChars;

    }
    public TreeSet<Character> findUnion(TreeSet<Character> treeSet1, TreeSet<Character> treeSet2)  {
        TreeSet<Character> commonChars = new TreeSet<>();
      for (Character character : treeSet1) {
          commonChars.add(character);
      } for (Character character : treeSet2) {
          commonChars.add(character);
      }

        return commonChars;

    }

    public char generateRandomCharacter() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(97, 122);
        char a = (char) randomNumber;
        return a;
    }

    public TreeSet<Character> getTreeSet1() {
        return treeSet1;
    }

    public TreeSet<Character> getTreeSet2() {
        return treeSet2;
    }
}
