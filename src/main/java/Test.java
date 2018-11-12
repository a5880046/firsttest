

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String args[]) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100; i++) {
            map.put(i, i);
        }
        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            System.out.println("key:" + a.getKey() + "value:" + a.getValue());
        }
        for (Integer j : map.keySet()) {
            System.out.println("key:" + j);
        }
        for (Integer o : map.values()) {
            System.out.println("value:" + o);
        }
    }
}
