import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 3, 4));
        
        for (Integer k : arr) {
            hm.put(k, hm.getOrDefault(k, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
