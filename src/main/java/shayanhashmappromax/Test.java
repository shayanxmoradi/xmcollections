package shayanhashmappromax;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();


        XMHashMap<Integer, String> xmHashMap = new XMHashMap<>();
        System.out.println("is empty "+xmHashMap.isEmpty());
        xmHashMap.put(1,"shayan");
        xmHashMap.put(2,"asghar");
        System.out.println("is empty "+xmHashMap.isEmpty());

        System.out.println("map Values :"+xmHashMap);
        System.out.println(" map contains: "+xmHashMap.containsKey(1));
        System.out.println(" map contains :"+xmHashMap.containsKey(5));

        xmHashMap.replace(2,"hoomayon");
        System.out.println("map Values :"+xmHashMap);

    }
}
