package shayanarraylist;

import java.util.ArrayList;

public class OrderedPair {

    public static ArrayList<Integer> removeUnOrderedPair(ArrayList<Integer> inputList) {
        if (inputList == null || inputList.size() == 0) {
            return inputList;
        }
        if (inputList.size() % 2 == 1) {
            inputList.removeLast();
        }
        System.out.println(inputList);


        for (int i = 1; i < inputList.size() + 1; i++) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.println("bfd " + inputList);
            System.out.println("size of liest" + inputList.size());
            System.out.println("under att i :" + i);
            System.out.println(inputList.get(i - 1));
            System.out.println(inputList.get(i - 2));
            if (inputList.get(i - 1) > inputList.get(i - 2)) {
                inputList.remove(i - 1);
                inputList.remove(i - 2);
                i = i - 2;
            }
            System.out.println("afd " + inputList);
            System.out.println();

        }

        return inputList;
    }
}
