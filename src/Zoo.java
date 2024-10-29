import java.util.HashMap;
import java.util.Map;

public class Zoo {
    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 6, 3, 4, 5};
        int[] arr = {1, 0, 2, 6, 3, 4, 5};
        int s = 5;
        Map<Integer, Integer> store = new HashMap<>();
        //sixth commit
        for (int i = 0; i < arr.length; i++) {
            
        }

        int minKey = store.keySet().stream().min(Integer::compareTo).get();
        System.out.println(store.get(minKey));
        //abc abc abc
        //commit new branch 2
    }
}