package shayanhashmappromax;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.UnaryOperator;

public class XMHashMap <K ,V>{
    ArrayList<K> lisOfKeys= new ArrayList<>();
    ArrayList<V> listOfValues= new ArrayList<>();




    public void put(K key, V value) {
        lisOfKeys.add(key);
        listOfValues.add(value);
    }
    public V get(K key) {
        return listOfValues.get(lisOfKeys.indexOf(key));
    }
    public boolean containsKey(K key) {
        return lisOfKeys.contains(key);
    }
    public boolean containsValue(V value) {
        return listOfValues.contains(value);
    }
    public int size() {
        return lisOfKeys.size();
    }

    public void remove(K key) {
        listOfValues.remove(lisOfKeys.indexOf(key));
        lisOfKeys.remove(key);
    }
    public void replace(K key, V newValue) {
        int index = lisOfKeys.indexOf(key);
        if (index != -1) {
            listOfValues.set(index, newValue);
        }
    }
    public void clear() {
        lisOfKeys.clear();
        listOfValues.clear();
    }
    public boolean isEmpty() {
        return lisOfKeys.isEmpty() && listOfValues.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (K key : lisOfKeys) {
            sb.append(key.toString()).append(" -> ");
            sb.append(listOfValues.get(lisOfKeys.indexOf(key))).append("\t ,");
        }
   return sb.toString();
    }

}
